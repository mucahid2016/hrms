package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface UserService {

	
	Result addUserAccount(User user);
	boolean addVerificationEmail(User user);
	boolean signUp(User user);
	
	User getUser(int id);
	
	DataResult<List<User>> getAll();
	
	Result add(User user);
	DataResult<User> getUserByEmail(String email);
}
