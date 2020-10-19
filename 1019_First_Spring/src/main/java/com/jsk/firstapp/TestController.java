package com.jsk.firstapp;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	private String msg;
	@RequestMapping("/t1")
	public String ex(HttpServletRequest request) {
		//MVC2에서 Action클래스와 같은 역할
		Date now = new Date(System.currentTimeMillis());
		String now_date = now.toString();
		msg = now_date;
		request.setAttribute("date", now_date);
		return "test"; //views라는 폴더, servlet-context.xml에 정의되있기 때문에 jsp를 안붙여도 됨
	}
	
	@RequestMapping("/t2")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("key", "value");
		mv.addObject("msg", msg);
		mv.setViewName("test2"); //view라는 폴더의 test2.jsp
		return mv;
	}

}
