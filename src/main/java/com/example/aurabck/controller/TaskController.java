package com.example.aurabck.controller;



import com.example.aurabck.DTO.TaskDTO;
import com.example.aurabck.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Dictionary;
import java.util.List;



@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins = {"http://localhost:5173", "https://aurastudyhelp.netlify.app", "https://aurash.netlify.app"})
public class TaskController {

    @Autowired
    private TaskService taskService;



    @GetMapping("/gettasks")
    public List<TaskDTO> getTask() {
        return taskService.getAllTasks();
    }

    @PostMapping("/savetask")
    public TaskDTO saveTask(@RequestBody TaskDTO taskDTO){
        return taskService.createTask(taskDTO);
    }


    @DeleteMapping("/deletetask/{id}")
    public String deleteTask(@PathVariable int id) { return taskService.deleteTask(id);}
}
