package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/exam01-result")
	public String Exam01Result() {
		return "exam01-result";
	}
}
