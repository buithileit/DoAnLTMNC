package vn.edu.hcmuaf.service;

import org.springframework.stereotype.Service;

import vn.edu.hcmuaf.model.User;

@Service
public interface UserService {

	User login(String email, String pass);

	boolean registry(String email, String password, String name,
			String birthDate, String sex);
}
