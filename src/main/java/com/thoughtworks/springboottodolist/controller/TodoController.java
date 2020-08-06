package com.thoughtworks.springboottodolist.controller;

import com.thoughtworks.springboottodolist.dto.RequestTodo;
import com.thoughtworks.springboottodolist.dto.ResponseTodo;
import com.thoughtworks.springboottodolist.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseTodo addTodoItem(@RequestBody RequestTodo requestTodo){
        return todoService.addTodoItem(requestTodo);
    }

    @DeleteMapping("/{id}")
    public ResponseTodo deleteTodoItem(@PathVariable int id) {
        return todoService.deleteTodoItemById(id);
    }

}
