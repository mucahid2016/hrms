package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = false)
public class Employer extends User {

	@NotBlank(message = "Şirket İsmi Boş geçilemez")
	@Column(name = "company_name")
	private String companyName;

	@NotBlank(message = "Web sitesi boş geçilemez")
	@Column(name = "web_site")
	private String webSite;

	@NotBlank(message = "Telefon numarası buş geçilemez")
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@JsonIgnore
	@Column(name = "user_confirm")
	private boolean userConfirm;

}
