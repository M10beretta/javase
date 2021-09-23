package com.mber.topic.core.dmdev.level2.lesson20_exception_handling.exception;

public class MberException extends RuntimeException {
    public MberException() {
    }

    public MberException(String message) {
        super(message);
    }

    public MberException(Throwable cause) {
        super(cause);
    }
}
