package ml.vovchinnikov.template.exception.impl;

import ml.vovchinnikov.template.exception.AbstractRestHandleableException;
import org.springframework.http.HttpStatus;

public class HttpBadRequestException extends AbstractRestHandleableException {
    public HttpBadRequestException() {
        super(HttpStatus.BAD_REQUEST);
    }

    public HttpBadRequestException(HttpStatus httpStatus) {
        super(httpStatus);
    }

    public HttpBadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}