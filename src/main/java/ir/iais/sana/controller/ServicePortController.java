package ir.iais.sana.controller;

import ir.iais.sana.exception.CreatePortException;
import ir.iais.sana.service.PushSana;
import ir.iais.sana.service.PushSanaService;
import ir.iais.sana.ui.UiComponent;
import ir.iais.sana.util.CertificatePasswordCallbackHandler;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.wss4j.common.crypto.JasyptPasswordEncryptor;
import org.apache.wss4j.common.crypto.Merlin;

import javax.xml.ws.BindingProvider;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class ServicePortController {


    private static final Logger logger = LogManager.getLogger(ServicePortController.class);

    private static ServicePortController servicePortControllerInstance;

    private ServicePortController() {
    }

    public static ServicePortController getInstance() {
        if (servicePortControllerInstance == null) {
            servicePortControllerInstance = new ServicePortController();
        }
        return servicePortControllerInstance;
    }

    public PushSana getPushSanaPort(Window stage) throws CreatePortException {
        try {
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
            PushSanaService pushSanaV4Service = new PushSanaService();
            PushSana pushSanaPort = pushSanaV4Service.getPushSanaPort();
            Merlin signatureMerlin = getSignatureMerlinProperties(keyPairKeyStoreFile, keyPairKeyStorePassword, keyPairPassword, keyPairIdentifier);
            Merlin encryptionMerlin = getEncryptionMerlinProperties(certificateKeyStoreFile, certificateKeyStorePassword);
            java.util.Map<String, Object> ctx = ((BindingProvider) pushSanaPort).getRequestContext();
            ctx.put("security.signature.crypto", signatureMerlin);
            ctx.put("security.encryption.crypto", encryptionMerlin);
            ctx.put("ws-security.encryption.username", certificateKeyStoreIdentifier);
            ctx.put("ws-security.asymmetric.signature.algorithm", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
            ctx.put("ws-security.callback-handler", new CertificatePasswordCallbackHandler(keyPairPassword));
            return pushSanaPort;
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new CreatePortException(ex.getMessage());
        }
    }

    private Merlin getEncryptionMerlinProperties(File certificateKeyStoreFile, String certificateKeyStorePassword) throws IOException {
        try {
            Properties properties = new Properties();
            properties.setProperty("org.apache.ws.security.crypto.provider", "org.apache.ws.security.components.crypto.Merlin");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", "jks");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", certificateKeyStorePassword);
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.file", certificateKeyStoreFile.getAbsolutePath());
            return new Merlin(properties, this.getClass().getClassLoader(), new JasyptPasswordEncryptor("masterPassword"));
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new SecurityException();
        }
    }

    private Merlin getSignatureMerlinProperties(File keyPairKeyStoreFile, String keyPairKeyStorePassword,
                                                String keyPairPassword, String keyPairIdentifier)
            throws SecurityException {
        try {
            Properties properties = new Properties();
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.private.password", keyPairPassword);
            properties.setProperty("org.apache.ws.security.crypto.provider", "org.apache.ws.security.components.crypto.Merlin");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", "jks");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", keyPairKeyStorePassword);
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.file", keyPairKeyStoreFile.getAbsolutePath());
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.alias", keyPairIdentifier);
            return new Merlin(properties, this.getClass().getClassLoader(), new JasyptPasswordEncryptor("masterPassword"));
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new SecurityException();
        }
    }
}
