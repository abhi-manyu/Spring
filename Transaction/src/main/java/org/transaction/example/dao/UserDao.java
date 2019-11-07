package org.transaction.example.dao;

import java.util.List;

import org.transaction.example.beans.User;

public interface UserDao
{
   void insertUser(User user);
   User getUserById(int id);
   List<User> getAllUsers();
   User getUserByName(String username);
}
