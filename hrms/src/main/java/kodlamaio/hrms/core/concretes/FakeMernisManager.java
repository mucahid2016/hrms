package kodlamaio.hrms.core.concretes;

import kodlamaio.hrms.core.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public class FakeMernisManager implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		
		return true;
	}

}
