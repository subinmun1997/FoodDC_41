package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.exception.menu.OfferTypeException;
import com.food.dishes.fooddish.vo.OfferTypeVO;

import java.util.List;

public interface OfferTypeDao {

    void insert(OfferTypeVO offerType) throws OfferTypeException;
    void delete(String id) throws OfferTypeException;
    void update(String id, String name) throws OfferTypeException;
    OfferTypeVO selectById(String id) throws OfferTypeException;
    OfferTypeVO selectByName(String name) throws OfferTypeException;
    List<OfferTypeVO> selectAll() throws OfferTypeException;
}
