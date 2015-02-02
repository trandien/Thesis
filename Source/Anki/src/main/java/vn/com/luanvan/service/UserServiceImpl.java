package vn.com.luanvan.service;

import org.springframework.beans.factory.annotation.Autowired;

import vn.com.luanvan.dao.UserDao;
import vn.com.luanvan.dao.UserDaoImpl;
import vn.com.luanvan.model.User;

public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Override
	public boolean findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public User findUserbyUserName(String username) {
		return userDao.findUserbyUserName(username);
	}

	@Override
	public void sendMail(User user) {
		userDao.sendMail(user);
		
	}

	@Override
	public boolean checkOldPassword(User user, String oldPass) {
		return userDao.checkOldPassword(user, oldPass);
	}

	@Override
	public boolean checkEmail(String email) {
		return userDao.checkEmail(email);
	}

}
