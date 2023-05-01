package com.EduardoH.com.crud_Exampel.Controller;

import com.EduardoH.com.crud_Exampel.Model.Task;
import com.EduardoH.com.crud_Exampel.Repositori.AllReositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    private AllReositori allRepositori;

    @GetMapping(value = "/")
    public String holaMundo() {
        return "hola mundo!!!";
    }

    @GetMapping(value = "/tasks")

        public List <Task> getTasks () {
        return allRepositori.findAll();



    }
    @PostMapping(value = "/savetask")
    public String saveTask(@RequestBody Task task){
        allRepositori.save(task);
        return "save task";
    }
}


