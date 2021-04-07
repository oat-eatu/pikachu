package com.pikachu.common.exception;

/**
 * 所有业务级别的异常都跑出这个异常
 * 通用业务异常
 * @author dongyang.yu
 */
public class BizException extends RuntimeException {
    private String code;

    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
