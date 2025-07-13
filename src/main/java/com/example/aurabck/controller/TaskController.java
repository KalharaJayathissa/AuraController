package com.example.aurabck.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class TaskController {

    @GetMapping("/getTask")
    public String getTask() {
        return "api works!!";
    }
}
