package com.food.dishes.fooddish.exception;

public class CartException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CartException(String message) {
        super(message);
    }
}
