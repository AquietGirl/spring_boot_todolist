package com.thoughtworks.springboottodolist.service;

import com.thoughtworks.springboottodolist.dto.ResponseTodo;
import com.thoughtworks.springboottodolist.entity.TodoItem;
import com.thoughtworks.springboottodolist.respository.TodoItemRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoItemRespository todoItemRespository;

    @Override
    public List<ResponseTodo> getTodoList() {
       List<TodoItem> todoItemList = todoItemRespository.findAll();
       List<ResponseTodo> responseTodoList = new ArrayList<>();
       todoItemList.forEach(todoItem -> responseTodoList.add(ResponseTodo.mapResponseTodoToTodoItem(todoItem)));
       return responseTodoList;
    }
}
