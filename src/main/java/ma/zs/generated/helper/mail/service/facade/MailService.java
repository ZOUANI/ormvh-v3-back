/**
 * 
 */
package ma.zs.generated.helper.mail.service.facade;

import javax.mail.MessagingException;

/**
 * @author Ouiam
 *
 */
public interface MailService {
	
	void sendSimpleMail(String to, String subject, String content) throws MessagingException;

}
