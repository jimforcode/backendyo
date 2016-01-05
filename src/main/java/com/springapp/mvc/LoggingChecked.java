package com.springapp.mvc;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by zengjin on 2016/1/5.
 */
public class LoggingChecked  implements HandlerMethodArgumentResolver
         {
             @Override
             public boolean supportsParameter(MethodParameter methodParameter) {

                 System.out.println("-------------------");

                 return true;
             }

             @Override
             public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
                 System.out.println("+++++++++++++++++++++");
                 boolean required = methodParameter.getParameterAnnotation(LoggingInRequired.class) != null;
                  if(required){
                      System.out.println("attribute is " + nativeWebRequest.getAttribute("user",nativeWebRequest.SCOPE_REQUEST));
                      System.out.println("parameter is " + nativeWebRequest.getParameter("user"));

                      return new String("OOOOO");
                  }


                 return new String("XXXXXXX");
             }
         }
