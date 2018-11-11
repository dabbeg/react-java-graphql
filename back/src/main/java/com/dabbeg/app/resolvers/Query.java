package com.dabbeg.app.resolvers;

import java.util.ArrayList;
import java.util.List;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import com.dabbeg.app.entities.Todo;
import com.dabbeg.app.enums.Environment;

@Component
public class Query implements GraphQLQueryResolver {

    public List<Todo> todos() {
        List<Todo> todos = new ArrayList<>();

        Todo aTodo = new Todo();
        aTodo.setId(1l);
        aTodo.setName("Bill");
        aTodo.setChecked(false);
        aTodo.setType(Environment.HOME);

        todos.add(aTodo);

        return todos;
    }
}
