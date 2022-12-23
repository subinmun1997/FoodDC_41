package com.food.dishes.fooddish.interceptor;

import com.food.dishes.fooddish.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.User;
import org.springframework.web.servlet.HandlerInterceptor;

public class CheckADInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserVO loginUser = (UserVO)request.getSession(false).getAttribute("loginUser");
        String userType = loginUser.getType().getId();
        if (userType.equals("AD"))
            return true;
        return false;
    }
}
