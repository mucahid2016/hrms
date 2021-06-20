package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {
	
	private EducationService educationService;

	@Autowired
	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody Education schoolForCV){
		return this.educationService.add(schoolForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Education schoolForCV){
		return this.educationService.update(schoolForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.educationService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<Education> getById(@RequestParam int id){
		return this.educationService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Education>> getAll(){
		return this.educationService.getAll();
	}
	
	@GetMapping("/getAllByCandidateIdOrderByEndDescd")
	public DataResult<List<Education>> getAllByJobseekerIdOrderByEndedDateDesc(@RequestParam int id){
		return this.educationService.getAllByJobseeker_IdOrderByEndedDateDesc(id);
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<Education>> getAllByCandidateId(@RequestParam int id){
		return this.educationService.getAllByJobSeeker_Id(id);
	}

}
