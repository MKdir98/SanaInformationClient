package ir.iais.sana.domain;

import java.io.File;

public class PortConfig {
    private File keyPairKeyStoreFile;
    private String keyPairKeyStorePassword;
    private String keyPairPassword;
    private String keyPairIdentifier;
    private File certificateKeyStoreFile;
    private String certificateKeyStorePassword;
    private String certificateKeyStoreIdentifier;

    public PortConfig(File keyPairKeyStoreFile, String keyPairKeyStorePassword, String keyPairPassword,
                      String keyPairIdentifier, File certificateKeyStoreFile, String certificateKeyStorePassword,
                      String certificateKeyStoreIdentifier) {
        this.keyPairKeyStoreFile = keyPairKeyStoreFile;
        this.keyPairKeyStorePassword = keyPairKeyStorePassword;
        this.keyPairPassword = keyPairPassword;
        this.keyPairIdentifier = keyPairIdentifier;
        this.certificateKeyStoreFile = certificateKeyStoreFile;
        this.certificateKeyStorePassword = certificateKeyStorePassword;
        this.certificateKeyStoreIdentifier = certificateKeyStoreIdentifier;
    }

    public File getKeyPairKeyStoreFile() {
        return keyPairKeyStoreFile;
    }

    public String getKeyPairKeyStorePassword() {
        return keyPairKeyStorePassword;
    }

    public String getKeyPairPassword() {
        return keyPairPassword;
    }

    public String getKeyPairIdentifier() {
        return keyPairIdentifier;
    }

    public File getCertificateKeyStoreFile() {
        return certificateKeyStoreFile;
    }

    public String getCertificateKeyStorePassword() {
        return certificateKeyStorePassword;
    }

    public String getCertificateKeyStoreIdentifier() {
        return certificateKeyStoreIdentifier;
    }
}
