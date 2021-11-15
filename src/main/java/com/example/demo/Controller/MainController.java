package com.example.demo.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Domain.Post;
import com.example.demo.Domain.Product;
import com.example.demo.Domain.User;
import com.example.demo.Message.Message;
import com.example.demo.Repository.PostRepository;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Repository.UserRepository;
//import com.example.demo.Service.ListService;
import com.example.demo.Service.PostService;
import com.example.demo.Service.UserService;

@Controller
@RequestMapping(path = "/user")
public class MainController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private PostService postService;
	@Autowired
	private UserService userService;
	// @Autowired
	// private ListService listService;

	@GetMapping("/main")
	public String mainView() {
		return "user/main";
	}

	@GetMapping("/realmain")
	public String realmainView() {
		return "user/realmain";
	}

	@GetMapping("/insertUser")
	public String insertView() {
		return "user/insertUser";
	}

	@PostMapping("insertUser")
	public ModelAndView insert(User user, ModelAndView mav, Model model) {
		if (userRepository.findById(user.getId()).isEmpty()) {
			if (user.getPassword().isEmpty()) {
				mav.addObject("data", new Message("아이디 사용 가능", "/user/insertUser"));
				mav.setViewName("user/message");
				return mav;
			}
			userRepository.save(user);
			mav.addObject("data", new Message("회원 가입 성공", "/user/main"));
			mav.setViewName("user/message");
			return mav;
		} else {
			System.out.println("이미 있는 회원");
			mav.addObject("data", new Message("이미 있는 회원입니다", "/user/insertUser"));
			mav.setViewName("user/message");
			return mav;
		}
	}

	@GetMapping("/login")
	public String loginView() {
		return "user/login";
	}

	@PostMapping("/login")
	public ModelAndView login(User user) throws Exception {

		ModelAndView mav = new ModelAndView();

		if (userRepository.findById(user.getId()).isEmpty()) {
			mav.addObject("data", new Message("없는 회원입니다", "/user/login"));
			mav.setViewName("user/message");
			return mav;
		} else {
			if (user.getPassword().equals(userRepository.findById(user.getId()).get().getPassword())) {
				System.out.println("로그인 성공");
				mav.addObject("data", new Message("로그인 성공", "/user/realmain"));
				mav.setViewName("user/message");
				return mav;
			}
			System.out.println("비밀번호 불일치");
			mav.addObject("data", new Message("비밀번호가 일치하지 않습니다", "/user/login"));
			mav.setViewName("user/message");
			return mav;
		}
	}

	@RequestMapping("/getProductList")
	public String getProductList(Model model, String division) {
		System.out.println("getProductList called");
		System.out.println(division);
		Iterable<Product> plist = productRepository.findByDivision(division);
		model.addAttribute("plist", plist);
		return "user/getProductList";
	}

	@RequestMapping("/post")
	public String getPostList(@ModelAttribute("post") Post post, Model model) {

		List<Post> postList = postService.getPostList();
		model.addAttribute("postList", postList);
		return "user/post";
	}

	@GetMapping("/post/{pn}")
	public String detail(@PathVariable("pn") long pn, Model model) {
		model.addAttribute("post", postService.getPost(pn));
		return "user/detail";
	}

	@GetMapping("/newpost")
	public String newpostview(Principal prin) {
		System.out.println("name : " + prin.getName());
		return "/user/newpost";
	}

	@PostMapping("/newpost")
	public ModelAndView newpost(User user, Post post, ModelAndView mav, Model model) {
		
		/*if (post.getQuestion() == null) {
			mav.addObject("data", new Message("질문을 입력하세요", "/user/newpost"));
			mav.setViewName("user/message");
			return mav;
		}*/
		postRepository.save(post);
		mav.addObject("data", new Message("작성 성공", "/user/post"));
		mav.setViewName("user/message");
		return mav;
	}

	@GetMapping("/mypage")
	public String mypage(/* long uid, */ Model model) {

		// List<list> buyList = listService.getList(uid);
		// model.addAttribute("buyList", buyList);

		return "/user/mypage";
	}
}