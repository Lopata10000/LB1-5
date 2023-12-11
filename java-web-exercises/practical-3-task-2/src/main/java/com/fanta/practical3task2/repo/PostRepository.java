package com.fanta.practical3task2.repo;

import com.fanta.practical3task2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
