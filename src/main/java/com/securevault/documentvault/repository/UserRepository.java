package com.securevault.documentvault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securevault.documentvault.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
