package com.springapp.mvc.service;

import com.springapp.mvc.MyService;

/**
 * Created by zj on 16/1/6.
 */
public class MyServiceImpl implements MyService{
    @Override
    public void doWork() {
        System.out.println("do work was invoked ... ");
    }
}
