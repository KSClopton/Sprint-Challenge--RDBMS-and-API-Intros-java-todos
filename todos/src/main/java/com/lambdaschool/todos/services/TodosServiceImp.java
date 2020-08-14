package com.lambdaschool.todos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosServices")
public interface TodosServiceImp implements TodosService{
    @Autowired
    private TodoRepository todorepos;

    @Override
    void markComplete(long todoid);
}
