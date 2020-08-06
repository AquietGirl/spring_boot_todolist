package com.thoughtworks.springboottodolist.dto;

import com.thoughtworks.springboottodolist.entity.TodoItem;

public class ResponseTodo {
    private String id;
    private String content;
    private boolean status;

    public static ResponseTodo mapResponseTodoToTodoItem(TodoItem todoItem) {
        ResponseTodo responseTodo = new ResponseTodo();
        responseTodo.setContent(todoItem.getContent());
        responseTodo.setStatus(todoItem.getStatus().equals("true"));
        return responseTodo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
