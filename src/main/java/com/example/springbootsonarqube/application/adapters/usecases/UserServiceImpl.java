package com.example.springbootsonarqube.application.adapters.usecases;

import com.example.springbootsonarqube.application.dtos.users.OutUserDTO;
import com.example.springbootsonarqube.application.mappes.UserDTOMapper;
import com.example.springbootsonarqube.application.ports.repositories.UserRepository;
import com.example.springbootsonarqube.application.ports.usecases.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserRepository repository;
  private final UserDTOMapper mapper;

  @Override
  public List<OutUserDTO> findAll() {
    return mapper.toDto(repository.findAll());
  }

  @Override
  public Optional<OutUserDTO> findById(Long id) {
    return repository.findById(id)
            .map(mapper::toDto);
  }
}
