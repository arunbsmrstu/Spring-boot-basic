/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demotest.service;

import com.example.demotest.bean.User;
import com.example.demotest.dao.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Arun
 */
@Service
@Transactional
public class UserServiceImp implements UserService{
     @Autowired
    UserDao userDao;

    @Override
    public void createUser(User user) {
      userDao.addUser(user);
    }

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public User update(User user, int id) {
       return userDao.update(user, id);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.delete(id);
    }

    @Override
    public User updatePartially(User user, int id) {
         userDao.updateCountry(user,id);
        return userDao.findById(id);
    }
    
}
