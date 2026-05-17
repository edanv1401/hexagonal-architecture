package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.domain.exception.BeverageNotFound;
import etitc.proyecto.domain.exception.DessertNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BeverageNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleBeverageNotFound(BeverageNotFound ex) {
        return Map.of("error", ex.getMessage());
    }

    @ExceptionHandler(DessertNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleDessertNotFound(DessertNotFound ex) {
        return Map.of("error", ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        return Map.of("error", String.format("Invalid value '%s' for parameter '%s'", ex.getValue(), ex.getName()));
    }
}
