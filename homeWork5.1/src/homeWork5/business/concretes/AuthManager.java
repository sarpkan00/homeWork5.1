package homeWork5.business.concretes;



import java.util.regex.Pattern;

import homeWork5.business.abstracts.IAuthService;
import homeWork5.entities.concretes.User;

public class AuthManager implements IAuthService {
	@Override
	public void login(User user, String password, String eMail) {
		if (user.geteMail().equals(eMail) && user.getPassword().equals(password)) {
			System.out.println("Giriþ yapýldý  hosgeldiniz :  " + user.getFirstName());
		}

	}

	

	@Override
	public void validate(User user, String firstNane, String password) {
		if (user.getFirstName().equals(firstNane) && user.getPassword().equals(password)) {
			System.out.println("Dogrulama basarili");
		}

	}

	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public boolean checkEmailValid(User user) {

		if (true) {
			Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
			return pattern.matcher(user.geteMail()).find();
		}
		return false;

	}



}

