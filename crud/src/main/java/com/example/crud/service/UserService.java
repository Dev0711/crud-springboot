package com.example.crud.service;

import com.example.crud.dto.UserDTO;
import com.example.crud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService  {
    List<User> getAllUsers();
    User saveUser(User user);
    User getUserById(Long Id);
    User updateUser(Long Id, User user);
    void deleteUser(Long id);
    
}
