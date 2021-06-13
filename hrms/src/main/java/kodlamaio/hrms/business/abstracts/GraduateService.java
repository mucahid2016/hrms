package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Graduate;

public interface GraduateService {
	
	DataResult<List<Graduate>> getAll();
	
	Result add(Graduate graduate);

}
