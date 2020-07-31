package com.example.crudgenerator.controller.advice;

import com.example.crudgenerator.dto.ErrorMsg;
import com.example.crudgenerator.exception.NotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class NotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMsg> notFoundHandler(NotFoundException e) {
        return ResponseEntity //
                .status(HttpStatus.NOT_FOUND) //
                .body(new ErrorMsg(e.getMessage()));
    }
}