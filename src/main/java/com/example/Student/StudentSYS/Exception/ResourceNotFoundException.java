package com.example.Student.StudentSYS.Exception;

/**
 * Author :-  Aditya Kotasthane
 * Date :- 10/8/2024
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

