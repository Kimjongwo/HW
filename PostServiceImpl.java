package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.Domain.Post;
import com.example.Repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepository postrepo;
	
	public void insertPost(Post post) {
		
	}

	public void updatePost(Post post) {
		
	}

	public void deletePost(Post post) {
		
	}

	public Post findPost(Post post) {
		return null;
	}

	public List<Post> getPostList() {
		return (List<Post>) postrepo.findAll();
	}


}
