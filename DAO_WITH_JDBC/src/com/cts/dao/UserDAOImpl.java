package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cts.model.User;
import com.cts.util.ConnectionFactory;

public class UserDAOImpl implements UserDAO {

	public boolean insertUser(User u) {
		String uname=u.getName();
		String pass=u.getPass();
		int id=u.getId();
		int age=u.getAge();
		try{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2, uname);
		ps.setString(3, pass);
		ps.setInt(4, age);
		ps.executeUpdate();
		}catch(Exception e){
		
		}
		return true;
	}

}
