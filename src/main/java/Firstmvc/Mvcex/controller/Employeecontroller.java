package Firstmvc.Mvcex.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Firstmvc.Mvcex.person.bean.Employee;
import Firstmvc.Mvcex.person.bean.Person;

@Controller
@RequestMapping("/Employee")
//@SessionAttributes("user")   // we can set the data to this by @modelattribute(user) User user and get the data by @SessionAttribute("user") at method parameters
public class Employeecontroller {
	

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ModelAndView page() {
		return new ModelAndView("Employee", "emp", new Employee()).addObject("headerName", "Add Employee");
	}	
	@RequestMapping(value = "/{id}")
	public ModelAndView add(@PathVariable("id") String id,Employee employee) {
		return new ModelAndView("Employee", "emp",employee).addObject("headerName", "insert Employee");
	}	
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute(value = "emp") Employee emp, BindingResult br,
			ModelMap modelMap) {
         if(br.hasErrors())
         {
        	 return "Employee";
         }
         else
         {
        	 return "view";
         }
         
	}
}
