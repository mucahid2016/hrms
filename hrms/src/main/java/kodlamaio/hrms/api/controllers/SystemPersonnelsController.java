package kodlamaio.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemPersonnelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/system-personnels")

public class SystemPersonnelsController  {
	
	private SystemPersonnelService systemPersonnelService;
	

	@Autowired
	public SystemPersonnelsController(SystemPersonnelService systemPersonnelService) {
		super();
		this.systemPersonnelService= systemPersonnelService;
	}
	
	public DataResult<List<SystemPersonnel>> getAll(){
		return this.systemPersonnelService.getAll();
	}
	
	
	public Result register(@RequestBody SystemPersonnel systemPersonnel) {
		return this.systemPersonnelService.register(systemPersonnel);
	}
	
	
	
	

}
