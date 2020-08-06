package com.thoughtworks.springboottodolist.respository;

import com.thoughtworks.springboottodolist.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRespository extends JpaRepository<TodoItem, Integer> {
}
