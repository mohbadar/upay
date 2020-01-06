package af.asr.virusscanner.exception;

public class VirusScannerException extends  RuntimeException {
    private static final long serialVersionUID = 1L;

    public VirusScannerException() {
        super();
    }

    public VirusScannerException(String errorCode, String errorMessage) {
        super(errorCode);
    }

    public VirusScannerException(String errorCode, String message, Throwable cause) {
        super( message);
    }
}