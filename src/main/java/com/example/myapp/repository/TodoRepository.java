package com.example.myapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.myapp.model.Todo;

public class TodoRepository {
    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getTodoById(String id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().orElse(null);
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public void deleteTodoById(String id) {
        todos.removeIf(todo -> todo.getId().equals(id));
    }

    public void updateTodoById(String id, Todo updatedTodo) {
        Todo existingTodo = getTodoById(id);
        if (existingTodo != null) {
            existingTodo.setTask(updatedTodo.getTask());
            existingTodo.setCompleted(updatedTodo.isCompleted());
        }
    }
}
