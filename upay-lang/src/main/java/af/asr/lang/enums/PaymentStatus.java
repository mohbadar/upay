package af.asr.lang.enums;

public enum PaymentStatus {

    ON_HOLD("ON_HOLD"),
    EXPIRED("EXPIRED"),
    PROCESSED("PROCESSED"),
    CANCELED("CANCELED"),

    ;

    private String text;

    PaymentStatus(final String text)
    {
        this.text =text;
    }

    @Override
    public String toString() {
        return text;
    }


}
