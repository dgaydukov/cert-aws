package com.awssa.webapp.controllers;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.awssa.webapp.domain.TodoItem;
import com.awssa.webapp.service.TodoService;

@RestController
public class ApiController {
    @Autowired
    private TodoService service;

    @GetMapping("/")
    public String getInfo(){
        return "WebApp v2.0";
    }

    @GetMapping("/api/todo")
    public Set<TodoItem> getItems(){
        return service.getAll();
    }

    @PostMapping("/api/todo")
    public TodoItem createItem(@RequestBody TodoItem item){
        return service.add(item);
    }

    @DeleteMapping("/api/todo/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }
}