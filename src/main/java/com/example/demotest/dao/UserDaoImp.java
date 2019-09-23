/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demotest.dao;

import com.example.demotest.bean.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arun
 */
@Repository
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public List<User> getUser() {
        // TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        List<User> list= session.createCriteria(User.class).list();
        return list;
    }
    

    @Override
    public User findById(int id) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        User user=(User) session.get(User.class,id);
        return user;
    }

    @Override
    public User update(User val, int id) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        User user =(User)session.get(User.class, id);
        user.setCountry(val.getCountry());
        user.setName(val.getName());
        session.update(user);
        return user;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        User user = findById(id);
        session.delete(user);
    }
    @Override
    public User updateCountry(User val, int id){
        Session session = sessionFactory.getCurrentSession();
        User user = (User)session.load(User.class, id);
        user.setCountry(val.getCountry());
        return user;
    }
    
}
