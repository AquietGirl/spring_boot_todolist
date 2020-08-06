package com.thoughtworks.springboottodolist.service;

import com.thoughtworks.springboottodolist.dto.RequestTodo;
import com.thoughtworks.springboottodolist.entity.TodoItem;
import com.thoughtworks.springboottodolist.respository.TodoItemRespository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoServiceImplTest {

    @Mock
    private TodoItemRespository todoItemRespository;

    @InjectMocks
    private TodoServiceImpl todoService;

    @Test
    void should_retun_size_2_when_todolist_have_2_item() {
        //given
        List<TodoItem> todoItemList = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            TodoItem todoItem = new TodoItem();
            todoItem.setId(i);
            todoItem.setContent(i + "content");
            todoItem.setStatus("false");
            todoItemList.add(todoItem);
        }
        when(todoItemRespository.findAll()).thenReturn(todoItemList);

        //when
        int result = todoService.getTodoList().size();

        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void should_return_todoitem_id_1_when_add_todoitem_given_todoitem() {
        //given
        TodoItem todoItem = new TodoItem();
        todoItem.setId(1);
        todoItem.setContent("content");
        todoItem.setStatus("false");
        RequestTodo requestTodo = new RequestTodo();
        requestTodo.setContent("content");
        requestTodo.setStatus(false);

        when(todoItemRespository.save(any())).thenReturn(todoItem);

        //when
        String result = todoService.addTodoItem(requestTodo).getId();

        //then
        Assertions.assertEquals("1", result);
    }

    @Test
    void deleteTodoItemById() {
    }

    @Test
    void updateTodoItem() {
    }
}