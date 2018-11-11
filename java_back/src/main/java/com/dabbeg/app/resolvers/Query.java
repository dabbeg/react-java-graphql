package com.dabbeg.app.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import com.dabbeg.app.entities.Todo;
import com.dabbeg.app.repositories.TodoRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final TodoRepository todoRepository;

    public Iterable<Todo> todos() {
        return this.todoRepository.findAll();
    }
}
