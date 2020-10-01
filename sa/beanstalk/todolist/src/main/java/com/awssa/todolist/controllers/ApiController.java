package com.awssa.todolist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.awssa.todolist.domain.TodoItemEntity;
import com.awssa.todolist.repository.TodoItemRepository;

@RestController
public class ApiController {
    @Autowired
    private TodoItemRepository repository;

    @GetMapping("/")
    public String getInfo(){
        return "Todolist App v1.0";
    }

    @GetMapping("/api/todo")
    public List<TodoItemEntity> getItems(){
        return repository.findAll();
    }

    @PostMapping("/api/todo")
    public TodoItemEntity createItem(@RequestBody TodoItemEntity entity){
        return repository.save(entity);
    }

    @DeleteMapping("/api/todo/{id}")
    public void createItem(@PathVariable String id){
        repository.deleteById(id);
    }
}