package kodlamaio.hrms.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.abstracts.MailCheckService;

@Primary
@Component
public class FakeMailCheckManager implements MailCheckService {

	@Override
	public boolean mailCheck(String email) {
		
		return true;
	}

}
