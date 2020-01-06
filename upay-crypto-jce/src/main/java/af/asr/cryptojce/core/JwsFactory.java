package af.asr.cryptojce.core;

import af.asr.cryptojce.exception.crypto.spi.JwsSpec;
import af.asr.cryptojce.util.JWSValidation;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class JwsFactory {
    public JwsSpec<String, String , X509Certificate,PrivateKey> getJWS(){
        return new JWSValidation();
    }
}
