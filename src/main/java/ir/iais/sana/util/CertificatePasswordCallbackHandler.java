package ir.iais.sana.util;


import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;

public class CertificatePasswordCallbackHandler implements CallbackHandler {

    private String password;

    public CertificatePasswordCallbackHandler(String password) {
        this.password = password;
    }

    public void handle(Callback[] callbacks) {
        for (Callback callback : callbacks) {
            WSPasswordCallback passwordCallback = (WSPasswordCallback) callback;
            passwordCallback.setPassword(password);
        }
    }
}