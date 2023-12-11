package com.fanta.practical3task2.service;

import com.fanta.practical3task2.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> getAllPosts();
    Optional<Post> getPostById(Long id);
    Post createPost(Post post);
    Optional<Post> updatePost(Long id, Post post);
    void deletePost(Long id);
}
