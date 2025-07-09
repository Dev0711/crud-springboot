package com.example.crud.service.Impl;

import com.example.crud.dto.UserDTO;
import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import com.example.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public User getUserById(Long Id){
        return userRepository.findById(Id).orElse(null);
    }
    public User updateUser(Long Id, User user){
        User existingUser = userRepository.findById(Id).orElse(null);
        assert existingUser != null;
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return userRepository.save(existingUser);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
