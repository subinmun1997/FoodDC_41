package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.vo.Log2MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("log2messageDao")
public class Log2MessageDaoImpl implements Log2MessageDao {

    @Autowired
    private JdbcTemplate jTemp;

    @Override
    public void insert(Log2MessageVO log2Message) {

    }

    @Override
    public void delete(int logId) {

    }

    @Override
    public void update(int logId, String message) {

    }

    @Override
    public List<Log2MessageVO> selectAll() {
        return null;
    }
}
