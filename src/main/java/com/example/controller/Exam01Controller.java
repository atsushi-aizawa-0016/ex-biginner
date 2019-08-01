package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Exam01Form;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	@ModelAttribute
	public Exam01Form setUpForm() {
		return new Exam01Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/exam01-result")
	public String Exam01Result(String name,Model model) {
		model.addAttribute("name", name);
		return "exam01-result";
	}
}
