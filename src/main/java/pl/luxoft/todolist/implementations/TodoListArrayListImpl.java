package pl.luxoft.todolist.implementations;

import pl.luxoft.todolist.abstractions.TodoItem;

import java.util.ArrayList;
import java.util.List;

public class TodoListArrayListImpl extends pl.luxoft.todolist.abstractions.TodoList {
    private ArrayList<TodoItem> todos;

    public TodoListArrayListImpl() {
        this.todos = new ArrayList<>();
    }

    @Override
    public void add(TodoItem todo) {
        todos.add(todo);
    }

    @Override
    public void delete(TodoItem todo) {
        todos.remove(todo);
    }

    @Override
    public int length() {
        return todos.size();
    }

}
