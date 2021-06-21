package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Email(message = "Lütfen geçerli bir mail adresi girin")
	@NotBlank(message = "Mail alanı boş geçilemez")
	@Column(name="user_email")
	private String email;
	
	@NotBlank(message = "Şifre alanı boş geçilemez")
	@Size(min = 6, max = 16, message = "Şifre en az 6 en fazla 16 haneli olmalıdır")
	@Column(name="user_password")
	private String password;
	
	@NotBlank(message = "Şifre tekrar alanı boş geçilemez")
	@Transient
	@JsonProperty(access = Access.WRITE_ONLY)
	private String passowrdRepeat;

	@JsonIgnore
	@Column(name="activation")
	private boolean activation = false;

	
}
