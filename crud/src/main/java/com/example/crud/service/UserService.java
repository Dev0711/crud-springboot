package com.example.crud.service;

import com.example.crud.dto.UserDTO;
import org.springframework.stereotype.Service;


public interface UserService  {
    UserDTO createUser(UserDTO userDTO);

    
}
