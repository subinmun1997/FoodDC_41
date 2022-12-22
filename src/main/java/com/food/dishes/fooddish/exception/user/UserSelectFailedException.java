package com.food.dishes.fooddish.exception.user;

import com.food.dishes.fooddish.exception.login.LoginException;

public class UserSelectFailedException extends LoginException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "회원정보를 불러오지 못했습니다.";

    public UserSelectFailedException() {
        this(MESSAGE);
    }

    public UserSelectFailedException(String message) {
        super(message);
    }
}
