package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	
	Result update(JobAdvertisement jobAdvertisement);
	
	Result delete(int id);
	
	Result changeToActive(int id);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<JobAdvertisement> getById(int id);
	
	DataResult<List<JobAdvertisement>> findByActiveTrue();
	
	DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByApplicationDeadlineDesc();
	
	DataResult<List<JobAdvertisement>> findByIsActiveTrueAndEmployerId(int id);

	

}
