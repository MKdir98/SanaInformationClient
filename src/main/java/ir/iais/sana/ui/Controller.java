package ir.iais.sana.ui;

import ir.iais.sana.constant.StringConstants;
import ir.iais.sana.controller.SanaDataController;
import ir.iais.sana.controller.SanamaDataController;
import ir.iais.sana.domain.service.PortConfig;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Window;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class Controller {

    private static final Logger logger = LogManager.getLogger(Controller.class);
    public ProgressBar progressBar;
    public Label label;
    public Button sanamaButton;
    public Button sanaButton;

    public void sendSanamaData(ActionEvent actionEvent) {
        sanamaButton.setDisable(true);
        try {
            Node source = (Node) actionEvent.getSource();
            Window stage = source.getScene().getWindow();
            PortConfig portConfig = getPortConfig(stage);
            final File sanamaFile = UiComponent.getInstance().
                    getFileFromUser(stage, "لطفا فایل سناما خود را انتخاب کنید.");
            Thread convertAndSendingDataThread = SanamaDataController.getInstance().
                    createThreadForCallingService(sanamaFile, portConfig, progressBar, label, sanamaButton);
            convertAndSendingDataThread.start();
        } catch (Exception e) {
            UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, "خطای داخلی رخ داده است.", Alert.AlertType.ERROR);
            logger.error(e, e);
            sanamaButton.setDisable(false);
        }
    }


    private PortConfig getPortConfig(Window stage) {
        File keyPairKeyStoreFile = UiComponent.getInstance().
                getFileFromUser(stage, "لطفا صندوق کلیدی که زوج کلید سازمان در آن قرار دارد را انتخاب کنید.");
        String keyPairKeyStorePassword = UiComponent.getInstance().
                showDialogAndGetText("لطفا گذرواژه صندوق کلیدی که زوج کلید سازمان در آن قرار دارد را وارد نمایید.", PasswordField.class);
        String keyPairIdentifier = UiComponent.getInstance().
                showDialogAndGetText("لطفا identifier زوج کلید سازمان را وارد نمایید.", TextField.class);
        String keyPairPassword = UiComponent.getInstance().
                showDialogAndGetText("لطفا گذرواژه زوج کلید سازمان را وارد نمایید.", PasswordField.class);
        File certificateKeyStoreFile = UiComponent.getInstance().
                getFileFromUser(stage, "لطفا صندوق کلیدی که گواهینامه ی بستر یکپارچه سازی تبادل اطلاعات در آن قرار دارد را انتخاب کنید.");
        String certificateKeyStorePassword = UiComponent.getInstance().
                showDialogAndGetText("لطفا گذرواژه صندوق کلیدی که گواهینامه ی بستر یکپارچه سازی تبادل اطلاعات در آن قرار دارد را وارد نمایید.", PasswordField.class);
        String certificateKeyStoreIdentifier = UiComponent.getInstance().
                showDialogAndGetText("لطفا identifier صندوق کلیدی که گواهینامه ی بستر یکپارچه سازی تبادل اطلاعات در آن قرار دارد را وارد نمایید.", TextField.class);
        return new PortConfig(keyPairKeyStoreFile, keyPairKeyStorePassword, keyPairPassword, keyPairIdentifier,
                certificateKeyStoreFile, certificateKeyStorePassword, certificateKeyStoreIdentifier);
    }

    public void sendSanaData(ActionEvent actionEvent) {
        sanaButton.setDisable(true);
        try {
            Node source = (Node) actionEvent.getSource();
            Window stage = source.getScene().getWindow();
            PortConfig portConfig = getPortConfig(stage);
            final File sanamaFile = UiComponent.getInstance().
                    getFileFromUser(stage, "لطفا فایل سنا خود را انتخاب کنید.");
            Thread convertAndSendingDataThread = SanaDataController.getInstance().
                    createThreadForCallingService(sanamaFile, portConfig, progressBar, label, sanaButton);
            convertAndSendingDataThread.start();
        } catch (Exception e) {
            UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, "خطای داخلی رخ داده است.", Alert.AlertType.ERROR);
            logger.error(e, e);
            sanaButton.setDisable(false);
        }
    }
}
