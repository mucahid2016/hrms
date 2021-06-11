package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.abstracts.MailSendService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private MailSendService mailSendeSerice;

	@Autowired
	public EmployerManager(EmployerDao employerDao, MailSendService mailSendeSerice) {
		super();
		this.employerDao = employerDao;
		this.mailSendeSerice = mailSendeSerice;
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren Sisteme eklendi");
	}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren Sistemde güncellendi");
	}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.delete(employer);
		return new SuccessResult("İşveren Sistemden silindi!");
	}

	@Override
	public List<Employer> getAll() {
		return employerDao.findAll();
	}

	
	

	

}
