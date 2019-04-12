package org.employee.details.controllers;

import org.employee.details.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class EmployeeController
{
	@GetMapping(value="/display")
	public String dispaly(Model mod)
	{
		mod.addAttribute("emp",new Employee());
		return "empform";
	}
	
	@PostMapping(value="/hit")
	public String checkdetails(@ModelAttribute("emp")Employee emp)
	{
		return "result";
	}
}
