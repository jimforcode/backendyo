package com.springapp.mvc.manager;

import org.springframework.stereotype.Component;

/**
 * Created by zj on 16/1/5.
 */
//@Component
public class HelloImpExtra  implements  HelloI{
    @Override
    public void sayHi(String msg) {
        System.out.println("  HelloI interface implements  "+ msg+" this is  from extra HelloI");

    }
}
