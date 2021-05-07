package homeWork5.business.abstracts;

import homeWork5.entities.concretes.User;

public interface IAuthService {
	
	void login(User user , String password , String eMail);
	void validate(User user, String firstNane, String password);
	boolean checkEmailValid(User user);

}
