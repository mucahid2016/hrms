package kodlamaio.hrms.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.core.abstracts.MailSendService;

public class MailSendManagerAdapters extends MailSendService {

	private MailSendManagerAdapters mailSendManagerAdapters;

	@Autowired
	public MailSendManagerAdapters(MailSendManagerAdapters mailSendManagerAdapters) {
		this.mailSendManagerAdapters = mailSendManagerAdapters;
	}
	
	@Override
	public void mailSend(String email) {
		mailSendManagerAdapters.mailSend(email);
	}

}
