package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosServices")
public class TodosServiceImp implements TodosService{
    @Autowired
    private TodoRepository todorepos;

    @Override
    void markComplete(long todoid);
}
