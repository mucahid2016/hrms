package kodlamaio.hrms.business.concretes;


import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ActivationCodeDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.ActivationCode;
import kodlamaio.hrms.entities.concretes.User;


@Service
public class ActivationCodeManager implements ActivationCodeService {

	private ActivationCodeDao activationCodeDao;

	private UserDao userDao;

	public ActivationCodeManager(ActivationCodeDao activationCodeDao,UserDao userDao) {
		super();
		this.activationCodeDao = activationCodeDao;
		this.userDao= userDao;
		
	}


	@Override
	public Result activationUser(String code) {
		if(!this.activationCodeDao.existsByActivationCode(code)) {
			return new ErrorResult("Hatalı Dığrulama işlemi yaptınız");
		}
		ActivationCode newActivationCode = activationCodeDao.getByActivationCode(code);
		if(this.activationCodeDao.getOne(newActivationCode.getId()).getIsActivated()) {
			return new ErrorResult("Doğrulma işlemi önceden yapıldı");
		}
		LocalDate a =(LocalDate.now());
		newActivationCode.setIsActivated(true);
		newActivationCode.setCreatedDate(Date.valueOf(a));
		activationCodeDao.save(newActivationCode);
		
		User activationUser = new User();
		activationUser = userDao.getOne(newActivationCode.getUserId().getId());
		activationUser.setActivation(true);
		userDao.save(activationUser);
		return new SuccessResult("Doğrulama Başarılı");	
	}


	@Override
	public void sendEmail(String email) {
		System.out.println("Doğrulama maili adresinizi yollandı: " + email);
		
	}


	@Override
	public String createActivationCode(User user) {
		String actCode = UUID.randomUUID().toString();
		ActivationCode Code = new ActivationCode();
		LocalDate a = (LocalDate.now());
		Code.setUserId(user);
		Code.setCreatedDate(Date.valueOf(a));
		Code.setActivationCode(UUID.randomUUID().toString());
		return actCode;
	}

	
	

	

	
}
