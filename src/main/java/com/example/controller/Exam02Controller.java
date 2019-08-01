package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Exam02Form;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@ModelAttribute
	public Exam02Form setUpForm() {
		return new Exam02Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/exam02-result")
	public String Exam02Result(Integer num1,Integer num2,Model model) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		int answer;
		answer = num1 + num2;
		
		return "exam02-result";
	}
	
//	@RequestMapping("/result")
//	public String toPage1() {
//		return "exam02-result";
//	}
	
	@RequestMapping("/result2")
	public String toPage2() {
		return "exam02-result2";
	}
}
