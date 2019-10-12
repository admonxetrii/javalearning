package np.com.nishamwagle.service;

import java.util.List;

import np.com.nishamwagle.model.User;

public interface UserService {

	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	User getUserInfoById(int id);

	List<User> getAllUserInfo();
}
