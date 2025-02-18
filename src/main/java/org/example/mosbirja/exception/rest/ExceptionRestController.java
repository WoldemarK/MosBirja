package org.example.mosbirja.exception.rest;

import org.example.mosbirja.exception.BondNotFoundException;
import org.example.mosbirja.exception.BondParsingException;
import org.example.mosbirja.exception.ErrorDto;
import org.example.mosbirja.exception.LimitRequestsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionRestController extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BondNotFoundException.class})
    public ResponseEntity<ErrorDto> handleNotFound(Exception ex) {
        return new ResponseEntity<>(new ErrorDto(ex.getLocalizedMessage()),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({BondParsingException.class})
    public ResponseEntity<ErrorDto> handleExceptionFromPriceService(Exception ex) {
        return new ResponseEntity<>(new ErrorDto(ex.getLocalizedMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({LimitRequestsException.class})
    public ResponseEntity<ErrorDto> handleExceptionFromMoex(Exception ex) {
        return new ResponseEntity<>(new ErrorDto(ex.getLocalizedMessage()),
                HttpStatus.TOO_MANY_REQUESTS);
    }
}
