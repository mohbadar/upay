package af.asr.auditmanager.impl;

import af.asr.auditmanager.entity.Audit;
import af.asr.auditmanager.exception.auditmanager.spi.AuditHandler;
import af.asr.auditmanager.repository.AuditRepository;
import af.asr.auditmanager.request.AuditRequestDto;
import af.asr.auditmanager.util.AuditUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of {@link AuditHandler} with function to write
 */
@Service
public class AuditHandlerImpl implements AuditHandler<AuditRequestDto> {

	/**
	 * Field for {@link AuditRepository} having data access operations related to
	 * audit
	 */
	@Autowired
	private AuditRepository auditRepository;

	/**
	 * Field for {@link ModelMapper} for performing object mapping
	 */
	@Autowired
	private ModelMapper modelMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.mosip.kernel.core.audit.handler.AuditHandler#writeAudit(io.mosip.kernel.
	 * core.audit.dto.AuditRequest)
	 */
	@Override
	public boolean addAudit(AuditRequestDto auditRequest) {

		AuditUtils.validateAuditRequest(auditRequest);

		Audit event = modelMapper.map(auditRequest, Audit.class);
		auditRepository.save(event);
		return true;
	}

}
