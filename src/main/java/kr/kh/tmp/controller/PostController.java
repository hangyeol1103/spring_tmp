package kr.kh.tmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kh.tmp.service.PostService;

@Controller
@RequestMapping("/post") //여기에 있는 모든 것들이 /post라는 url을 포함하고 있고 공통으로 갖고 있어 이럴때 쓸 수 있다.
public class PostController {

	@Autowired
	private PostService postservice;
	
}
