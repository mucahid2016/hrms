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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "activation_codes")
@AllArgsConstructor
@NoArgsConstructor
public class ActivationCode {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonIgnore
	private int id;

	@ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
	@JsonIgnore
	private User user;

	@JsonIgnore
	@Column(name = "activation_code")
	private String activationCode;

	@JsonIgnore
	@Column(name = "is_activated")
	private Boolean isActivated;

	//@JsonIgnore
	//@Column(name = "created_date")
	//private Date createdDate;
}
