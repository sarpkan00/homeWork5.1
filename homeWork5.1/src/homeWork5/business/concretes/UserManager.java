package homeWork5.business.concretes;

import java.util.ArrayList;

import homeWork5.business.abstracts.IUserService;
import homeWork5.core.IGoogleService;
import homeWork5.dataAccess.abstracts.IUserDao;
import homeWork5.entities.concretes.User;

public class UserManager implements IUserService{
	IUserDao userDao;
	IGoogleService googleService;

	ArrayList<String> mailList = new ArrayList<String>();

	

	public UserManager(IUserDao userDao, IGoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
		
	}
	@Override
	public void add(User user) throws Exception {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && user.getPassword().length() >= 6
				&& user.geteMail() != "") {

			mailList.add(user.geteMail());
			if (mailList.contains(user.geteMail())) {
				System.out.println("Bu mail adresi zaten mevcut");
			}

			System.out.println("Kullanici eklendi : " + user.getFirstName());
			userDao.add(user);
			System.out.println("Dogrulama mailini aktiflestiriniz...");
			sendMail();
			
			
		} else {
			throw new Exception("Kayit olma kurallarina uymadiniz");
		}

	}

	@Override
	public void update(User user) {
		userDao.update(user);

	}

	@Override
	public void delete(User user) {
		userDao.delete(user);

	}
	
	public void sendMail() {
		System.out.println("Kullanici dogrulandi");
	}

	@Override
	public void registerWithGoogle() {
		googleService.registerToSystem("Google ile kayit oldundu");
		
	}

//
	
}

