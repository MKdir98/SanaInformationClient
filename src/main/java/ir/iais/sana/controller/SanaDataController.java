package ir.iais.sana.controller;

import ir.iais.sana.domain.sana.SanaInfo;
import ir.iais.sana.exceptions.CreateDataObjectException;
import ir.iais.sana.util.DataUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class SanaDataController extends AbstractDataController<SanaInfo> {

    private static final Logger logger = LogManager.getLogger(SanaDataController.class);
    private static SanaDataController sanaDataControllerInstance;

    private SanaDataController() {
    }

    public static SanaDataController getInstance() {
        if (sanaDataControllerInstance == null) {
            sanaDataControllerInstance = new SanaDataController();
        }
        return sanaDataControllerInstance;
    }

    @Override
    public SanaInfo convertDataFileToDataObject(File dataFile) throws CreateDataObjectException {
        try {
            return DataUtil.getInstance().convertSanaExcelToSanaSanaDataObject(dataFile);
        } catch (IOException e) {
            logger.error(e, e);
            throw new CreateDataObjectException(e.getMessage());
        }
    }
}
