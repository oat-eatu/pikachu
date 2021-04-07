package com.pikachu.common.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author JiaFu.yang
 * @description 邮件校验器
 * @date 2018/1/8
 **/
@Constraint(validatedBy = {EmailValidator.class})
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValid {
    String message() default "无效的邮件地址";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
