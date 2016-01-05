package com.springapp.mvc.service;

import com.springapp.mvc.manager.HelloManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by zj on 16/1/5.
 */
//@Service
@Component
public class HelloService {
    private Integer count = new Integer(1);
//    @Autowired
    @Resource
    private HelloManager helloManager;

    public Integer say() {
        System.out.println("  this is what i want to say , well done , Jim!");
        helloManager.test();
        System.out.println(helloManager);
        return count++;
    }

    @PostConstruct
    public  void iiiii(){
            System.out.println(" 我是  @PostConstruct  哈哈哈哈哈, 我被执行了");
    }
    @PreDestroy
    public  void jjjjjj(){
        System.out.println(" 我是  @PreDestroy  哈哈哈哈哈, 我被执行了");
    }

}
