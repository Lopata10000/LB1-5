package com.fanta.practical3task2.repo;

import com.fanta.practical3task2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
