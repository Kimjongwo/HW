package com.example.demo.Service;

import java.util.List;

import com.example.demo.Domain.Post;

public interface PostService {	

	void insertPost(Post post);

	void updatePost(Post post);

	void deletePost(Post post);

	Post findPost(Post post);
	
	List<Post> getPostList();
	
	Post getPost(long pn);

}