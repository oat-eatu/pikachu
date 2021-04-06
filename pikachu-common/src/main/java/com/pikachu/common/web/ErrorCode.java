package com.pikachu.common.web;

/**
 * @author it033
 */
public enum ErrorCode {

    /**
     * 服务器错误
     */
    SERVER_ERROR("500000","服务器异常"),

    /**
     * 参数错误
     */
    PARAM_ERROR("500001","参数错误：");


    private String code;
    private String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
