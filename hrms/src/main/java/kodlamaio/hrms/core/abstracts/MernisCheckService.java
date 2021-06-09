package kodlamaio.hrms.core.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface MernisCheckService {
	
	public boolean checkIfRealPerson(JobSeeker jobSeeker);

}
