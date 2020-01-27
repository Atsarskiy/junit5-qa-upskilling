package pl.luxoft.todolist.implementations;

import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.CannotPassEmptyValueException;

public class TodoItemImpl extends TodoItem {
    private String title;
    private Boolean isCompleted;

    public TodoItemImpl(String title) {
        super();
        this.title = title;
        this.isCompleted = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String newTitle) {
        if (newTitle.isEmpty()) {
            throw new CannotPassEmptyValueException("Title cannot be empty.");
        }
        this.title = newTitle;
    }

    @Override
    public void complete() {
        this.isCompleted = !this.isCompleted;
    }

    @Override
    public boolean isCompleted() {
        return this.isCompleted;
    }

}
