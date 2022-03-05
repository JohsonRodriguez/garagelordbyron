package com.example.demo.service;


import com.example.demo.dto.RegisterDto;
import com.example.demo.entity.Register;

import java.util.List;
import java.util.Optional;

public interface RegisterService {

        void  saveRegister(RegisterDto registerDto);
List<Register>searchCarbyDay(String registrationplate);
      void  updateRegister(RegisterDto registerDto);
        List<Register> searchDay(String day);
        Optional<Register> searchById(Long id);
    Long countRegistro();
    Long countGaragefree();

}
