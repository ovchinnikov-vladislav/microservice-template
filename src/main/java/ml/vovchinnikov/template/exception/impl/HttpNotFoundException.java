package ml.vovchinnikov.template.exception.impl;

import ml.vovchinnikov.template.exception.AbstractRestHandleableException;
import org.springframework.http.HttpStatus;

public class HttpNotFoundException extends AbstractRestHandleableException {
    public HttpNotFoundException() {
        super(HttpStatus.NOT_FOUND);
    }

    public HttpNotFoundException(HttpStatus httpStatus) {
        super(httpStatus);
    }

    public HttpNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}

