/*
 * 
 * 
 * 
 * 
 */
package af.asr.cryptosignature.exception.crypto.exception;


import af.asr.cryptosignature.exception.common.BaseUncheckedException;

/**
 * {@link Exception} to be thrown when params are invalid
 * 

 */
public class SignatureException extends BaseUncheckedException {

	/**
	 * Unique id for serialization
	 */
	private static final long serialVersionUID = 1650218542197755276L;

	/**
	 * Constructor with errorCode and errorMessage
	 * 
	 * @param errorCode    The error code for this exception
	 * @param errorMessage The error message for this exception
	 */
	public SignatureException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

	/**
	 * Constructor with errorCode, errorMessage, and rootCause
	 * 
	 * @param errorCode    The error code for this exception
	 * @param errorMessage The error message for this exception
	 * @param rootCause    Cause of this exception
	 */
	public SignatureException(String errorCode, String errorMessage, Throwable rootCause) {
		super(errorCode, errorMessage, rootCause);
	}

}
