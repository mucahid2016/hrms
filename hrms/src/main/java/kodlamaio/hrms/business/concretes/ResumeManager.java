package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.concretes.Resume;


@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	private EducationDao educationDao;
	
	public ResumeManager(ResumeDao resumeDao, EducationDao educationDao) {
		super();
		this.resumeDao = resumeDao;
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Resume resume) {
		//Resume resume1 = this.resumeDao.save(resume);
		//SetResume2Id(resume1.getEducation(),resume1);
		this.resumeDao.save(resume);
		return new SuccessResult(" Cv eklendi");
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>
		(resumeDao.findAll(),"Data listelendi");
	}
	

	@Override
	public void SetResume2Id(List<Education> education ,Resume resume) {
		for (Education education2 : education) {
			education2.setResume(resume);
			this.educationDao.save(education2);
		}
	}
	
	
	
	

}
