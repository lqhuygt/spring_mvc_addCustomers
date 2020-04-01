package com.demo.controller;

import com.demo.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmployeeController {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String showEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public  String addEmployee (@ModelAttribute("employee") Employee employee, ModelMap modelMap){
        modelMap.addAttribute("employee", employee);

        return "show-employee";
    }

}
