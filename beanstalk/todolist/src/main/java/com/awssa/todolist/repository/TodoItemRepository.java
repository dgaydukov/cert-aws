package com.awssa.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awssa.todolist.domain.TodoItemEntity;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItemEntity, String> {
}
