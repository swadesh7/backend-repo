package com.registration.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.registration.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
