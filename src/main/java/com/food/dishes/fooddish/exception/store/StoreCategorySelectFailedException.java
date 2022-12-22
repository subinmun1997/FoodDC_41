package com.food.dishes.fooddish.exception.store;

public class StoreCategorySelectFailedException extends StoreCategoryException {

    private static final long serialVersionUID = 1L;
    public static final String MESSAGE = "매장 카테고리 찾기에 실패하였습니다.";

    public StoreCategorySelectFailedException() {
        this(MESSAGE);
    }

    public StoreCategorySelectFailedException(String message) {
        super(message);
    }
}
