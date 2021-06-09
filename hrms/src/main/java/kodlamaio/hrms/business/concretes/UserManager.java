package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return  new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listelendi");
				
	}

	@Override
	public Result addUserAccount(User user) {
		
		return null;
	}

	@Override
	public boolean addVerificationEmail(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return null;
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
		return  new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}

}
