package com.example.springbootsonarqube.application.ports.usecases;

import com.example.springbootsonarqube.application.dtos.users.OutUserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
  List<OutUserDTO> findAll();
  Optional<OutUserDTO> findById(Long id);

}
