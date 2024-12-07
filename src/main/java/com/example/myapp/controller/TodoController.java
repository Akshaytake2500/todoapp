package com.example.myapp.controller;

import com.example.myapp.model.Todo;
import com.example.myapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable String id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

    @PutMapping("/{id}")
    public void updateTodo(@PathVariable String id, @RequestBody Todo updatedTodo) {
        todoService.updateTodoById(id, updatedTodo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id) {
        todoService.deleteTodoById(id);
    }
}
