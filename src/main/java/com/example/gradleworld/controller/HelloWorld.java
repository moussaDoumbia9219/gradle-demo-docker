package com.example.gradleworld.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	private Map<String, Object> result = new HashMap<>();
	
	@RequestMapping("/")
	@ResponseBody
	public Map<String, Object> sayHello() {
		result.put("From", "Moussa Doumbia");
	       result.put("Messge", "Hello World");
	       return result;
	}
}
