package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.implementations.TodoItemImpl;

public class BaseTodoItemTest {
    TodoItem todo;
    String todoTitle;

    @BeforeAll
    static void setUpAll() {

    }

    @BeforeEach
    public void setUp(){
        todoTitle = "This is our first todo item.";
        todo = new TodoItemImpl(todoTitle);
    }

    @AfterEach
    public void tearDown() {

    }

    @AfterAll
    static void tearDownAll() {

    }
}
