package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.abstractions.TodoList;
import pl.luxoft.todolist.implementations.TodoListArrayListImpl;
import pl.luxoft.todolist.implementations.TodoItemImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static pl.luxoft.todolist.matchers.isEmptyTodoList.isAnEmptyTodoList;

public class TodoListTest extends BaseTodoListTest {

    TodoList todoList;
    TodoItem todo;

    @BeforeEach
    public void setUp(){
        todoList = new TodoListArrayListImpl();
        todo = new TodoItemImpl("Task 1");
    }

    @Test
    public void todoItemCanBeAddedToTodoList(){
        todoList.add(todo);
        Assertions.assertEquals(1,todoList.length());
    }

    @Test
    public void todoItemCanBeDeletedFromTodoList(){
        todoList.add(todo);
        todoList.delete(todo);
        Assertions.assertEquals(0,todoList.length());
        assertThat(todoList, isAnEmptyTodoList());
    }
}
