package com.food.dishes.fooddish.mapper;

import com.food.dishes.fooddish.vo.UserTypeVO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserTypeMapper implements RowMapper<UserTypeVO> {

    @Override
    public UserTypeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        String id = rs.getString("user_type_id");
        String name = rs.getString("user_type_name");
        UserTypeVO userType = new UserTypeVO(id, name);
        return userType;
    }
}
