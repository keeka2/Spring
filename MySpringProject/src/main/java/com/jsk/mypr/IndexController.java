package com.jsk.mypr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mybatis.vo.UserVO;

@Controller
public class IndexController {
	@RequestMapping("/")  //no입력 상태 / => index.jsp로 포워딩
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")  //no입력 상태 / => index.jsp로 포워딩
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/logincheck", method = RequestMethod.POST)
	public ModelAndView loginCheck(UserVO vo) {
		ModelAndView mv = new ModelAndView();
		System.out.println(vo.getM_id()+" "+vo.getM_pw());
		
		return mv;
	}
}
