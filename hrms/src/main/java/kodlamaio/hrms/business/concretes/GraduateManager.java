package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.GraduateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.GraduateDao;
import kodlamaio.hrms.entities.concretes.Graduate;

@Service
public class GraduateManager implements GraduateService{

	private GraduateDao graduateDao;
	
	@Autowired
	public GraduateManager(GraduateDao graduateDao) {
		super();
		this.graduateDao = graduateDao;
	}

	@Override
	public DataResult<List<Graduate>> getAll() {
		return new SuccessDataResult<List<Graduate>>(this.graduateDao.findAll()," Listelendi");
	}

	@Override
	public Result add(Graduate graduate) {
		if(graduateDao.existsByDescription(graduate.getDescription())) {
			return new ErrorResult("Daha önce eklendi");
		}
		this.graduateDao.save(graduate);
		return new SuccessResult("Eklendi");
	}

}
