package org.transaction.example.service;

import java.util.List;

import org.transaction.example.beans.User;

public interface UserService
{
    void insertUser(User user);
    User getUserById(int id);
    User getuserByName(String username);
    List<User> getAllUser();
}
