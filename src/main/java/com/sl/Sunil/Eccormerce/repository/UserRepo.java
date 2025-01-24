package com.sl.Sunil.Eccormerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.Sunil.Eccormerce.entity.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
