package com.jsk.mypr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/")  //no입력 상태 / => index.jsp로 포워딩
	public String index() {
		return "index";
	}
	
}
