package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	void save(JobTitle jobTitle);
	List<JobTitle> getAll();

}
