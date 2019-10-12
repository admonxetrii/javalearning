package np.com.nishamwagle.service;

import java.util.List;

import np.com.nishamwagle.model.User;

import np.com.nishamwagle.dao.UserDao;
import np.com.nishamwagle.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserInfoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}



}
