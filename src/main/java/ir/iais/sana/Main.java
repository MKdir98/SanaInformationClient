package ir.iais.sana;

import ir.iais.sana.domain.PortConfig;
import ir.iais.sana.ui.Controller;
import ir.iais.sana.ui.UiComponent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;

public class Main extends Application {

    public static PortConfig portConfig;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        primaryStage.setTitle("پنجره ارسال اطلاعات");
        portConfig = getPortConfig(primaryStage);
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }

    private static PortConfig getPortConfig(Window stage) {
        File certificateKeyStoreFile = new File(Controller.class.getResource("/sanama-trust.jks").getFile());
        String certificateKeyStorePassword = "password";
        String certificateKeyStoreIdentifier = "sanama.ir";
        File keyPairKeyStoreFile = UiComponent.getInstance().
                getFileFromUser(stage, "لطفا صندوق کلیدی که زوج کلید سازمان در آن قرار دارد را انتخاب کنید.");
        String keyPairKeyStorePassword = UiComponent.getInstance().
                showDialogAndGetText("لطفا گذرواژه صندوق کلیدی که زوج کلید سازمان در آن قرار دارد را وارد نمایید.", PasswordField.class);
        String keyPairIdentifier = UiComponent.getInstance().
                showDialogAndGetText("لطفا identifier زوج کلید سازمان را وارد نمایید.", TextField.class);
        String keyPairPassword = UiComponent.getInstance().
                showDialogAndGetText("لطفا گذرواژه زوج کلید سازمان را وارد نمایید.", PasswordField.class);
        return new PortConfig(keyPairKeyStoreFile, keyPairKeyStorePassword, keyPairPassword, keyPairIdentifier,
                certificateKeyStoreFile, certificateKeyStorePassword, certificateKeyStoreIdentifier);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
