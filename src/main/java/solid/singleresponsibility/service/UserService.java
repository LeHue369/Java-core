package solid.singleresponsibility.service;

import solid.singleresponsibility.common.UserCommon;
import solid.singleresponsibility.entity.User;
import solid.singleresponsibility.repository.UserStore;

public class UserService {

	private UserStore store = new UserStore();

	public String saveUser(User user){
		boolean valid = UserCommon.isValidUser(user);

		if (!valid) {
			return "ERROR";
		}
		store.store(user);

		return "SUCCESS";
	}

}

