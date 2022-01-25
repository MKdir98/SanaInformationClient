package ir.iais.sana.ui;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.nio.file.Paths;
import java.util.Optional;

public class UiComponent {

    private static final Logger logger = LogManager.getLogger(UiComponent.class);

    private static UiComponent uiComponentInstance;

    private UiComponent() {
    }

    public static UiComponent getInstance() {
        if (uiComponentInstance == null) {
            uiComponentInstance = new UiComponent();
        }
        return uiComponentInstance;
    }

    public <T extends TextField> String showDialogAndGetText(String description, Class<T> textFieldTypeClass) {
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle(description);

        ButtonType loginButtonType = new ButtonType("تایید", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(100);
        gridPane.setVgap(100);
        gridPane.setPadding(new Insets(20, 150, 10, 10));

        TextField password;
        try {
            password = textFieldTypeClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            logger.warn("can not create TextField with specified type. it replace with normal textField...");
            password = new TextField();
        }
        password.setPromptText(description);

        gridPane.add(password, 0, 0);
        dialog.getDialogPane().setContent(gridPane);

        TextField finalPassword = password;
        Platform.runLater(() -> finalPassword.requestFocus());

        TextField anotherFinalPassword1 = password;
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return anotherFinalPassword1.getText();
            }
            return null;
        });

        Optional<String> result = dialog.showAndWait();
        return result.get();
    }

    public File getFileFromUser(Window stage, String description) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle(description);
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        fileChooser.setInitialDirectory(new File(currentPath));
        return fileChooser.showOpenDialog(stage);
    }

    public void showAlert(String title, String description, Alert.AlertType alertType) {
        Platform.runLater(() -> {
            Alert alert = new Alert(alertType);
            alert.setHeight(200.0);
            alert.setWidth(200.0);
            alert.setTitle(title);
            alert.setContentText(description);
            alert.show();
        });
    }

    public void setProgressbarValue(ProgressBar progressBar, double value) {
        Platform.runLater(() -> progressBar.setProgress(value));
    }

    public void setLabelValue(Label label, String text) {
        Platform.runLater(() -> label.setText(text));
    }

    public void setButtonEnable(Button button) {
        Platform.runLater(() -> button.setDisable(false));
    }
}
