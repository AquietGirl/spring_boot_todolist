package com.thoughtworks.springboottodolist.service;

import com.thoughtworks.springboottodolist.dto.ResponseTodo;

import java.util.List;

public interface TodoService {

    List<ResponseTodo> getTodoList();
}
