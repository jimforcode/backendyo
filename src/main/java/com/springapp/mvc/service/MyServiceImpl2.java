package com.springapp.mvc.service;

import com.springapp.mvc.MyService;

/**
 * Created by zj on 16/1/6.
 */
public class MyServiceImpl2 implements MyService{
    @Override
    public void doWork() {
        System.out.println(" this is myserviceImpl2 was invoked ...");
    }
}
