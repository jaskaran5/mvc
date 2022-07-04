package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.bean.Employe;
import com.jsp.service.EmployeService;

@Controller
public class EmployeController {

	Employe emp=new Employe();
	@Autowired
	EmployeService service;
	
	@PostMapping("signup")
	public String addData(@RequestParam("id")int id,@RequestParam("name") String Name,@RequestParam("desi") String designation
			,@RequestParam("sal") double salary, Model model)
	{
		
		emp.setId(id);
		emp.setEmpName(Name);
		emp.setDesignation(designation);
		emp.setSal(salary);
		boolean result=service.addData(emp);
		if(result==true)
		{
			model.addAttribute("res", "your data is added Successfully... ):)");
		}
		else
		{
			model.addAttribute("res", " This Id Data is Already Exist..........");
		}
		return "signup";
		
	}
}
