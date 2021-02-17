package com.mber.dmdev.level2.lesson20.exception;

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
