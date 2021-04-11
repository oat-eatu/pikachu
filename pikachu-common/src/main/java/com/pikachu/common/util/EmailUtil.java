package com.pikachu.common.util;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JiaFu.yang
 * @description email 校验工具
 * @date 2018/1/8
 **/
public class EmailUtil {

    private static final String emailReg
            = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    public static final boolean isEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return false;
        }
        Pattern regex = Pattern.compile(emailReg);
        Matcher matcher = regex.matcher(email);
        return matcher.matches();
    }

}
