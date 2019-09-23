/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demotest.service;

import com.example.demotest.bean.User;
import java.util.List;

/**
 *
 * @author Arun
 */
public interface UserService {
    public void createUser(User user);
    public List<User> getUser();
    public User findById(int id);
    public User update(User user, int id);
    public void deleteUserById(int id);
    public User updatePartially(User user, int id);
}
