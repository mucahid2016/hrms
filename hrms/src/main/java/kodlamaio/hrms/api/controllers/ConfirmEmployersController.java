package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ConfirmEmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ConfirmEmployer;

@RestController
@RequestMapping("/api/confirm-employers")
@CrossOrigin
public class ConfirmEmployersController {
	
	private ConfirmEmployerService confirmEmployerService;

	@Autowired
	public ConfirmEmployersController(ConfirmEmployerService confirmEmployerService) {
		super();
		this.confirmEmployerService = confirmEmployerService;
	}
	
	@PostMapping("/getall")
	public Result add(@RequestBody ConfirmEmployer confirmEmployer) {
		return this.confirmEmployerService.add(confirmEmployer);
	}
	
	@GetMapping
	public DataResult<List<ConfirmEmployer>> getAll(){
		return this.confirmEmployerService.getAll();
	}
	

}
