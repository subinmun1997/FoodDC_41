package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.vo.Log2ManagerVO;

import java.util.List;

public interface Log2ManagerDao {

    void insert(Log2ManagerVO log2manager);
    void delete(int logId);
    void update(int logId, int managerId);
    List<Log2ManagerVO> selectAll();
}
