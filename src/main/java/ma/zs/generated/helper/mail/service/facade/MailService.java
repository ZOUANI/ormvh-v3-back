/**
 * 
 */
package ma.zs.generated.helper.mail.service.facade;

import javax.mail.MessagingException;

public interface MailService {
	
	void sendSimpleMail(String to, String subject, String content) throws MessagingException;

}
