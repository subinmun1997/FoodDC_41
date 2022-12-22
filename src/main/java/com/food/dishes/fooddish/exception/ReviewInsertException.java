package com.food.dishes.fooddish.exception;

public class ReviewInsertException extends ReviewException {

    private static final String MESSAGE = "Review를 입력하지 못했습니다.";

    public ReviewInsertException() {
        this(MESSAGE);
    }

    public ReviewInsertException(String message) {
        super(message);
    }
}
