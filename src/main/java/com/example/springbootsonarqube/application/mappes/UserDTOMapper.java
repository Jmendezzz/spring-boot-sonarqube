package com.example.springbootsonarqube.application.mappes;

import com.example.springbootsonarqube.application.dtos.users.OutUserDTO;
import com.example.springbootsonarqube.domain.models.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDTOMapper {
  OutUserDTO toDto(User user);
  List<OutUserDTO> toDto(List<User> users);
}
