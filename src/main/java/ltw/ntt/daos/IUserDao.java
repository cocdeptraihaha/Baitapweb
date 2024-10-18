package ltw.ntt.daos;

import ltw.ntt.models.UserModel;

public interface IUserDao {

	UserModel findByUsername (String username);
	void insert (UserModel user);
	boolean checkExistUsername(String username);
}
