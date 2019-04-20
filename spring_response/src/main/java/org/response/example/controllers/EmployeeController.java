package org.response.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.response.example.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController
{
	
	static List<Employee> lists;
	
	
   @GetMapping(value="/getList")
   //@ResponseBody
   public List<Employee> getAllEmployee(Model mod)
   {
	   Employee emp1=new Employee(101,"Mark","new york");
	   Employee emp2=new Employee(102,"Chris Ivans","new jersey");
	   Employee emp3=new Employee(103,"mark rufalo","Down town");
	   lists=new ArrayList<Employee>();
	   lists.add(emp1);
	   lists.add(emp2);
	   lists.add(emp3);
	   System.out.println("all elements are : "+lists);
	   mod.addAttribute("prev", lists);
	   return lists;
   }
   
   @GetMapping(value="/getList/{id}/{name}/{address}")
   //@ResponseBody
   public String addemployee(@PathVariable("id")int id,@PathVariable("name")String name,
		                            @PathVariable("address")String address,
		                            Model mod) throws Exception
   {
	   Employee emp=new Employee(id, name, address);
	   System.out.println(emp);
	   for(Employee temp_emp:lists)
	   {
		   if(temp_emp.getId()==id || temp_emp.getName().equalsIgnoreCase(name) ||
				   temp_emp.getAddress().equalsIgnoreCase(address))
		   {
			   throw new Exception();
		   }
	   }
	   lists.add(emp);
	   System.out.println("after adding : "+lists);
	   mod.addAttribute("total",lists);
	   return "added";
   }
   
   @ExceptionHandler(value=Exception.class)
   public String hadelException(Model mod)
   {
	   String msg="may be one or more of ur provided data alredy present inthe list";
	   mod.addAttribute("error",msg);
       return "exc";
   }
   
   
}
