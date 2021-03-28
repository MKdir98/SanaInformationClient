package ir.iais.sana.ui;

import ir.iais.sana.constant.StringConstants;
import ir.iais.sana.controller.ServicePortController;
import ir.iais.sana.domain.SanamaInfo;
import ir.iais.sana.service.*;
import ir.iais.sana.util.DataUtil;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Window;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.List;

public class Controller {

    private static final Logger logger = LogManager.getLogger(Controller.class);
    public ProgressBar progressBar;
    public Label label;
    public Button button;

    public void sendData(ActionEvent actionEvent) {
        button.setDisable(true);
        try {
            Node source = (Node) actionEvent.getSource();
            Window stage = source.getScene().getWindow();
            PushSana pushSanaPort = ServicePortController.getInstance().getPushSanaPort(stage);
            final File sanamaFile = UiComponent.getInstance().
                    getFileFromUser(stage, "لطفا فایل سناما خود را انتخاب کنید.");
            Thread convertAndSendingDataThread = createThreadForCallingService(sanamaFile, pushSanaPort);
            convertAndSendingDataThread.start();
        } catch (Exception e) {
            UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, "خطای داخلی رخ داده است.", Alert.AlertType.ERROR);
            logger.error(e, e);
            button.setDisable(false);
        }
    }


    private Thread createThreadForCallingService(File sanamaFile, PushSana pushSanaPort) {
        return new Thread(() -> {
            try {
                SanamaInfo sanamaInfo = DataUtil.getInstance().convertXmlSanamaFileToSanamaInfoObject(sanamaFile);
                byte[] sanamaInfoBytes = DataUtil.getInstance().convertSanamaInfoObjectToArrayBytes(sanamaInfo);
                long id = System.currentTimeMillis();
                List<DataPart> dataParts = DataUtil.getInstance().convertSanamaInfoBytesToDataParts(sanamaInfoBytes, id);
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
}
