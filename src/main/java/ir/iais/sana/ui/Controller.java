package ir.iais.sana.ui;

import ir.iais.sana.Main;
import ir.iais.sana.constant.StringConstants;
import ir.iais.sana.controller.SanaCoreServiceCaller;
import ir.iais.sana.controller.SanaDataController;
import ir.iais.sana.domain.sana.SanaRequestStatus;
import ir.iais.sana.domain.sana.Status;
import ir.iais.sana.services.PushSanaV5;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Window;
import javafx.util.Callback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.List;

public class Controller {

    private static final Logger logger = LogManager.getLogger(Controller.class);
    public ProgressBar progressBar;
    public Label label;
    public Button sanaButton;
    public TableView<SanaRequestStatus> table;
    public Button getRequestsButton;

    public void sendSanaData(ActionEvent actionEvent) {
        sanaButton.setDisable(true);
        try {
            Node source = (Node) actionEvent.getSource();
            Window stage = source.getScene().getWindow();
            final File sanaFile = UiComponent.getInstance().
                    getFileFromUser(stage, "لطفا فایل سنا خود را انتخاب کنید.");
            Thread convertAndSendingDataThread = SanaDataController.getInstance().
                    createThreadForCallingService(sanaFile, Main.portConfig, progressBar, label, sanaButton, 100, null);
            convertAndSendingDataThread.start();
        } catch (Exception e) {
            UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, "خطای داخلی رخ داده است.", Alert.AlertType.ERROR);
            logger.error(e, e);
            sanaButton.setDisable(false);
        }
    }

    public void getRequests(ActionEvent actionEvent) {
        try {
            getRequestsButton.setDisable(true);
            PushSanaV5 pushSanaPort = SanaCoreServiceCaller.getInstance().getPushSanaPort(Main.portConfig);
            List<SanaRequestStatus> requestsStatus = pushSanaPort.getRequestsStatus();
            table.getColumns().removeAll(table.getColumns());
            table.getItems().removeAll(table.getItems());
            table.getItems().addAll(requestsStatus);
            addSanaIdColumn();
            addStatusColumn();
            addDeleteColumn();
            addSendAgainColumn();
            UiComponent.getInstance().showAlert(StringConstants.SUCCESS_IN_ACTION, requestsStatus.size() + "تعداد درخواست های شما: ", Alert.AlertType.INFORMATION);
            getRequestsButton.setDisable(false);
        } catch (Exception e) {
            UiComponent.getInstance().showAlert(StringConstants.ERROR_IN_SENDING_INFORMATION, "خطای داخلی رخ داده است.", Alert.AlertType.ERROR);
            logger.error(e, e);
            getRequestsButton.setDisable(false);
        }
    }

    private void addSendAgainColumn() {
        TableColumn<SanaRequestStatus, Button> sendAgainColumn = new TableColumn<>();
        sendAgainColumn.setCellFactory(new Callback<TableColumn<SanaRequestStatus, Button>, TableCell<SanaRequestStatus, Button>>() {
            @Override
            public TableCell<SanaRequestStatus, Button> call(TableColumn<SanaRequestStatus, Button> param) {
                return new TableCell<SanaRequestStatus, Button>() {
                    @Override
                    protected void updateItem(Button item, boolean empty) {
                        super.updateItem(item, empty);
                        if (!empty) {
                            SanaRequestStatus sanaRequestStatus = table.getItems().get(getIndex());
                            if (sanaRequestStatus.getStatus().equals(Status.OPEN)) {
                                Button button = new Button("ارسال مجدد");
                                button.setOnAction(event -> {
                                    Node source = (Node) event.getSource();
                                    Window stage = source.getScene().getWindow();
                                    final File sanaFile = UiComponent.getInstance().
                                            getFileFromUser(stage, "لطفا فایل سنا خود را انتخاب کنید.");
                                    Thread convertAndSendingDataThread = SanaDataController.getInstance().
                                            createThreadForCallingService(sanaFile, Main.portConfig, progressBar, label, sanaButton, 100, sanaRequestStatus.getSanaId());
                                    convertAndSendingDataThread.start();
                                });
                                setGraphic(button);
                            } else {
                                setGraphic(null);
                            }
                        }
                    }
                };
            }
        });
        table.getColumns().add(sendAgainColumn);
    }

    private void addDeleteColumn() {
        TableColumn<SanaRequestStatus, Button> deleteColumn = new TableColumn<>();
        deleteColumn.setCellFactory(new Callback<TableColumn<SanaRequestStatus, Button>, TableCell<SanaRequestStatus, Button>>() {
            @Override
            public TableCell<SanaRequestStatus, Button> call(TableColumn<SanaRequestStatus, Button> param) {
                return new TableCell<SanaRequestStatus, Button>() {
                    @Override
                    protected void updateItem(Button item, boolean empty) {
                        super.updateItem(item, empty);
                        if (!empty) {
                            SanaRequestStatus sanaRequestStatus = table.getItems().get(getIndex());
                            if (sanaRequestStatus.getStatus().equals(Status.OPEN)) {
                                Button button = new Button("انصراف");
                                button.setOnAction(event -> {
                                    Thread convertAndSendingDataThread = SanaDataController.getInstance().
                                            cancelSanaRequest(Main.portConfig, sanaButton, sanaRequestStatus.getSanaId());
                                    convertAndSendingDataThread.start();
                                });
                                setGraphic(button);
                            } else {
                                setGraphic(null);
                            }
                        }
                    }
                };
            }
        });
        table.getColumns().add(deleteColumn);
    }

    private void addSanaIdColumn() {
        TableColumn<SanaRequestStatus, Label> sanaIdColumn = new TableColumn<>("شماره درخواست");
        sanaIdColumn.setCellFactory(new Callback<TableColumn<SanaRequestStatus, Label>, TableCell<SanaRequestStatus, Label>>() {
            @Override
            public TableCell<SanaRequestStatus, Label> call(TableColumn<SanaRequestStatus, Label> param) {
                return new TableCell<SanaRequestStatus, Label>() {
                    @Override
                    protected void updateItem(Label item, boolean empty) {
                        super.updateItem(item, empty);
                        if (!empty) {
                            SanaRequestStatus sanaRequestStatus = table.getItems().get(getIndex());
                            setGraphic(new Label(sanaRequestStatus.getSanaId().toString()));
                        }
                    }
                };
            }
        });
        table.getColumns().add(sanaIdColumn);
    }

    private void addStatusColumn() {
        TableColumn<SanaRequestStatus, Label> statusColumn = new TableColumn<>("وضعیت");
        statusColumn.setCellFactory(new Callback<TableColumn<SanaRequestStatus, Label>, TableCell<SanaRequestStatus, Label>>() {
            @Override
            public TableCell<SanaRequestStatus, Label> call(TableColumn<SanaRequestStatus, Label> param) {
                return new TableCell<SanaRequestStatus, Label>() {
                    @Override
                    protected void updateItem(Label item, boolean empty) {
                        super.updateItem(item, empty);
                        if (!empty) {
                            SanaRequestStatus sanaRequestStatus = table.getItems().get(getIndex());
                            setGraphic(new Label(sanaRequestStatus.getSanaId().toString()));
                            switch (sanaRequestStatus.getStatus()) {
                                case OPEN:
                                    setGraphic(new Label("باز"));
                                    break;
                                case FINISH:
                                    setGraphic(new Label("پایان"));
                                    break;
                                default:
                                    setGraphic(new Label("انصراف"));
                                    break;
                            }
                        }
                    }
                };
            }
        });
        table.getColumns().add(statusColumn);
    }
}
