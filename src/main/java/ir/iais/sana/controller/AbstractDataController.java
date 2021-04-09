package ir.iais.sana.controller;

import ir.iais.sana.SanaCore;
import ir.iais.sana.constant.StringConstants;
import ir.iais.sana.domain.service.PortConfig;
import ir.iais.sana.exceptions.CreateDataObjectException;
import ir.iais.sana.service.*;
import ir.iais.sana.ui.UiComponent;
import ir.iais.sana.util.DataUtil;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.List;

public abstract class AbstractDataController<T> {

    private static final Logger logger = LogManager.getLogger(AbstractDataController.class);

    public Thread createThreadForCallingService(File dataFile, PortConfig portConfig, ProgressBar progressBar, Label label, Button button) {
        return new Thread(() -> {
            try {
                T dataObject = convertDataFileToDataObject(dataFile);
                byte[] dataBytes = DataUtil.getInstance().convertDataObjectToArrayBytes(dataObject);
                long id = System.currentTimeMillis();
                List<DataPart> dataParts = DataUtil.getInstance().convertDataBytesToDataParts(dataBytes, id);
                PushSana pushSanaPort = SanaCore.getInstance().getPushSanaPort(portConfig);
                long resultId = sendDataParts(id, dataParts, pushSanaPort, 0, progressBar, label);
                UiComponent.getInstance().showAlert(StringConstants.SUCCESS_IN_SENDING_INFORMATION, resultId + "شناسه پیگیری", Alert.AlertType.INFORMATION);
                UiComponent.getInstance().setButtonEnable(button);
            } catch (DataTypeNotSupportedExceptionException e) {
                UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, "نوع داده ی ارسالی پشتیبانی نمی شود.", Alert.AlertType.ERROR);
                UiComponent.getInstance().setButtonEnable(button);
            } catch (DomainExceptionException e) {
                UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, e.getMessage(), Alert.AlertType.ERROR);
                UiComponent.getInstance().setButtonEnable(button);
            } catch (Exception e) {
                UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, "خطای داخلی رخ داده است.", Alert.AlertType.ERROR);
                logger.error(e, e);
                UiComponent.getInstance().setButtonEnable(button);
            }
        });
    }

    private long sendDataParts(long id, List<DataPart> dataParts, PushSana pushSanaPort,
                               int index, ProgressBar progressBar, Label label)
            throws DataTypeNotSupportedExceptionException, DomainExceptionException {
        while (index < dataParts.size()) {
            try {
                index = (int) pushSanaPort.send(dataParts.get(index));
                UiComponent.getInstance().setProgressbarValue(progressBar, index * 1.0 / dataParts.size());
            } catch (Exception e) {
                logger.error(e, e);
                UiComponent.getInstance().setLabelValue(label, e.getMessage());
            }
        }
        try {
            return pushSanaPort.verify(id, dataParts.size(), DataType.SANAMA.value());
        } catch (MisMatchIndexExceptionException e) {
            UiComponent.getInstance().setLabelValue(label, e.getFaultInfo().getIndex() + " should be send...");
            return sendDataParts(id, dataParts, pushSanaPort, e.getFaultInfo().getIndex(), progressBar, label);
        } catch (DataTypeNotSupportedExceptionException | DomainExceptionException e) {
            throw e;
        } catch (Exception e) {
            logger.error(e, e);
            UiComponent.getInstance().setLabelValue(label, e.getMessage());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            return sendDataParts(id, dataParts, pushSanaPort, dataParts.size(), progressBar, label);
        }
    }

    public abstract T convertDataFileToDataObject(File dataFile) throws CreateDataObjectException;
}
