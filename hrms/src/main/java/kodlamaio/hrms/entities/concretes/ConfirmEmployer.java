package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "confirm_employer")
public class ConfirmEmployer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private int id;

	@OneToOne(targetEntity = Employer.class)
	@JoinColumn(name = "employer_id", referencedColumnName = "user_id")
	private Employer employerId;

	@ManyToOne(targetEntity = Employer.class)
	@JoinColumn(name = "system_personnel_id", referencedColumnName = "user_id")
	private SystemPersonnel systemPersonnel;

	@Column(name = "is_confirmed")
	private Boolean isConfirmed;

	
}
