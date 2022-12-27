package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.vo.Log2ManagerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("log2managerDao")
public class Log2ManagerDaoImpl implements Log2ManagerDao {

    @Autowired
    private JdbcTemplate jTemp;

    @Override
    public void insert(Log2ManagerVO log2Manager) {

    }

    @Override
    public void delete(int logId) {

    }

    @Override
    public void update(int logId, int managerId) {

    }

    @Override
    public List<Log2ManagerVO> selectAll() {
        return null;
    }
}
