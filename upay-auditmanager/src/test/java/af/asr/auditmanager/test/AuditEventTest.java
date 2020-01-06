package af.asr.auditmanager.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;

import af.asr.auditmanager.builder.AuditRequestBuilder;
import af.asr.auditmanager.config.AuditConfig;
import af.asr.auditmanager.entity.Audit;
import af.asr.auditmanager.exception.auditmanager.exception.AuditManagerException;
import af.asr.auditmanager.impl.AuditHandlerImpl;
import af.asr.auditmanager.repository.AuditRepository;
import af.asr.auditmanager.request.AuditRequestDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuditConfig.class)
public class AuditEventTest {

	@Autowired
	private AuditHandlerImpl auditHandlerImpl;

	@MockBean
	private AuditRepository auditRepository;

	@Test
	public void auditBuilderTest() {

		Mockito.when(auditRepository.save(ArgumentMatchers.any(Audit.class))).thenReturn(new Audit());

		AuditRequestBuilder auditRequestBuilder = new AuditRequestBuilder();

		auditRequestBuilder.setActionTimeStamp(LocalDateTime.now()).setApplicationId("applicationId")
				.setApplicationName("applicationName").setCreatedBy("createdBy").setDescription("description")
				.setEventId("eventId").setEventName("eventName").setEventType("eventType").setHostIp("hostIp")
				.setHostName("hostName").setId("id").setIdType("idType").setModuleId("moduleId")
				.setModuleName("moduleName").setSessionUserId("sessionUserId").setSessionUserName("sessionUserName");

		AuditRequestDto auditRequest = auditRequestBuilder.build();
		auditHandlerImpl.addAudit(auditRequest);

		assertThat(auditHandlerImpl.addAudit(auditRequestBuilder.build()), is(true));
	}

	@Test(expected = AuditManagerException.class)
	public void auditBuilderExceptionTest() {

		Mockito.when(auditRepository.save(ArgumentMatchers.any(Audit.class))).thenReturn(new Audit());

		AuditRequestBuilder auditRequestBuilder = new AuditRequestBuilder();

		auditRequestBuilder.setApplicationId("applicationId").setApplicationName("applicationName")
				.setCreatedBy("createdBy").setDescription("description").setEventId("eventId").setEventName("eventName")
				.setEventType("eventType").setHostIp("hostIp").setHostName("hostName").setId("id").setIdType("idType")
				.setModuleId("moduleId").setModuleName("moduleName").setSessionUserId("sessionUserId")
				.setSessionUserName("sessionUserName");

		AuditRequestDto auditRequest = auditRequestBuilder.build();
		auditHandlerImpl.addAudit(auditRequest);

	}

}