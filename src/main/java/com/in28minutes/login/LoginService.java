package com.in28minutes.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("aleks") && password.equals("vlenaf13"))
			return true;

		return false;
	}

}
