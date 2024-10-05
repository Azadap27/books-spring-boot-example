package com.example.book.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BookISBNMismatchException extends RuntimeException {
    public BookISBNMismatchException(String message) {
        super(message);
    }
}
