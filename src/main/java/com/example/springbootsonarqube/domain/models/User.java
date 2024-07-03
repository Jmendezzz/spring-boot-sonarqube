package com.example.springbootsonarqube.domain.models;

import com.example.springbootsonarqube.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Long id;
  private String name;
  private LocalDate birthDate;
  private String email;
  private String password;
  private UserRole role;
}
