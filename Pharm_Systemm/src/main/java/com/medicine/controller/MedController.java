package com.medicine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.medicine.entity.Medicine;

@Controller
public class MedController {
	@GetMapping("/")
	public String home()
	{
		return "index";
		
	}
	@GetMapping("/add_med")
	public String addMedForm()
	{
		return "add_med";
	}
	@GetMapping("/med_list")
	public String addMedForm1()
	{
		return "med_list";
	}
	@PostMapping("/register")
	public String medRegister(@ModelAttribute Medicine e) 
	{
		System.out.println(e);
		return "add_med";
	}
}
