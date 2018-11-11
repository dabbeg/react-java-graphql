package com.dabbeg.app.repositories;

import org.springframework.data.repository.CrudRepository;
import com.dabbeg.app.entities.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {}
