package com.springexam.restfull.dao;

import com.springexam.restfull.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserDAO {
    private static final Map<Integer, User> empMap = new HashMap<Integer, User>();

    static {
        initEmps();
    }

    private static void initEmps() {

        User user1= new User(1,"user_1","Brad","Blue","12/07/1981","Carolina bb");
        User user2= new User(2,"user_2","Jon","Red","18/01/1990","Pesterska bb");
        User user3= new User(3,"user_3","Jasmin","Black","01/07/2000","Nort Africa bb");
        User user4= new User(4,"user_4","Markus","Yellow","18/05/1981","Orange bb");
        User user5= new User(5,"user_5","Wayne","Green","23/07/1981","L.A. bb");

        empMap.put(user1.getId(),user1);
        empMap.put(user2.getId(),user2);
        empMap.put(user3.getId(),user3);
        empMap.put(user4.getId(),user4);
        empMap.put(user5.getId(),user5);

    }

    public List<User> getAllUsers() {
        Collection<User> c = empMap.values();
        List<User> list = new ArrayList<User>();
        list.addAll(c);
        return list;
    }

    public User getUser(int id){

        return empMap.get(id);

    }

    public User addUser(User user){

        empMap.put(user.getId(),user);
        return user;
    }

    public User updateUser(User user){

        empMap.put(user.getId(),user);
        return user;
    }

    public void deleteUser(int id){
        empMap.remove(id);
    }

}
