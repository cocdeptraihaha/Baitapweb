package ltw.ntt.services;

import ltw.ntt.models.UserModel;

public interface IUserService {
	UserModel login(String username, String password);

	UserModel findByUsername(String username);

	void insert(UserModel user);

	boolean checkExistUsername(String username);

	boolean register(String username, String password);
}
