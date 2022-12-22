package com.food.dishes.fooddish.exception;

public class ReviewSelectException extends ReviewException {

    private static final String MESSAGE = "Review를 가져오지 못했습니다.";

    public ReviewSelectException() {
        this(MESSAGE);
    }

    public ReviewSelectException(String message) {
        super(message);
    }
}
