package com.pikachu.common.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author JiaFu.yang
 * @description 固定电话号码校验器
 * @date 2018/1/8
 **/
@Constraint(validatedBy = {FixTelValidator.class})
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FixTelValid {
    String message() default "无效的固定电话号码";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
