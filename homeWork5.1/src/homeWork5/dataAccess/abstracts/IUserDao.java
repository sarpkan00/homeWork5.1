package homeWork5.dataAccess.abstracts;

import homeWork5.entities.concretes.User;

public interface IUserDao {

	void add(User user);

	void update(User user);

	void delete(User user);

}
