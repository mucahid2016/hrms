package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.core.utilities.results.Result;

@RestController
@RequestMapping("/activation_codes")
public class ActivationCodesController {
	private ActivationCodeService activationCodeService;

	@Autowired
	public ActivationCodesController(ActivationCodeService activationCodeService) {
		super();
		this.activationCodeService = activationCodeService;
	}
	
	@PutMapping("/activation_code")
	public Result update(String activationCode) {
		return this.activationCodeService.activationUser(activationCode);
	}
	

}
