package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.model.User;

public class UserServiceImpl implements UserService {

	// select * from User from name = ? and pass = ?;
	@Override
	public User login(String email, String pass) {
		System.out.println("Email:" + email + " Pass:" + pass);
		if (email.equals("buithileit@gmail.com"))
			if (pass.equals("123456")) {
				return getUser();

			}
		return null;
	}

	private User getUser() {
		User user = new User();
		user.setUsername("buithileit@gmail.com");
		user.setPassword("123456");
		return user;

	}

	@Override
	public boolean registry(String email, String password, String name,
			String birthDate, String sex) {
		if (email.equals("buithileit@gmail.com"))
			return false;
		else {
			return true;
		}
	}

}
