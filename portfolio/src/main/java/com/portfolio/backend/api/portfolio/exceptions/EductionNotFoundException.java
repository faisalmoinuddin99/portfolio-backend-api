package com.portfolio.backend.api.portfolio.exceptions;

public class EductionNotFoundException extends Exception{

    public EductionNotFoundException() {
    }

    public EductionNotFoundException(String message) {
        super(message);
    }

    public EductionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EductionNotFoundException(Throwable cause) {
        super(cause);
    }

    public EductionNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
