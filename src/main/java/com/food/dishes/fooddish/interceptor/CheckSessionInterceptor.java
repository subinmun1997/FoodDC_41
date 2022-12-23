package com.food.dishes.fooddish.interceptor;

import com.food.dishes.fooddish.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class CheckSessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if(session == null) {
            return false;
        }

        UserVO user = (UserVO)session.getAttribute("loginUser");
        if(user==null) {
            return false;
        }
        return true;
    }
}
