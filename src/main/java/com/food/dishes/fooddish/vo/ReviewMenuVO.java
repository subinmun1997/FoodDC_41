package com.food.dishes.fooddish.vo;

public class ReviewMenuVO {

    private String menuName;
    private int menuAmount;
    private int menuPrice;
    private int menuTotalPrice;

    public ReviewMenuVO(String menuName, int menuAmount, int menuPrice, int menuTotalPrice) {
        this.menuName = menuName;
        this.menuAmount = menuAmount;
        this.menuPrice = menuPrice;
        this.menuTotalPrice = menuTotalPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuAmount() {
        return menuAmount;
    }

    public void setMenuAmount(int menuAmount) {
        this.menuAmount = menuAmount;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public int getMenuTotalPrice() {
        return menuTotalPrice;
    }

    public void setMenuTotalPrice(int menuTotalPrice) {
        this.menuTotalPrice = menuTotalPrice;
    }
}
