package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeService {

	DataResult<List<Resume>> getAll();
	
	Result add(Resume resume);

	void SetResume2Id(List<Education> education, Resume resume);
	
}
