package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	
	
	@Query("From JobAdvertisement where isActive = true")
	List<JobAdvertisement> findByActiveTrue();
	
	@Query("From JobAdvertisement where isActive = true Order By lastApplyDate Desc")
	List<JobAdvertisement> findByIsActiveTrueOrderByApplicationDeadlineDesc();
	
	@Query("From JobAdvertisement where isActive = true and employer_id =:id")
	List<JobAdvertisement> findByIsActiveTrueAndEmployerId(int id);

	

	
}
