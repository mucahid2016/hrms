package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@EqualsAndHashCode(callSuper = false)
public class JobSeeker extends User {
	
	@NotBlank(message = "İsim boş gelimez")
	@Size(min = 3, message = "İsim alanında en az 3 karakter kullanmanız gerekmektedir!")
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message = "Soyisim boş geçilemez")
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank(message = "Tc kimlik numarası boş geçilemez")
	@Size(min = 11, max = 11, message = "TC kimlik numarası 11 haneli olmalıdır")
	@Column(name="nationality_number")
	private String nationalityNumber;
	
	@NotBlank(message = "Doğum yılı boş geçilemez")
	@Column(name="year_of_birth")
	private int yearOfBirth;

}
