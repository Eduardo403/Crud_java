package com.EduardoH.com.crud_Exampel.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    @GetMapping(value = "/")
    public String holaMundo(){
        return "hola mundo!!!";
    }
        }
