package com.awssa.webapp.domain;

import java.time.LocalDate;
import lombok.Data;

@Data
public class TodoItem {
    private int id;
    private String name;
    private LocalDate date;
}
