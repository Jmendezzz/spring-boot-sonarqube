package com.example.springbootsonarqube.application.ports.repositories;

import com.example.springbootsonarqube.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
  List<User> findAll();
  Optional<User> findById(Long id);
}
