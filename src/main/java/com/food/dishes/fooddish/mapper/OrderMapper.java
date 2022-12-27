package com.food.dishes.fooddish.mapper;

import com.food.dishes.fooddish.vo.OrderVO;
import com.food.dishes.fooddish.vo.UserVO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<OrderVO> {

    @Override
    public OrderVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderVO order = new OrderVO();
        UserVO user = new UserVO();
        order.setId(rs.getInt("order_id"));
        user.setId(rs.getInt("user_id"));
        order.setUser(user);
        order.setOrderDate(rs.getTimestamp("order_order_date"));
        order.setReserveDate(rs.getTimestamp("order_reserve_date"));
        order.setPickupDate(rs.getTimestamp("order_pickup_date"));
        order.setPrice(rs.getInt("price"));
        return order;
    }
}
