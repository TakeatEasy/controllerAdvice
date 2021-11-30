package com.xinghai.demo.exceptionhandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// 添加全局处理异常的注解
@ControllerAdvice
public class GlobalExceptionHandler {

    // 配置对那个异常生效，并且在响应体中返回Json数据
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String exceptionHandle(Exception e) {

        System.out.println(e.getMessage());
        return "exception.class";
    }

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public String runtimeExceptionHandle(RuntimeException e) {

        System.out.println(e.getMessage());
        return "RuntimeException.class";
    }
}
