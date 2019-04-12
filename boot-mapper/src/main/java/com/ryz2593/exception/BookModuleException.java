package com.ryz2593.exception;

/**
 * @author ryz2593
 * @date 2019/4/12
 * @desc 图书信息业务异常
 */
public class BookModuleException extends RuntimeException {
    public BookModuleException() {
        super();
    }

    public BookModuleException(String message) {
        super(message);
    }

    public BookModuleException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookModuleException(Throwable cause) {
        super(cause);
    }

    public BookModuleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
