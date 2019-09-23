/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demotest.dao;

import com.example.demotest.bean.User;
import java.util.List;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Arun
 */

public interface UserDao {
     public void addUser(User user);
    public List<User> getUser();
    public User findById(int id);
    public User update(User user, int id);
    public User updateCountry(User user, int id);
    public void delete(int id);
    
}
