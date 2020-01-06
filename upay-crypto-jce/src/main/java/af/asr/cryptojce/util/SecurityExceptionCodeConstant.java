package af.asr.cryptojce.util;

public enum SecurityExceptionCodeConstant {
    PHOENIX_INVALID_KEY_EXCEPTION("KER-FSE-001",
            "invalid Key (key is null or empty or has invalid encoding, wronglength, and uninitialized, etc)."),
    PHOENIX_INVALID_DATA_LENGTH_EXCEPTION("KER-FSE-002", "check input data length"),
    PHOENIX_INVALID_DATA_EXCEPTION("KER-FSE-003", "data not valid (currupted,length is not valid etc.)"),
    PHOENIX_INVALID_ENCRYPTED_DATA_CORRUPT_EXCEPTION("KER-FSE-004", "encrypted data is corrupted"),
    PHOENIX_INVALID_DATA_SIZE_EXCEPTION("KER-FSE-005", "ecrypted data size is not valid"),
    PHOENIX_NULL_DATA_EXCEPTION("KER-FSE-006", "data is null or length is 0"),
    PHOENIX_NULL_METHOD_EXCEPTION("KER-FSE-007", "PHOENIX security method is null"),
    PHOENIX_NO_SUCH_ALGORITHM_EXCEPTION("KER-FSE-008", "no such algorithm"),
    PHOENIX_INVALID_PARAM_SPEC_EXCEPTION("KER-FSE-009", "invalid param spec"),
    PHOENIX_SIGNATURE_EXCEPTION("KER-FSE-010", "invalid signature, maybe null or empty"),
    SALT_PROVIDED_IS_NULL_OR_EMPTY("KER-FSE-011", "salt provided is null or empty");

    /**
     * Constant {@link Enum} errorCode
     */
    private final String errorCode;

    /**
     * Getter for errorMessage
     *
     * @return get errorMessage value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Constant {@link Enum} errorMessage
     */
    private final String errorMessage;

    /**
     * Constructor for this class
     *
     * @param value set {@link Enum} value
     */
    private SecurityExceptionCodeConstant(final String errorCode, final String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Getter for errorCode
     *
     * @return get errorCode value
     */
    public String getErrorCode() {
        return errorCode;
    }
}
