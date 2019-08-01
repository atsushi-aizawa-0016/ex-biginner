package com.example.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Exam02Number;
import com.example.form.Exam02Form;
import com.example.servise.Exam02Service;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@ModelAttribute
	public Exam02Form setUpForm() {
		return new Exam02Form();
	}
	
	@Autowired
	private Exam02Service service;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/result")
	public String Exam02Result(Exam02Form exam02Form) {
		Exam02Number exam02Number = new Exam02Number();
		exam02Number.setNum1(exam02Form.getIntNum1());
		exam02Number.setNum2(exam02Form.getIntNum2());
		session.setAttribute("exam02Number", exam02Number);
		
		int answer = service.add(exam02Form.getIntNum1(), exam02Form.getIntNum2());
		session.setAttribute("answer", answer);
		
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
