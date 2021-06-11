package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import lombok.var;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş pozisyonu başarılı bir şekilde eklendi!");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş pozisyonu başarılı bir şekilde güncellendi!");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertisementDao.deleteById(id);
		return new SuccessResult("İş ilanı silindi");
	}

	@Override
	public Result changeToActive(int id) {
		if (getById(id) == null) {
			return new ErrorResult("Böyle bir iş ilanı yok!");
		}
		if (getById(id).getData().isActive() == false) {
			return new SuccessResult("İş ilani zaten kapalı!");

		}
		JobAdvertisement jobAdvertisements = getById(id).getData();
		jobAdvertisements.setActive(false);
		update(jobAdvertisements);
		return new SuccessResult("İş ilanı başarılı şekilde kapatıldı!");
		
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll());
	}

	

	@Override
	public DataResult<List<JobAdvertisement>> findByActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByApplicationDeadlineDesc() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByIsActiveTrueOrderByApplicationDeadlineDesc());
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveTrueAndEmployerId(int id) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByIsActiveTrueAndEmployerId(id));
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.getOne(id));
	}





}
