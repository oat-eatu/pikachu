package com.pikachu.common.web;

import com.pikachu.common.general.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dongyang.yu
 * 通用异常处理
 */
@ControllerAdvice
public class CommonExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);

    @ExceptionHandler(BizException.class)
    @ResponseBody
    public Result<Void> handleBizException(BizException bizException) {
        logger.warn("业务异常", bizException);
        return Result.fail(bizException.getCode(), bizException.getMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public Result<Void> handleBindException(BindException bindException) {
        logger.warn("参数异常{}", bindException.getMessage());
        return Result.fail(ErrorCode.PARAM_ERROR.getCode(), bindException.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Result<Void> handleBindException(MethodArgumentNotValidException bindException) {
        logger.warn("参数异常{}", bindException.getMessage());
        return Result.fail(ErrorCode.PARAM_ERROR.getCode(), bindException.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<Void> handleException(Exception ex) {
        logger.error("内部异常", ex);
        return Result.fail(ErrorCode.SERVER_ERROR.getCode(), ErrorCode.SERVER_ERROR.getMsg());
    }
}
