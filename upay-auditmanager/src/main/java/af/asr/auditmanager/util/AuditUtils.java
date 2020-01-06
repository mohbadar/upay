package af.asr.auditmanager.util;

import af.asr.auditmanager.exception.auditmanager.exception.AuditManagerException;
import af.asr.auditmanager.request.AuditRequestDto;
import af.asr.auditmanager.util.constant.AuditErrorCodes;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Utility class for Audit Manager
 *
 */
public class AuditUtils {

	/**
	 * Private constructor for AuditUtils
	 */
	private AuditUtils() {

	}

	/**
	 * Function to validate {@link AuditRequestDto}
	 * 
	 * @param auditRequest The audit request
	 */
	public static void validateAuditRequest(AuditRequestDto auditRequest) {
		ValidatorFactory factory = null;
		try {
			factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();

			Set<ConstraintViolation<AuditRequestDto>> violations = validator.validate(auditRequest);

			if (!violations.isEmpty()) {
				throw new AuditManagerException(AuditErrorCodes.HANDLEREXCEPTION.getErrorCode(),
						AuditErrorCodes.HANDLEREXCEPTION.getErrorMessage());
			}
		} finally {
			if (factory != null) {
				factory.close();
			}
		}
	}
}
