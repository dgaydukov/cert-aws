package com.awssa.webapp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDate;
import com.awssa.webapp.domain.TodoItem;
import com.awssa.webapp.service.TodoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoServiceTest {
    @Autowired
    private TodoService service;

    @Test
    public void testGetAll(){
        assertEquals(service.getAll().size(), 0);
    }

    @Test
    public void testAddOneItem(){
        TodoItem item = new TodoItem();
        item.setName("do it");
        item.setDate(LocalDate.now());
        TodoItem saved = service.add(item);
        assertEquals(saved.getId(), 1);
        assertEquals(service.getAll().size(), 1);
        service.deleteById(saved.getId());
    }

    @Test
    public void testDeleteOneItem(){
        TodoItem item = new TodoItem();
        item.setName("do it");
        item.setDate(LocalDate.now());
        TodoItem saved = service.add(item);
        assertEquals(service.getAll().size(), 1);
        service.deleteById(saved.getId());
        assertEquals(service.getAll().size(), 0);
    }
}
