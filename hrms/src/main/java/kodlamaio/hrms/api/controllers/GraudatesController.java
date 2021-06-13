package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.GraduateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Graduate;

@RestController
@RequestMapping("/api/graduates")
public class GraudatesController {
	
	private GraduateService graduateService;

	@Autowired
	public GraudatesController(GraduateService graduateService) {
		super();
		this.graduateService = graduateService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Graduate>> getAll(){
		return this.graduateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody Graduate graduate) {
		return this.graduateService.add(graduate);
	}
	

}
