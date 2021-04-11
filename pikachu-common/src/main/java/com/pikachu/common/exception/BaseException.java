package com.pikachu.common.exception;

import java.lang.reflect.Method;

/**
 * @描述
 * @创建人 jianming.lin
 * @创建时间 2018/08/28
 * @版本
 */
public class BaseException extends RuntimeException{
    private static final long serialVersionUID = -4788884194318781730L;

    private String code;

    private String message;
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 通过反射构建异常信息
     *
     * @param em 异常枚举
     */
    public BaseException(Enum<?> em) {
        try {
            Class<?> clazz = em.getDeclaringClass();
            Method getCode = clazz.getMethod("getCode");
            Method getMessage = clazz.getMethod("getMessage");
            Object[] objs = clazz.getEnumConstants();
            for (Object obj : objs) {
                if (em.name().equals(obj.toString())) {
                    setCode(getCode.invoke(obj).toString());
                    setMessage(getMessage.invoke(obj).toString());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
