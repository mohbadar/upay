/**
 * 
 */
package af.asr.auditmanager.repository;

import af.asr.auditmanager.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface with data access and data modification functions on
 * {@link Audit}
 */
public interface AuditRepository extends JpaRepository<Audit, Long> {

}
