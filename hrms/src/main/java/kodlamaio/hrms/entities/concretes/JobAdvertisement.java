package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_advertisement")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;
	
	@Column(name = "open_position_count")
	private String openPositionCount;
	
	@Column(name = "last_apply_date")
	private Date lastApplyDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "create_date")
	public Date createDate;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name="jobtitleid")
	private JobTitle jobTitle;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name="employerid")
	private Employer employer;
	

}
