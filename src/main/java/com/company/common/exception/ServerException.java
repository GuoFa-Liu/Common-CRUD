package com.company.common.exception;

/**
 * @author guofa.liu@kingtroldata.com
 * @description
 * @create 2018/11/17 14:24
 */
public class ServerException extends RuntimeException {

    public ServerException() {
    }

    public ServerException(String message) {
        super(message);
    }

    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerException(Throwable cause) {
        super(cause);
    }

    public ServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
