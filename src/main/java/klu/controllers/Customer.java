package klu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import klu.model.Employee;
import klu.model.EmployeeManager;

@Controller
@RequestMapping("/employee")
public class Customer {

	@Autowired
	EmployeeManager em;
	
	@RequestMapping(path="/emp")
	public String showpage() {
		return "emp";
	}
	
	@RequestMapping(path ="/save" , method = RequestMethod.POST)
	public String save(@ModelAttribute Employee employee) {
        System.out.println("Saving employee: " + employee);
        em.saveData(employee);
        return "savepage"; // Redirect to a success page
    }
	
}
