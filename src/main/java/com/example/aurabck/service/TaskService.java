package com.example.aurabck.service;


import com.example.aurabck.datatransfobj.TaskDTO;
import com.example.aurabck.entity.Task;
import com.example.aurabck.repo.TaskRepo;
import org.apache.catalina.User;

import org.modelmapper.ModelMapper;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<TaskDTO> getAllTasks() {
        List<Task> taskList = taskRepo.findAll();

        return modelMapper.map(taskList, new TypeToken(){}.getType());

    }


}
