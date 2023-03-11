package com.example.latihan_monolith_service.service;

import com.example.latihan_monolith_service.model.Users;
import com.example.latihan_monolith_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<Users> findAllUsersService(){

        return  userRepository.findAll();

    };

}
