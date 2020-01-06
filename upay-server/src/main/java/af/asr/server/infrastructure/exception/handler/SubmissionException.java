package af.asr.server.infrastructure.exception.handler;

public class SubmissionException extends Exception {

    public SubmissionException(String msg) {
        super(msg);
    }

    public SubmissionException(Throwable e) {
        super(e);
    }
}
