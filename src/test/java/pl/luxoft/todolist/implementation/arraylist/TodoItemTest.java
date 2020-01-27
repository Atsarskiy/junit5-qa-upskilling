package pl.luxoft.todolist.implementation.arraylist;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.CannotPassEmptyValueException;
import pl.luxoft.todolist.implementations.TodoItemImpl;

@Tag("all")
public class TodoItemTest extends BaseTodoItemTest {



    @Test
    public void todoItemIsNotNullAfterCreation() {
//        TodoItem todo = new TodoItemImpl("This is our first todo item.");
        Assertions.assertNotNull(todo.getTitle());

    }

    @Test
//    @Disabled
    public void todoItemAsTheSameAsAssignedWhileCreating(){
//        String todoTitle = "Get familiar with JUnit 5 user guide.";
//        TodoItem todo = new TodoItemImpl(todoTitle);
        Assertions.assertEquals(todoTitle,todo.getTitle(),"Title is not the same as assigned while creating.");
    }

    @Test
    public void todoItemTitleCanBeChanged(){
        String newTitle = "New todo item title";
//        TodoItem todo = new TodoItemImpl("This is our first todo item.");
        todo.setTitle(newTitle);
        Assertions.assertEquals(newTitle,todo.getTitle());
    }

    @Test
    public void todoItemCannotHaveEmptyTitle() {
//        TodoItem todo = new TodoItemImpl("This is our first todo item.");
        Assertions.assertThrows(CannotPassEmptyValueException.class,() -> todo.setTitle(""));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/todos.csv")
    public void todoItemAsTheSameAsAssignedWhileCreatingCsvInput(String todoItemTitle){
        TodoItem todo = new TodoItemImpl(todoItemTitle);
        Assertions.assertEquals(todoItemTitle,todo.getTitle(),"Title is not the same as assigned while creating.");
    }

    @Test
    public void todoItemCanBeMarkedCompleted(){
        todo.complete();
        Assertions.assertTrue(todo.isCompleted());
    }

    @Test
    public void todoItemIsNotCompletedAfterCreation(){
        Assertions.assertFalse(todo.isCompleted());
    }

    @Test
    public void todoItemMarkedNotCompletedAfterSecondToggling(){
        todo.complete();
        todo.complete();
        Assertions.assertFalse(todo.isCompleted());
    }
}
