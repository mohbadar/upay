package af.asr.auditmanager.exception.auditmanager.spi;

/**
 * Interface with function to write AuditRequest
 */
public interface AuditHandler<T> {

	/**
	 * Function to write AuditRequest
	 * 
	 * @param auditRequest The AuditRequest
	 * @return true - if AuditRequest is successfully written
	 */
	boolean addAudit(T auditRequest);

}