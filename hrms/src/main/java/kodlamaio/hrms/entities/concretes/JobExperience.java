package kodlamaio.hrms.entities.concretes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resume_job_exp")
public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name = "resume _id")
	private int resume;
	
	@NotBlank(message = "Boş geçilemez")
	@Column(name = "company_name")
	private String companyName;
	
	
	@ManyToOne(targetEntity = Graduate.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "job_title_id", referencedColumnName = "id", nullable = false)
	private JobTitle jobTitle;
	
	@NotBlank(message = "Boş geçilemez")
	@Column(name = "started_name")
	private Date startedDate;
	
	
	@Column(name = "ended_name")
	private Date endedDate;
	
	
	@Column(name = "created_name")
	private Date createdDate;
}
