package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {

	public Result add(Employer employer);

	public Result update(Employer employer);

	public Result delete(Employer employer);
	
	public List<Employer> getAll();
	
	

}
