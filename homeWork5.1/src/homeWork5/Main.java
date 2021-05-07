package homeWork5;

import homeWork5.business.concretes.AuthManager;
import homeWork5.business.concretes.UserManager;
import homeWork5.core.GoogleAdapter;
import homeWork5.dataAccess.concretes.AbcUserDao;
import homeWork5.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		User user = new User(1, "Sarpkan", "Savaþkan", "lsdfklsdf", "sarpqq@gmail.com");
		User user1 = new User(1, "seckin", "bakir", "lsdfklsdf", "sarp1221@gmailss.com.11");
		AuthManager authManager = new AuthManager();
		UserManager manager = new UserManager(new AbcUserDao() , new GoogleAdapter());

		manager.add(user1);
		System.out.println(authManager.checkEmailValid(user));
		System.out.println(authManager.checkEmailValid(user1));
		authManager.login(user, "seckin@gmail.com", "lsdfklsdf");

	}
}


