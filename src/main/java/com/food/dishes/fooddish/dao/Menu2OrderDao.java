package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.vo.Menu2OrderVO;
import com.food.dishes.fooddish.vo.Menu2OrderViewVO;

import java.util.List;

public interface Menu2OrderDao {

    void insert(Menu2OrderVO menu2Order);
    void delete(Menu2OrderVO menu2Order);
    public List<Menu2OrderViewVO> selectAll();
    public List<Menu2OrderViewVO> selectAllMenu2OrderView(int orderId);
}
