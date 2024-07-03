package com.example.springbootsonarqube.application.dtos.users;

public record OutUserDTO(
        Long id,
        String name,
        String birthDate,
        String email,
        String role
) {
}
