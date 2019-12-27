package com.charon.blog.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * @description: 异常处理
 * @author: charon
 * @create: 2019-12-21 11:56
 **/
@ControllerAdvice(basePackages = "com.charon.blog.controller")
public class ControllerExceptionHandler {

    // 打印日志
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    /**
     * 对于异常捕获处理
     *
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView exceptionHandler(HttpServletRequest request,Exception e) throws Exception {
        logger.error("Request URL:{},Exception:{}",request.getRequestURL(),e);
        // 对于存在状态码不进行异常捕获处理
        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!=null){
            throw e;
        }
        // 将地址和异常信息返回
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("url",request.getRequestURL());
        modelAndView.addObject("exception",e);
        modelAndView.setViewName("error/error");
        return modelAndView;
    }
}
