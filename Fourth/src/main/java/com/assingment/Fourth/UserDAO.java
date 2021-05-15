package com.assingment.Fourth;

public interface UserDAO {

	public void insert(user u);

	public boolean findUser(String username, String password);

}
