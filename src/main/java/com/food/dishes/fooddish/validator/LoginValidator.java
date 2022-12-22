package com.food.dishes.fooddish.validator;

import com.food.dishes.fooddish.command.LoginCommand;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(LoginCommand.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginCommand login = (LoginCommand) target;
        String email = login.getEmail();
        String password = login.getPassword();
        if (email==null||email.trim().equals("")) {
            errors.rejectValue("email", "email:required", "메일주소가 입력되지 않았습니다.");
        }
        if (password==null||password.trim().equals("")) {
            errors.rejectValue("password", "password:required", "비밀번호가 입력되지 않았습니다.");
        }
    }
}
