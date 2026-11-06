package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Аннотация @RestControllerAdvice делает класс глобальным перехватчиком ошибок для всех контроллеров
@RestControllerAdvice
public class GlobalExceptionHandler {
    //Аннотация указывает, что этот метод срабатывает, когда где-то выбрасывается RuntimeException
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleNotFound(RuntimeException ex){
        // Вовращает клиенту HTTP- статус 404 (Not Found) и текст ошибки
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
