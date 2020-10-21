package com.jsk.myapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybatis.vo.TestVO;

@Controller
public class TestAction3 {
	@RequestMapping("ex3")
	public String ex3() {
		return "ex3";
	}
	@RequestMapping("ex3_1")
	public void ex3_1(TestVO vo) {
		//request.getParameter 필요없음
		//paramter 이름과 동일해야 함
		System.out.println(vo.getId()+" "+vo.getPw());
		
	}
}
