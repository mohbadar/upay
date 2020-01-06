package af.asr.cryptojce.util;

import af.asr.cryptojce.exception.crypto.exception.InvalidDataException;
import af.asr.cryptojce.exception.crypto.exception.NullDataException;

public class CryptoUtils {

    /**
     * Constructor for this class
     */
    private CryptoUtils() {

    }

    /**
     * Verify if data is null or empty
     *
     * @param      <T>
     *
     * @param data data provided by user
     */
    public static void verifyData(byte[] data) {
        if (data == null) {
            throw new NullDataException(SecurityExceptionCodeConstant.PHOENIX_NULL_DATA_EXCEPTION.getErrorCode(),
                    SecurityExceptionCodeConstant.PHOENIX_NULL_DATA_EXCEPTION.getErrorMessage());
        } else if (data.length == 0) {
            throw new InvalidDataException(SecurityExceptionCodeConstant.PHOENIX_NULL_DATA_EXCEPTION.getErrorCode(),
                    SecurityExceptionCodeConstant.PHOENIX_NULL_DATA_EXCEPTION.getErrorMessage());
        }
    }

    /**
     * Verify if data is null or empty
     *
     * @param data data provided by user
     */
    public static void verifyData(byte[] data, String errorCode, String message) {
        if (data == null) {
            throw new NullDataException(errorCode, message);
        } else if (data.length == 0) {
            throw new InvalidDataException(errorCode, message);
        }
    }
}
