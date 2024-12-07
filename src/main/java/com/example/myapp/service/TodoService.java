package com.example.myapp.service;

import com.example.myapp.model.Todo;
import com.example.myapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository = new TodoRepository();

    public List<Todo> getAllTodos() {
        return todoRepository.getAllTodos();
    }

    public Todo getTodoById(String id) {
        return todoRepository.getTodoById(id);
    }

    public void addTodo(Todo todo) {
        todoRepository.addTodo(todo);
    }

    public void deleteTodoById(String id) {
        todoRepository.deleteTodoById(id);
    }

    public void updateTodoById(String id, Todo updatedTodo) {
        todoRepository.updateTodoById(id, updatedTodo);
    }
}
