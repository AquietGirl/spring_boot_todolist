package com.thoughtworks.springboottodolist.dto;

import com.thoughtworks.springboottodolist.entity.TodoItem;

public class RequestTodo {
    private String content;
    private boolean status;

    public static TodoItem mapRequestTodoToTodoItem(RequestTodo requestTodo) {
        TodoItem todoItem = new TodoItem();
        todoItem.setContent(requestTodo.content);
        todoItem.setStatus(requestTodo.status ? "true" : "false");
        return todoItem;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
