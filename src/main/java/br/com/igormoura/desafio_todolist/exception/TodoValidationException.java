package br.com.igormoura.desafio_todolist.exception;

public class TodoValidationException extends RuntimeException {
    public TodoValidationException(String message) {
        super(message);
    }
}