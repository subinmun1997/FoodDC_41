package com.food.dishes.fooddish.exception.usertype;

public class UserTypeInsertFailedException extends UserTypeException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "회원 유형을 추가하지 못했습니다.";

    public UserTypeInsertFailedException() {
        this(MESSAGE);
    }

    public UserTypeInsertFailedException(String message) {
        super(message);
    }
}
