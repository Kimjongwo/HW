package com.example.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.Domain.Post;

public interface PostService {	

	void insertPost(Post post);

	void updatePost(Post post);

	void deletePost(Post post);

	Post findPost(Post post);
	
	List<Post> getPostList();

}
