package br.com.igormoura.desafio_todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.igormoura.desafio_todolist.entity.Todo;
import br.com.igormoura.desafio_todolist.exception.TodoNotFoundException;
import br.com.igormoura.desafio_todolist.exception.TodoValidationException;
import br.com.igormoura.desafio_todolist.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoService {

    private final TodoRepository todoRepository;

    public Todo create(Todo todo) {
        if (todo.getName() == null || todo.getName().isEmpty()) {
            throw new IllegalArgumentException("Nome do Todo é obrigatório");
        }
        if (todo.getDescription() == null || todo.getDescription().isEmpty()) {
            throw new IllegalArgumentException("Descrição do Todo é obrigatória");
        }

        log.info("Criando novo Todo: {}", todo);
        return todoRepository.save(todo);
    }

    public List<Todo> list() {
        log.info("Listando todos os Todos");
        return todoRepository.findAll();
    }

    public Todo update(Long id, Todo updatedTodo) {
        if (updatedTodo.getName() == null || updatedTodo.getName().isEmpty()) {
            throw new TodoValidationException("Nome do Todo é obrigatório");
        }
        if (updatedTodo.getDescription() == null || updatedTodo.getDescription().isEmpty()) {
            throw new TodoValidationException("Descrição do Todo é obrigatória");
        }

        log.info("Atualizando Todo com id: {}", id);
        Todo existingTodo = todoRepository.findById(id)
                .orElseThrow(() -> new TodoNotFoundException("Todo not found with id: " + id));

        existingTodo.setName(updatedTodo.getName());
        existingTodo.setDescription(updatedTodo.getDescription());
        existingTodo.setFulfilled(updatedTodo.isFulfilled());
        return todoRepository.save(existingTodo);
    }

    public void delete(Long id) {
        log.info("Deletando Todo com id: {}", id);
        if (!todoRepository.existsById(id)) {
            throw new TodoNotFoundException("Todo not found with id: " + id);
        }
        todoRepository.deleteById(id);
    }
}
