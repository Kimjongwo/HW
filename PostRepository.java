package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Domain.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
