package com.example.latihan_monolith_service.repository;

import com.example.latihan_monolith_service.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long>  {

    List<Users> findAll();
}
