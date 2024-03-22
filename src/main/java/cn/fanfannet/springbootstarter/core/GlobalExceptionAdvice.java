package cn.fanfannet.springbootstarter.core;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        String url = req.getRequestURI();
        String method = req.getMethod();
        return new UnifyResponse(500, "系统异常", method + " " + url);
    }
}
