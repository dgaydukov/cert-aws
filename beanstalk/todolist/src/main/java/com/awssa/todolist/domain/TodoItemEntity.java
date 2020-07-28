package com.awssa.todolist.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "todo_item")
@Data
public class TodoItemEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String name;
    private LocalDate date;
}
