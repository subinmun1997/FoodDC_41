package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.vo.Log2MessageVO;

import java.util.List;

public interface Log2MessageDao {

    void insert(Log2MessageVO log2Message);
    void delete(int logId);
    void update(int logId, String message);
    List<Log2MessageVO> selectAll();
}
