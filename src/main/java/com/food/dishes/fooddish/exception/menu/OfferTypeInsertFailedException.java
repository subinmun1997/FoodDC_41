package com.food.dishes.fooddish.exception.menu;

public class OfferTypeInsertFailedException extends OfferTypeException {

    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "OfferType을 가져오지 못했습니다.";

    public OfferTypeInsertFailedException() {
        this(MESSAGE);
    }

    public OfferTypeInsertFailedException(String message) {
        super(message);
    }
}
