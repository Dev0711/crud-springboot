package com.example.crud.mapper;

import com.example.crud.dto.UserDTO;
import com.example.crud.model.User;

public class UserMapper {
//  public static UserDTO mapToUserDTO(User user){
//      UserDTO userDTO = new UserDTO();
//      userDTO.setName(user.getName());
//      userDTO.setEmail(user.getEmail());
//      return userDTO;
//  }

  public static UserDTO mapToUserDTO(User user, UserDTO userDTO){
      userDTO.setName(user.getName());
      userDTO.setEmail(user.getEmail());
      return userDTO;
  }

//  public static User mapToUser(UserDTO userDTO, User user){
//      user.setName(userDTO.getName());
//      user.setEmail(userDTO.getEmail());
//      return user;
//  }

  public static User mapToUser(UserDTO userDTO){
      User user = new User();
      user.setName(userDTO.getName());
      user.setEmail(userDTO.getEmail());
      return user;
  }

}
