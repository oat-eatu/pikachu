package com.pikachu.common.validation;

import com.pikachu.common.util.PhoneFormatCheckUtil;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author JiaFu.yang
 * @description 电话号码校验器
 * @date 2018/1/8
 **/
public class FixTelValidator implements ConstraintValidator<FixTelValid, String> {

    @Override
    public void initialize(FixTelValid fixTelValid) {
    }

    @Override
    public boolean isValid(String tel, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(tel)) {
            return true;
        }

        return PhoneFormatCheckUtil.isFixTel(tel);
    }

}
