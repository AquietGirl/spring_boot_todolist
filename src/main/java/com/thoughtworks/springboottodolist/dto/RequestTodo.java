package com.thoughtworks.springboottodolist.dto;

public class RequestTodo {
    private String content;
    private boolean status;

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
