package solid.singleresponsibility.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import solid.singleresponsibility.common.UserCommon;
import solid.singleresponsibility.service.UserService;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
	private UserService service = new UserService();

	//Create a new user
	public String createUser(String userJson) throws JsonProcessingException {
		return service.saveUser(UserCommon.convertJsonToObject(userJson));
	}
}
