package com.food.dishes.fooddish.exception.login;

public class SendEmailFailedException extends LoginException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "메일 전송에 실패했습니다.";

    public SendEmailFailedException() {
        this(MESSAGE);
    }

    public SendEmailFailedException(String message) {
        super(message);
    }
}
