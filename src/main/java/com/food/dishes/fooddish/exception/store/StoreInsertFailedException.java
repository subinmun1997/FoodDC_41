package com.food.dishes.fooddish.exception.store;

public class StoreInsertFailedException extends StoreException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "매장 등록에 실패하였습니다.";

    public StoreInsertFailedException() {
        this(MESSAGE);
    }

    public StoreInsertFailedException(String message) {
        super(message);
    }
}
