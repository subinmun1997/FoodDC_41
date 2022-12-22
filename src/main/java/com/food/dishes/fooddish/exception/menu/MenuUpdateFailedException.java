package com.food.dishes.fooddish.exception.menu;

public class MenuUpdateFailedException extends MenuException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "MenuUpdate Failed";

    public MenuUpdateFailedException() {
        this(MESSAGE);
    }

    public MenuUpdateFailedException(String message) {
        super(message);
    }
}
