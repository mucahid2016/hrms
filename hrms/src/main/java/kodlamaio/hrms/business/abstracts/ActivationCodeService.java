package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;


public interface ActivationCodeService {
	
	Result activationUser(String code);
	
	void sendEmail(String email);
	
	String createActivationCode(User user);

}
