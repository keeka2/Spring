package com.jsk.mb;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mybatis.dao.MemDAO;
import mybatis.vo.MemVO;

@Controller
public class IndexController {
	@Autowired
	private MemDAO mdo;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	//index.jsp 에서 $.ajax를 통해 호출되고 반환을 json으로 해야 하지만 Map임.
	//										==> Map을 Json으로 변환해야함
	@RequestMapping(value="/total", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> total(){
		Map<String,Object> map = new HashMap<String,Object>();
		MemVO[] arr = mdo.getAll();
		map.put("list", arr);
		return map;
	}
}
