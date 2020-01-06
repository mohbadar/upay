package af.asr.keycloak.infrastructure.util.enums;



public enum ErrorCodes {

    ERROR_CODE("API Error", "Error while establishing connection with Kafka");

    private final String code;
    private final String description;

    private ErrorCodes(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
