package ml.vovchinnikov.template.handler;

import lombok.extern.slf4j.Slf4j;
import ml.vovchinnikov.template.exception.AbstractRestHandleableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private ResponseEntity<RestApiError> buildErrorResponse(Throwable exc, HttpStatus httpStatus,
                                                            ServletWebRequest webRequest) {
        return new ResponseEntity<>(new RestApiError(exc, httpStatus, webRequest), httpStatus);
    }

    @ExceptionHandler(AbstractRestHandleableException.class)
    public ResponseEntity<RestApiError> handlePrintException(ServletWebRequest webRequest,
                                                             AbstractRestHandleableException exc) {
        log.error(exc.getMessage());
        return buildErrorResponse(exc, exc.getHttpStatus(), webRequest);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<RestApiError> handlePrintException(ServletWebRequest webRequest, Throwable exc) {
        log.error(exc.getMessage());
        exc.printStackTrace();
        return buildErrorResponse(exc, HttpStatus.INTERNAL_SERVER_ERROR, webRequest);
    }
}

