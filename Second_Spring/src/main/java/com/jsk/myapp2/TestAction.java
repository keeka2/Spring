package com.jsk.myapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestAction {
	//setter injection을 사용하기 위해서는 setMsg리는 setter가 있어야 함
	private int value;
	private String msg;
	
	public void setValue(int value) {
		this.value = value;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public int getValue() {
		return value;
	}
	@RequestMapping("/ex1")
	public ModelAndView ex1() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("str", msg);
		mv.addObject("value", value);
		mv.setViewName("ex1");
		return mv;
	}
}
