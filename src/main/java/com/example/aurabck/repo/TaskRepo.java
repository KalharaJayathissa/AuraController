package com.example.aurabck.repo;

import com.example.aurabck.module.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Integer> { //Task is the datatype of the task obj and the integer is the data type of the ky of the  Task obj
}
