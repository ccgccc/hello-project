package com.ccg.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping({"", "/hello"})
	public String hello() {
		return "Hello Springboot! This is ccg!";
	}

}
