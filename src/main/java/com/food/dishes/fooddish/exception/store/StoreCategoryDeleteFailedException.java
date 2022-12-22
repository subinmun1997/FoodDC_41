package com.food.dishes.fooddish.exception.store;

public class StoreCategoryDeleteFailedException extends StoreCategoryException {

    private static final long serialVersionUID = 1L;
    public static final String MESSAGE = "매장 카테고리 삭제에 실패하였습니다.";

    public StoreCategoryDeleteFailedException() {
        this(MESSAGE);
    }

    public StoreCategoryDeleteFailedException(String message) {
        super(message);
    }
}
