package com.cts.app;

import com.cts.dao.UserDAO;
import com.cts.dao.UserDAOImpl;
import com.cts.model.User;

public class App {
	public static void main(String[] args) {
		User u=new User(12,"rupa","rupa123",21);
		UserDAO userDao=new UserDAOImpl();
		System.out.println(userDao.insertUser(u));
	}

}
