package com.jkerak.api;
import com.jkerak.Todo;
import com.jkerak.TodosApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodosApiImpl implements TodosApi {

    public Todo todosIdGet(Long id) {
        Todo todo = new Todo();
        todo.setDescription("Finish me!");
        todo.setId(1L);
        return todo;
    }
}
