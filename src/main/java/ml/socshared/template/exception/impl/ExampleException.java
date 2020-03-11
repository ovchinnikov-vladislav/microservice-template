package ml.socshared.template.exception.impl;

import ml.socshared.template.exception.AbstractRestHandleableException;
import ml.socshared.template.exception.AswErrors;
import org.springframework.http.HttpStatus;

public class ExampleException extends AbstractRestHandleableException {
    public ExampleException() {
        super(AswErrors.EXAMPLE, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ExampleException(AswErrors errorCode, HttpStatus httpStatus) {
        super(errorCode, httpStatus);
    }
}

