package com.example.latihan_monolith_service.controller;

import com.example.latihan_monolith_service.model.Users;
import com.example.latihan_monolith_service.model.dto.UserDTO;
import com.example.latihan_monolith_service.repository.UserRepository;
import com.example.latihan_monolith_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {



}
