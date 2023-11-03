package com.example.demo1.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * 注解@RestControllerAdvice表示为Spring异常处理类
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理业务异常
     */
    @ExceptionHandler(ServiceException.class)
    public Object handlerServiceException(ServiceException e, HttpServletRequest request) {
        return R.fail(e.getMessage());
    }

}
