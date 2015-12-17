package com.springapp.mvc;

import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
/**
 * Created by xiuwwu on 15/12/17.
 */
public class TodoServiceImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public Todo getTodoById(final long id) {
        return entityManager.find(Todo.class, id);
    }

    //@Transactional
    public Todo create(final Todo todo) {
        entityManager.persist(todo);
        return todo;
    }
}
