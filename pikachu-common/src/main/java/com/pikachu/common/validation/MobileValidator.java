package com.pikachu.common.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JiaFu.yang
 * @description 电话号码校验器
 * @date 2018/1/8
 **/
public class MobileValidator implements ConstraintValidator<MobileValid, String> {
    private static final int PHONE_LENGTH = 11;
    private static final Pattern PHONE_REG = Pattern.compile("^1(2|3|4|5|6|7|8|9)\\d{9}$");

    @Override
    public void initialize(MobileValid mobileValid) {
    }

    @Override
    public boolean isValid(String mobile, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(mobile)) {
            return true;
        }
        return this.isPhone(mobile);
    }

    public boolean isPhone(String phone) {
        if (!StringUtils.hasText(phone)) {
            return false;
        }
        if (phone.length() != PHONE_LENGTH) {
            return false;
        }
        Matcher m = PHONE_REG.matcher(phone);
        return m.matches();
    }


}
