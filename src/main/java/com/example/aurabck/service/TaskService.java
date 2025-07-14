package com.example.aurabck.service;


import com.example.aurabck.DTO.TaskDTO;
import com.example.aurabck.module.Task;
import com.example.aurabck.repo.TaskRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.ModelMapper;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
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
        return modelMapper.map(taskList, new TypeToken<List<TaskDTO>>(){}.getType());

    }

    public TaskDTO createTask(TaskDTO taskdto){
        Task task = modelMapper.map(taskdto, Task.class);

        Task saved = taskRepo.save(task);

        return modelMapper.map(saved, TaskDTO.class);
        //return taskdto;
    }

    public String deleteTask(int id) {
         taskRepo.deleteById(id);
         return "Deleted";
    }


}
