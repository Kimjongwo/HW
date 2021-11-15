package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Post;
import com.example.demo.Repository.PostRepository;

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
		return null ;
	}

	public List<Post> getPostList() {
		return (List<Post>) postrepo.findAll();
	}

	public Post getPost(long pn) {
		return postrepo.getById(pn);
	}

}