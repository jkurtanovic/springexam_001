package com.springexam.restfull.controller;

import com.springexam.restfull.dao.UserDAO;
import com.springexam.restfull.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainRestController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/")
    public String welcome(){
        return "Welcome to RestFull web service Example.";
    }

    @GetMapping("/users")
    public List<User> listUsers (){

        List<User>list = userDAO.getAllUsers();

        return list;

    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") int id){
        return userDAO.getUser(id);
    }

    @RequestMapping(value = "/user", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public User addUser(@RequestBody User user){



        System.out.println("(Service Side) Creating user: " + user.getId());

        return userDAO.addUser(user);
    }

    @PutMapping("user/{id}")
    public User updateUser(@RequestBody User user){
        System.out.println("(Service Side) Editing user: " + user.getId());
        return userDAO.updateUser(user);
    }

   @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") int id){
       System.out.println("(Service Side) Deleting user: " + id);
        userDAO.deleteUser(id);
   }
}
