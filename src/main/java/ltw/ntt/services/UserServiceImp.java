package ltw.ntt.services;

import ltw.ntt.models.UserModel;
import ltw.ntt.daos.*;

public class UserServiceImp implements IUserService {

	IUserDao userDao = new UserDaoImp();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.findByUsername(username);
		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}
		return null;
	}

	@Override
	public UserModel findByUsername(String username) {

		return userDao.findByUsername(username);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public void insert(UserModel user) {
		userDao.insert(user);
	}

	@Override
	public boolean register(String username, String password) {
		if (userDao.checkExistUsername(username)) {
			return false;
		} else {
			userDao.insert(new UserModel(username, password));
			return true;
		}
	}

	@Override
	public boolean resetPass(String username, String password) {
		if (!userDao.checkExistUsername(username)) {
			return false;
		} else {
		userDao.update(username, password);
		return true;
		}
	}

}
