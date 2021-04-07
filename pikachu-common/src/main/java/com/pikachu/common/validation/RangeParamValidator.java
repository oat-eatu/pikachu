package com.pikachu.common.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JiaFu.yang
 * @description 枚举参数输入校验器
 * @date 2018/1/9
 **/
public class RangeParamValidator implements ConstraintValidator<RangeParamValid, Object> {

    private String[] collection;

    private int[] intArray;


    @Override
    public void initialize(RangeParamValid rangeParamValid) {
        collection = rangeParamValid.collection();
        intArray = rangeParamValid.intArr();
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        //目前仅支持常用的数据类型，其他引用类型时，存在bug
        String checkStr = String.valueOf(obj);

        if (obj == null || StringUtils.isEmpty(checkStr)) {
            return true;
        }
        String[] checkStrArr = checkStr.split(",");

        for (String str : checkStrArr) {
            if (!checkStr(str)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkStr(String checkStr) {
        if (intArray != null && intArray.length > 0) {
            int data = Integer.valueOf(checkStr);
            List<Integer> list = new ArrayList<Integer>();
            for (int d : intArray) {
                list.add(d);
            }
            return list.contains(data);
        }

        if (collection != null && collection.length > 0) {
            List<String> list = Arrays.asList(collection);
            return list.contains(checkStr);
        }
        return false;
    }


}
