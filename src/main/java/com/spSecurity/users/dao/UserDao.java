package com.spSecurity.users.dao;

import com.spSecurity.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}