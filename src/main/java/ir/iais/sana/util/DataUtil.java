package ir.iais.sana.util;

import com.google.gson.Gson;
import ir.iais.sana.domain.SanamaInfo;
import ir.iais.sana.service.DataPart;
import org.apache.commons.lang3.SerializationUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    private static DataUtil dataUtilInstance;


    private DataUtil() {
    }

    public static DataUtil getInstance() {
        if (dataUtilInstance == null) {
            dataUtilInstance = new DataUtil();
        }
        return dataUtilInstance;
    }

    public SanamaInfo convertXmlSanamaFileToSanamaInfoObject(File sanamaFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(SanamaInfo.class);;
        Unmarshaller jaxbUnmarshal = jaxbContext.createUnmarshaller();
        return (SanamaInfo) jaxbUnmarshal.unmarshal(sanamaFile);
    }

    public byte[] convertSanamaInfoObjectToArrayBytes(SanamaInfo sanamaInfo) {
        return SerializationUtils.serialize(new Gson().toJson(sanamaInfo));
    }

    public List<DataPart> convertSanamaInfoBytesToDataParts(byte[] sanamaInfoBytes, long id) {
        List<DataPart> dataParts = new ArrayList<>();
        int packetSize = 500000;
        int number = sanamaInfoBytes.length / packetSize + 1;
        for (int i = 0; i < number; i++) {
            byte[] splitData;
            if (i == number - 1) {
                splitData = new byte[sanamaInfoBytes.length - i * packetSize];
                System.arraycopy(sanamaInfoBytes, i * packetSize, splitData, 0, sanamaInfoBytes.length - i * packetSize);
            } else {
                splitData = new byte[packetSize];
                System.arraycopy(sanamaInfoBytes, i * packetSize, splitData, 0, packetSize);
            }
            DataPart dataPart = new DataPart();
            dataPart.setData(splitData);
            dataPart.setId(id);
            dataPart.setIndex(i);
            dataParts.add(dataPart);
        }
        return dataParts;
    }
}
