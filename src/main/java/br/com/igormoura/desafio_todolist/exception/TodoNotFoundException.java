package br.com.igormoura.desafio_todolist.exception;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(String message) {
        super(message);
    }
}