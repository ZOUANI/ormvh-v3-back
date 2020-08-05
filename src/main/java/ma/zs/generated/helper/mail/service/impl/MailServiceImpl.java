
package ma.zs.generated.helper.mail.service.impl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import ma.zs.generated.helper.mail.service.facade.MailService;


@Service
public class MailServiceImpl implements MailService {
	@Autowired
	private Environment env;
	@Autowired
	private JavaMailSender emailSender;

	public void sendSimpleMail(String to, String subject, String content) throws MessagingException {
		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setSubject(subject);
		helper.setText(content);
		helper.setTo(to);
		helper.setFrom(env.getProperty("spring.mail.username"));
		emailSender.send(message);
		// helper.addAttachment("attachment-document-name.jpg", new
		// ClassPathResource("memorynotfound-logo.jpg"));

	}
}
