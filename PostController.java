package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Repository.PostRepository;
import com.example.Service.PostService;
import com.example.Domain.Post;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	private PostService postservice;
	
	@Autowired
	private PostRepository postrepo;

	@RequestMapping("/list")
	public String getPostList(@ModelAttribute("post") Post post, Model model) {
		
		List<Post> postList = postservice.getPostList();
		System.out.println(postList.toString());
		model.addAttribute("postList", postList);
		return "/post/list";
	}
}
