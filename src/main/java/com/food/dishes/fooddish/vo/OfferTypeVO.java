package com.food.dishes.fooddish.vo;

public class OfferTypeVO {

    private String id;
    private String name;

    public OfferTypeVO() {}

    public OfferTypeVO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
