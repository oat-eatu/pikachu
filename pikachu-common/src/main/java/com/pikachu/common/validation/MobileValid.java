package com.pikachu.common.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author JiaFu.yang
 * @description 移动手机校验器
 * @date 2018/1/8
 **/
@Constraint(validatedBy = {MobileValidator.class})
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MobileValid {
    String message() default "无效的手机号码";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
