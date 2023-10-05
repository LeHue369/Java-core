package solid.singleresponsibility.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import solid.singleresponsibility.entity.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCommon {

	public static User convertJsonToObject(String json) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, User.class);
	}

	//Validates the user object
	public static boolean isValidUser(User user) {
		if(!isPresent(user.getName())) {
			return false;
		}
		user.setName(user.getName().trim());

		if(!isValidAlphaNumeric(user.getName())) {
			return false;
		}
		if(user.getEmail() == null || user.getEmail().trim().length() == 0) {
			return false;
		}
		user.setEmail(user.getEmail().trim());
		if(!isValidEmail(user.getEmail())) {
			return false;
		}
		return true;
	}

	//Simply checks if value is null or empty..
	private static boolean isPresent(String value) {
		return value != null && value.trim().length() > 0;
	}

	//check string for special characters
	private static boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

	//check string for valid email address - this is not for prod.
	//Just for demo. This fails for lots of valid emails.
	private static boolean isValidEmail(String value) {
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
}
