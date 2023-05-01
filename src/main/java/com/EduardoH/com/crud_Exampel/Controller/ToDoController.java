package com.EduardoH.com.crud_Exampel.Controller;

import com.EduardoH.com.crud_Exampel.Model.Task;
import com.EduardoH.com.crud_Exampel.Repositori.AllReositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping(value = "/update/{id}")

    public String updateTask(@PathVariable long id,@RequestBody Task task ){
        Task updatedTask = allRepositori.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
allRepositori.save(updatedTask);
return "update task";
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deletedTask = allRepositori.findById(id).get();
        allRepositori.delete(deletedTask);
        return "delete task";
    }
}


