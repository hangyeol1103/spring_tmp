package kr.kh.tmp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.kh.tmp.model.vo.CommentVO;
import kr.kh.tmp.model.vo.MemberVO;
import kr.kh.tmp.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@ResponseBody
	@PostMapping("/insert")
	public boolean insert(@RequestBody CommentVO comment, HttpSession session) { //CommentVO에 co_po_num과 co_content가 모두 들어가 있기 때문에
		MemberVO user = (MemberVO)session.getAttribute("user");
		return commentService.insertComment(comment, user);
	}
}
