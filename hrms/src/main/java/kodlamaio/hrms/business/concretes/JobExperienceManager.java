package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager  implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
	
	
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result delete(JobExperience jobExperience) {
		this.jobExperienceDao.delete(jobExperience);
		return new SuccessResult("Silindi");
	}

	@Override
	public Result update(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("güncellendi");
	}

	@Override
	public DataResult<JobExperience> getById(int id) {
		return new SuccessDataResult<JobExperience>
				(this.jobExperienceDao.getOne(id));
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAll());
	}


	@Override
	public DataResult<List<JobExperience>> getAllByResumeIdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.getAllByResumeIdOrderByEndedDateDesc(id));
	}

	
	

}
