package com.diablo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.diablo.dao.EmployeeDAO;

@Controller
public class EditEmployeeController {
@Autowired
EmployeeDAO emp;
	
@RequestMapping("/edit")
public ModelAndView showData() {
    	
        ModelAndView model = new ModelAndView("editEmployeeList");
        model.addObject("employees",emp.viewEmployee());
        return model;
    }
}
