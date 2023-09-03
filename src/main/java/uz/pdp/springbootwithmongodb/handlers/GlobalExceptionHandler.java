package uz.pdp.springbootwithmongodb.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import uz.pdp.springbootwithmongodb.domains.entity.ErrorMessage;
import uz.pdp.springbootwithmongodb.exception.DataNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({DataNotFoundException.class})
    public ResponseEntity<ErrorMessage> dataNotFoundExceptionHandler(RuntimeException e) {
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, e.getMessage());
        return ResponseEntity.status(404).body(message);
    }
}
