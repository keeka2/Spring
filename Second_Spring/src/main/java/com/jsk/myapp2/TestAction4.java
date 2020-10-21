package com.jsk.myapp2;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestAction4 {
	@RequestMapping("/ex4_ajax")
	public String ex4_ajax() {
		return "ex4_ajax";
	}
	@RequestMapping("/ex4")
	public Map<String,String> test(String m_id, String m_pw){
		Map<String,String> map = new Hashtable<String,String>();
		System.out.println(m_id+" "+m_pw);
		return map;
	}
}
