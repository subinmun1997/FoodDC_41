package com.food.dishes.fooddish.vo;

public class StoreStateVO {

    private int id;
    private String name;

    public StoreStateVO() {}

    public StoreStateVO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
