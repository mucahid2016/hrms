package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer> {
	
	ActivationCode getByActivationCode(String code);
	
	boolean existsByActivationCode(String code);
	
}
