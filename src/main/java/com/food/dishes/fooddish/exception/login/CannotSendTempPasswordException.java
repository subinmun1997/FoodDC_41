package com.food.dishes.fooddish.exception.login;

public class CannotSendTempPasswordException extends SearchPasswordException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "임시 비밀번호 발급에 실패했습니다.";

    public CannotSendTempPasswordException() {
        this(MESSAGE);
    }

    public CannotSendTempPasswordException(String message) {
        super(message);
    }
}
