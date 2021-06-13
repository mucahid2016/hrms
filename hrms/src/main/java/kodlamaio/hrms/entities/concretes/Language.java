package kodlamaio.hrms.entities.concretes;



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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resume_langs")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name = "resume _id")
	private Resume resume;
	
	@NotBlank(message = "Boş geçilmez")
	@Column(name = "language")
	private String language;
	
	@NotBlank(message = "Boş geçilmez")
	@Column(name = "lang_level")
	private char langLevel;
	
	@Column(name = "created_date")
	private Date createdDate;
}
