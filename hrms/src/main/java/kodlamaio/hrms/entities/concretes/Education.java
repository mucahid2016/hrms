package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resume_edu")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@JsonIgnore
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name = "resume_id")
	private Resume resume;
	
	@JsonIgnore
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name = "school_name")
	@NotBlank(message = "Boş geçilemez")
	private String schoolName;
	
	
	@ManyToOne(targetEntity = Graduate.class)
	@JoinColumn(name = "graduate_id", referencedColumnName = "id", nullable = false)
	private Graduate graduate;
	
	@Column(name = "school_department")
	@NotBlank(message = "Boş geçilemez")
	private String schoolDepartment;
	
	@Column(name = "started_date")
	@NotBlank(message = "Boş geçilemez")
	private LocalDate startedDate;
	
	@Column(name = "ended_date") 
	private LocalDate endedDate;
	
	@Column(name = "created_date")
	private LocalDate createdDate;
	
	
}
