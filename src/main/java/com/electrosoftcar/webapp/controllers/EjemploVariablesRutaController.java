/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electrosoftcar.webapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HDAVELLA
 */

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
    
    @Value("${texto.EjemploVariablesRuta.controller.titulo}")
    private String textoindex;
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("titulo", textoindex);
        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model model) {
        model.addAttribute("titulo", "Recibo params de la ruta variable");
        model.addAttribute("resultado", "El texto enviado es: " + texto);
        return "variables/ver";
    }
    
    @GetMapping("/string/{texto}/{numero}")
    public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
        model.addAttribute("titulo", "Recibo params de la ruta variable");
        model.addAttribute("resultado", "El texto enviado es: " + texto + "y el número enviado es: " + numero);
        return "variables/ver";
    }

}
