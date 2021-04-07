package com.pikachu.common.validation;

import com.pikachu.common.util.EmailUtil;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author JiaFu.yang
 * @description 邮件校验器
 * @date 2018/1/8
 **/
public class EmailValidator implements ConstraintValidator<EmailValid, String> {

    @Override
    public void initialize(EmailValid emailValid) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(email)) {
            return true;
        }
        return EmailUtil.isEmail(email);
    }
}
