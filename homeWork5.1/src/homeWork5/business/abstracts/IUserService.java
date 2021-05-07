package homeWork5.business.abstracts;

import homeWork5.entities.concretes.User;

public interface IUserService {
	void add(User user) throws Exception;
	void update(User user);
	void delete(User user);
	void registerWithGoogle();

}
