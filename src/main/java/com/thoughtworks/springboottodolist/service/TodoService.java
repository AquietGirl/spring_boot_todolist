package com.thoughtworks.springboottodolist.service;

import com.thoughtworks.springboottodolist.dto.RequestTodo;
import com.thoughtworks.springboottodolist.dto.ResponseTodo;

import java.util.List;

public interface TodoService {

    List<ResponseTodo> getTodoList();
    ResponseTodo addTodoItem(RequestTodo requestTodo);
    ResponseTodo deleteTodoItemById(int id);
    ResponseTodo updateTodoItem(int id, RequestTodo requestTodo);
}
