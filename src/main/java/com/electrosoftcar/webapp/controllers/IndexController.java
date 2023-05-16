/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.electrosoftcar.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author hdavella
 */
@Controller
//@RequestMapping("/")

public class IndexController {
    
    @GetMapping({"/", "/index"})
    
    public String index(Model model){
        
        return "prueba";
    
    }

}
