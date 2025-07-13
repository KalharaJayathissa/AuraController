package com.example.aurabck.controller;

import com.example.aurabck.datatransfobj.TaskDTO;
import com.example.aurabck.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class TaskController {

    @Autowired
    private TaskService taskService;



    @GetMapping("/gettask")
    public List<TaskDTO> getTask() {
        return taskService.getAllTasks();
    }
}
