package fr.peaks.my_e_market.exception;

import fr.peaks.my_e_market.business.RuleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EntityExceptionHandler {

    public static Logger LOG = LoggerFactory.getLogger(EntityExceptionHandler.class);
    private static final String NOT_FOUND_ERROR_MESSAGE = "Resource not found :";
//    private static final String INVALID_VALUE_ERROR_MESSAGE = "Resource not found :";

    @ExceptionHandler(value = RuleException.class)
    public ResponseEntity<Object> exception(RuleException exception) {

        LOG.error(exception.getReturnStatus().getMessages().toString(),exception);
        return new ResponseEntity<>(exception.getReturnStatus(), HttpStatus.NOT_FOUND);
    }

//    @ExceptionHandler(value = InvalidValueException.class)
//    public ResponseEntity<Object> exception(InvalidValueException exception) {
//
//        LOG.error(INVALID_VALUE_ERROR_MESSAGE,exception);
//        return new ResponseEntity<>("Invalid value exception : "+exception.getMessage(), HttpStatus.BAD_REQUEST);
//    }
}