package ir.iais.sana.controller;

import ir.iais.sana.domain.PortConfig;
import ir.iais.sana.exception.CreatePortException;
import ir.iais.sana.exception.DomainException;
import ir.iais.sana.exception.SanaSecurityException;
import ir.iais.sana.services.PushSanaV5;
import ir.iais.sana.services.PushSanaV5Service;
import ir.iais.sana.util.CertificatePasswordCallbackHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.wss4j.common.crypto.JasyptPasswordEncryptor;
import org.apache.wss4j.common.crypto.Merlin;

import javax.xml.ws.BindingProvider;
import java.io.File;
import java.util.Properties;

public class SanaCoreServiceCaller {

    private static final Logger logger = LogManager.getLogger(SanaCoreServiceCaller.class);
    private static SanaCoreServiceCaller sanaCoreServiceCaller;

    private SanaCoreServiceCaller() {
    }

    public static SanaCoreServiceCaller getInstance() {
        if (sanaCoreServiceCaller == null) {
            sanaCoreServiceCaller = new SanaCoreServiceCaller();
        }
        return sanaCoreServiceCaller;
    }

    public PushSanaV5 getPushSanaPort(PortConfig portConfig) throws CreatePortException {
        try {
            PushSanaV5Service pushSanaV4Service = new PushSanaV5Service();
            PushSanaV5 pushSanaPort = pushSanaV4Service.getPushSanaV5Port();
            Merlin signatureMerlin = getSignatureMerlinProperties(portConfig.getKeyPairKeyStoreFile(),
                    portConfig.getKeyPairKeyStorePassword(), portConfig.getKeyPairPassword(), portConfig.getKeyPairIdentifier());
            Merlin encryptionMerlin = getEncryptionMerlinProperties(portConfig.getCertificateKeyStoreFile(), portConfig.getCertificateKeyStorePassword());
            java.util.Map<String, Object> ctx = ((BindingProvider) pushSanaPort).getRequestContext();
            ctx.put("security.signature.crypto", signatureMerlin);
            ctx.put("security.encryption.crypto", encryptionMerlin);
            ctx.put("ws-security.encryption.username", portConfig.getCertificateKeyStoreIdentifier());
            ctx.put("ws-security.asymmetric.signature.algorithm", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
            ctx.put("ws-security.callback-handler", new CertificatePasswordCallbackHandler(portConfig.getKeyPairPassword()));
            return pushSanaPort;
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new CreatePortException(ex.getMessage());
        }
    }

    private Merlin getEncryptionMerlinProperties(File certificateKeyStoreFile, String certificateKeyStorePassword) throws DomainException {
        try {
            Properties properties = new Properties();
            properties.setProperty("org.apache.ws.security.crypto.provider", "org.apache.ws.security.components.crypto.Merlin");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", "jks");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", certificateKeyStorePassword);
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.file", certificateKeyStoreFile.getAbsolutePath());
            return new Merlin(properties, this.getClass().getClassLoader(), new JasyptPasswordEncryptor("masterPassword"));
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new DomainException(ex.getMessage());
        }
    }

    private Merlin getSignatureMerlinProperties(File keyPairKeyStoreFile, String keyPairKeyStorePassword,
                                                String keyPairPassword, String keyPairIdentifier)
            throws SanaSecurityException {
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
            throw new SanaSecurityException(ex.getMessage());
        }
    }
}
