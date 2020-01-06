package af.asr.lang.enums;

public enum PaymentRequestAction {

    BALANCE_INQUIRY("BALANCE_INQUIRY"),
    FUND_TRANSFER("FUND_TRANSFER"),
    BILL_PAYMENT("BILL_PAYMENT"),
    PURCHASE("PURCHASE"),
    ;

    private String text;

    PaymentRequestAction(final String text)
    {
        this.text =text;
    }

    @Override
    public String toString() {
        return text;
    }


}
