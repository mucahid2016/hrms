package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/job-advertisements")
@CrossOrigin
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;


	
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@PostMapping("/change_to_active")
	public Result changeToActive(int id) {
		return this.jobAdvertisementService.changeToActive(id);
	}
	
	@GetMapping("/getAllActiveTrue")
	public DataResult<List<JobAdvertisement>> getAllActiveTrue(){
		return this.jobAdvertisementService.findByActiveTrue();
	}
	
	@GetMapping("/getByIsActiveTrueOrderByApplicationDeadlineDesc")
	public DataResult<List<JobAdvertisement>>  getByIsActiveTrueOrderByApplicationDeadlineDesc(){
		return this.jobAdvertisementService.findByIsActiveTrueOrderByApplicationDeadlineDesc();
	}
	
	@GetMapping("/getByIsActiveTrueAndEmployerId")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployerId(int id){
		return this.jobAdvertisementService.findByActiveTrue();
	}
	

}
