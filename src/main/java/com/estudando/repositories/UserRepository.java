package com.estudando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
