package com.thoughtworks.springboottodolist.controller;

import com.thoughtworks.springboottodolist.dto.ResponseTodo;
import com.thoughtworks.springboottodolist.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoServiceImpl todoService;

    @GetMapping
    public List<ResponseTodo> getTodoList() {
        return todoService.getTodoList();
    }

}
