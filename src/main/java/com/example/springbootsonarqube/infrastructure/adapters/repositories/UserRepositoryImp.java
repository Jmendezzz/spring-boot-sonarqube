package com.example.springbootsonarqube.infrastructure.adapters.repositories;

import com.example.springbootsonarqube.application.ports.repositories.UserRepository;
import com.example.springbootsonarqube.domain.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserRepositoryImp implements UserRepository {
  @Override
  public List<User> findAll() {
    return null;
  }

  @Override
  public Optional<User> findById(Long id) {
    return Optional.empty();
  }
}
