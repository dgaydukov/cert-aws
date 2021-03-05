package com.awssa.webapp.service;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.springframework.stereotype.Service;
import com.awssa.webapp.domain.TodoItem;

@Service
public class TodoService {
    private SortedSet<TodoItem> items = new TreeSet<>(Comparator.comparingInt(TodoItem::getId));

    public Set<TodoItem> getAll(){
        return items;
    }

    public TodoItem add(TodoItem item) {
        int lastId = 1;
        if(items.size() > 0) {
            lastId = items.last().getId() + 1;
        }
        item.setId(lastId);
        items.add(item);
        return item;
    }

    public void deleteById(int id){
        items.removeIf(i -> i.getId() == id);
    }
}
