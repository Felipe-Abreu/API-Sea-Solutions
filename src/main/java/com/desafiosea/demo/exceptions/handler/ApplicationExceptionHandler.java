package com.desafiosea.demo.exceptions.handler;

import com.desafiosea.demo.dto.ApplicationErrorResponse;
import com.desafiosea.demo.exceptions.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Optional;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ApplicationErrorResponse> handleBadRequestException(BadRequestException exception){
        ApplicationErrorResponse errorResponse = new ApplicationErrorResponse();
        errorResponse.setMessage(exception.getMessage());
        return ResponseEntity.badRequest().body(errorResponse);
    }
}
