package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ConfirmBySystemEmployee;

public interface ConfirmBySystemEmployeeDao extends JpaRepository<ConfirmBySystemEmployee, Integer> {

}
