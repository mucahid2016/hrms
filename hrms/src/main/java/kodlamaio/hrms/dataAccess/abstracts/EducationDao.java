package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {
	
	Education getById(int id);
	List<Education> getAllByJobSeeker_IdOrderByEndedDateDesc(int id);
	List<Education> getAllByJobSeeker_Id(int id);

}
