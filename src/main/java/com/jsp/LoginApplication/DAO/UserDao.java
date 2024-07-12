package com.jsp.LoginApplication.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.LoginApplication.DTO.User;
import com.jsp.LoginApplication.Repository.LoginRepository;

@Repository
public class UserDao {
	@Autowired
	LoginRepository repository;
	
//to insert user object
	public String saveUser(User user) {
		repository.save(user);
		return "user register successfully";
	}
	
	//validUserforlogin
	public String loginvalidation(String username,String password) {
	User u=repository.validataUser(username, password);
	if(u!=null)
	{
		return "Login successfully";
	}
	return "Incoorect Username and Password";
	}

}
