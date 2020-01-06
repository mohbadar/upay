package af.asr.auditmanager.util.constant;

/**
 * Constants for Audit Manager
 */
public enum AuditErrorCodes {
	HANDLEREXCEPTION("KER-AUD-001", "Invalid Audit Request. Required parameters must be present"),

	INVALIDFORMAT("KER-AUD-002", "Invalid Audit Request. Format is incorrect. (For timestamp, use UTC format)");

	private final String errorCode;
	private final String errorMessage;

	private AuditErrorCodes(final String errorCode, final String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
