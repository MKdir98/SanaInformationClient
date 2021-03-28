package ir.iais.sana.controller;

import ir.iais.sana.service.DataPart;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class DataPartController {

    private static DataPartController dataPartControllerInstance;
    private static final Logger logger = LogManager.getLogger(DataPartController.class);

    private DataPartController() {
    }

    public static DataPartController getInstance() {
        if (dataPartControllerInstance == null) {
            dataPartControllerInstance = new DataPartController();
        }
        return dataPartControllerInstance;
    }

    public void sendAndVerifyDataParts(List<DataPart> dataParts) {

    }
}
