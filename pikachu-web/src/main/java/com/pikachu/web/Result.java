package com.pikachu.web;


/**
 * @author dongyang.yu
 * Web接口返回包装类
 */
public class Result<T> {
    public Result() {
    }

    private Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    private Result(String code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    /**
     * 请求是否成功
     */
    private boolean success;
    /**
     * 错误信息
     */
    private String msg;
    /**
     * 错误编码
     */
    private String code;
    /**
     * 数据
     */
    private T data;

    public static <T> Result<T> success(T data) {
        return new Result<>(true, data);
    }

    public static <T> Result<T> success() {
        return new Result<>(true, null);
    }


    public static Result<Void> fail(String code, String msg) {
        return new Result<>(code, msg);
    }

    public boolean isSuccess() {
        return success;
    }



    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}
