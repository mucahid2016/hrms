package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Technology;

@RestController
@RequestMapping("api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;
	
	
	@Autowired
	public TechnologiesController(TechnologyService technologService) {
		super();
		this.technologyService = technologService;
	}

	@GetMapping("/getall")
	public DataResult<List<Technology>> getAll(){
		return this.technologyService.getAll();
	}

	@PostMapping("/add")
	public Result add(@Valid @RequestBody Technology technology)  {
		return this.technologyService.add(technology);
	}

}
