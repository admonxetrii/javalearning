package np.com.nishamwagle.dao;

import java.util.List;

import np.com.nishamwagle.model.User;

public interface UserDao {

	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	User getUserInfoById(int id);

	List<User> getAllUserInfo();

}
