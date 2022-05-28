package com.greglturnquist.payroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantController {
    
    @RequestMapping(value = "/plants") 
    public String showPlants() {
        return "plants";
    }
}
