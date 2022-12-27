package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.exception.menu.OfferTypeException;
import com.food.dishes.fooddish.exception.menu.OfferTypeSelectException;
import com.food.dishes.fooddish.mapper.OfferTypeMapper;
import com.food.dishes.fooddish.vo.OfferTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("offerTypeDao")
public class OfferTypeDaoImpl implements OfferTypeDao {

    @Autowired
    private JdbcTemplate jTemp;

    @Override
    public void insert(OfferTypeVO offerType) throws OfferTypeException {
        return;
    }

    @Override
    public void delete(String id) throws OfferTypeException {
        return;
    }

    @Override
    public void update(String id, String name) throws OfferTypeException {
        return;
    }

    @Override
    public OfferTypeVO selectById(String id) throws OfferTypeSelectException {
        List<OfferTypeVO> list = null;
        String sql = "SELECT * FROM offer_types WHERE offer_type_id = ?";
        list = jTemp.query(sql, new OfferTypeMapper(), id);
        return (list.size() == 0 ? null : list.get(0));
    }

    @Override
    public OfferTypeVO selectByName(String name) throws OfferTypeSelectException {
        List<OfferTypeVO> list = null;
        String sql = "SELECT * FROM offer_types;";
        list = jTemp.query(sql, new OfferTypeMapper());
        return (list.size() == 0 ? null : list.get(0));
    }

    @Override
    public List<OfferTypeVO> selectAll() throws OfferTypeException {
        List<OfferTypeVO> list = null;
        String sql = "SELECT * FROM offer_types;";
        list = jTemp.query(sql, new OfferTypeMapper());
        return list;
    }
}
