package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.concretes.Graduate;
import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.concretes.Technology;

public class JobSeekerResumeDto {

	public JobSeeker jobSeeker;
	
	public List<Education> educations;
	
	public List<Graduate> graduates;
	
	public List<JobExperience> jobExperiences;
	
	public List<Language> languages;
	
	public List<Technology> technologies;
}
