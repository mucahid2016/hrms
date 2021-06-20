package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Education;


public interface EducationService {
	
	Result add (Education education);	
	Result update(Education education);
	Result delete(int id);
	DataResult<List<Education>> getAll();
	DataResult<Education> getById(int id);
	DataResult<List<Education>> getAllByJobseeker_IdOrderByEndedDateDesc(int id);
	DataResult<List<Education>> getAllByJobSeeker_Id(int id);

}
