package kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ConfirmEmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ConfirmEmployerDao;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.ConfirmEmployer;


@Service
public class ConfirmEmloyerManager  implements ConfirmEmployerService{
	
	private ConfirmEmployerDao confirmEmployerDao;
	
	
	@Autowired
	public ConfirmEmloyerManager(ConfirmEmployerDao confirmEmployerDao,EmployerDao employerDao) {
		super();
		this.confirmEmployerDao = confirmEmployerDao;
		
	}

	@Override
	public DataResult<List<ConfirmEmployer>> getAll() {
		return new SuccessDataResult<List<ConfirmEmployer>>(this.confirmEmployerDao.findAll(),"Listelendi");
	}

	@Override
	public Result add(ConfirmEmployer confirmEmployer) {
		this.confirmEmployerDao.save(confirmEmployer);
		return new SuccessResult("Onaylandı");
	}

	


	

}
