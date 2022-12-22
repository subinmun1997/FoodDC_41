package com.food.dishes.fooddish.exception.usertype;

public class UserTypeUpdateFailedException extends UserTypeException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "회원 유형을 수정하지 못했습니다.";

    public UserTypeUpdateFailedException() {
        this(MESSAGE);
    }

    public UserTypeUpdateFailedException(String message) {
        super(message);
    }
}
