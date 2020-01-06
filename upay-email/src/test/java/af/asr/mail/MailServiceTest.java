package af.asr.mail;


import af.asr.mail.service.MailBuilder;
import af.asr.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class MailServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(MailServiceTest.class);

	@Autowired
	private MailService mailService;

	@Test
	public void sendSample() {
		try {
			MailBuilder
					mailBuilder = new MailBuilder();
			mailBuilder.setSubject("Test Mail");
			mailBuilder.appendToText("<p>For <b>Test</b> Purpose</p>");
			mailBuilder.setFrom("sender@mail.com");
			mailBuilder.addTo("receiver@mail.com");

			String attachmentPath = "/data/mail-sender/dummy.txt";
			String attachmentName = "changed_name.txt";
			boolean attachmentAdded = mailBuilder.addAttachment(attachmentPath, attachmentName);

			if (attachmentAdded) {
				mailService.send(mailBuilder);
			}

		} catch (Exception e) {
			logger.error("Failed to send mail", e);
		}
	}

}
