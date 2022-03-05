package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CarToPersonDto {
    @NotBlank(message = "Person is mandatory")
    private String dni;
    @NotBlank(message = "Registrationplate is mandatory")
    private String registrationplate;
}
