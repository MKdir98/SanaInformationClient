package ir.iais.sana.controller;

import ir.iais.sana.domain.sanama.SanamaInfo;
import ir.iais.sana.exceptions.CreateDataObjectException;
import ir.iais.sana.util.DataUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBException;
import java.io.File;

public class SanamaDataController extends AbstractDataController<SanamaInfo> {

    private static final Logger logger = LogManager.getLogger(SanamaDataController.class);
    private static SanamaDataController sanamaDataControllerInstance;

    private SanamaDataController() {
    }

    public static SanamaDataController getInstance() {
        if (sanamaDataControllerInstance == null) {
            sanamaDataControllerInstance = new SanamaDataController();
        }
        return sanamaDataControllerInstance;
    }

    @Override
    public SanamaInfo convertDataFileToDataObject(File dataFile) throws CreateDataObjectException {
        try {
            return DataUtil.getInstance().convertXmlSanamaFileToSanamaDataObject(dataFile);
        } catch (JAXBException e) {
            logger.error(e, e);
            throw new CreateDataObjectException(e.getMessage());
        }
    }
}
