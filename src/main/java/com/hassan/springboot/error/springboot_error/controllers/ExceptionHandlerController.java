package com.hassan.springboot.error.springboot_error.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hassan.springboot.error.springboot_error.models.ErrorDTO;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<ErrorDTO> divisionByZero (Exception ex){
        ErrorDTO error = new ErrorDTO();
        error.setDate(new Date());
        error.setError("Cannot perform division by 0!");
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.internalServerError().body(error);
    }
}
