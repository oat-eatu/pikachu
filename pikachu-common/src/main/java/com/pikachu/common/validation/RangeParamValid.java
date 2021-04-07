package com.pikachu.common.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author JiaFu.yang
 * @description 枚举参数输入校验
 * @date 2018/1/9
 **/
@Constraint(validatedBy = {RangeParamValidator.class})
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RangeParamValid {
    String message() default "参数不在范围内";

    String[] collection() default {};

    int[] intArr() default {};

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
