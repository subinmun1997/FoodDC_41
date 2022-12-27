package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.vo.LogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("logDao")
public class LogDaoImpl implements LogDao {

    @Autowired
    private JdbcTemplate jTemp;

    @Override
    public void insert(LogVO log) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void updateMessage(int id, String message) {

    }

    @Override
    public void updateManager(int id, int managerId) {

    }

    @Override
    public void selectByManagerId(int managerId) {

    }

    @Override
    public String selectByStoreIdAndStoreStateId(int storeId, int storeStateId) {
        return null;
    }
}
