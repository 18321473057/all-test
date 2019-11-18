package org.line.learn.exception;

public class goingException extends RuntimeException {

    protected String errCode;
    private String arguments;


    public goingException(String errCode, String arguments) {
        this.errCode = errCode;
        this.arguments = arguments;
    }

    public goingException(String errCode) {
        this.errCode = errCode;
    }
}
