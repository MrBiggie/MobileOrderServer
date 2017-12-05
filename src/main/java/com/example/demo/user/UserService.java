package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(String id) {
        return userRepository.findOne(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(String id, User user) {
        userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.delete(id);
    }
}
