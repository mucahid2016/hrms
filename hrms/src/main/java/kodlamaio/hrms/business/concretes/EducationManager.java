package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.dtos.JobSeekerResumeDto;

@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Okul bilgisi eklendi");
	}

	@Override
	public Result update(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Okul bilgisi güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.educationDao.deleteById(id);
		return new SuccessResult("Okul bilgisi silindi");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll());
	}

	@Override
	public DataResult<Education> getById(int id) {
		return new SuccessDataResult<Education>(this.educationDao.getById(id));
	}

	@Override
	public DataResult<List<Education>> getAllByJobseeker_IdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<Education>>(this.educationDao.getAllByJobSeeker_IdOrderByEndedDateDesc(id));
	}

	@Override
	public DataResult<List<Education>> getAllByJobSeeker_Id(int id) {
		return new SuccessDataResult<List<Education>>(this.educationDao.getAllByJobSeeker_Id(id));
	}

	

	

}
