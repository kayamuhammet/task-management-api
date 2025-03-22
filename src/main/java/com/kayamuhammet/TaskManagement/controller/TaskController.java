package com.kayamuhammet.TaskManagement.controller;

import com.kayamuhammet.TaskManagement.entity.Task;
import com.kayamuhammet.TaskManagement.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    @Operation(summary = "Get all tasks", description = "Get all tasks from the database")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get task by id", description = "Get task by id from the database")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }

    @Operation(summary = "Create task", description = "Create task and save it to the database")
    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update task", description = "Update task by id and save it to the database")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete task", description = "Delete task by id from the database")
    public ResponseEntity<?> deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }
}

