package org.transaction.example.service;

import java.util.List;

import org.transaction.example.beans.User;
import org.transaction.example.dao.UserDao;

//@Service
public class UserServiceImpl implements UserService
{
	//@Autowired
   private UserDao userDao;

	//@Transactional
	public void insertUser(User user)
	{
		userDao.insertUser(user);
	}

	
	//@Transactional
	public User getUserById(int id)
	{
		return userDao.getUserById(id);
	}

	
	//@Transactional
	public User getuserByName(String username)
	{
		return userDao.getUserByName(username);
	}

	//@Transactional
	public List<User> getAllUser()
	{
		return userDao.getAllUsers();
	}
	
}
