package pl.luxoft.todolist.abstractions;

import pl.luxoft.todolist.interfaces.Obtainable;

import java.util.ArrayList;

public abstract class TodoList implements Obtainable {

    public abstract void add(TodoItem todo);

    public abstract int length();

    public abstract void delete(TodoItem todo);
}
