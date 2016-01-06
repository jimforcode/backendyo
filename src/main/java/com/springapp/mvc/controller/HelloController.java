package com.springapp.mvc.controller;


import com.springapp.mvc.AppConfig2;
import com.springapp.mvc.DateEditor;
import com.springapp.mvc.LoggingInRequired;
import com.springapp.mvc.MyService;
import com.springapp.mvc.manager.HelloI;
import com.springapp.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

//    	@Resource(name = "helloImpExtra")
//	@Qualifier("helloImpExtra")
    @Autowired
    HelloI helloI;

    @Autowired
    MyService myService;
    @InitBinder
    public void initBinder(WebDataBinder binder) throws Exception {

        DateEditor dateEditor = new DateEditor();
        binder.registerCustomEditor(Date.class, dateEditor);
    }
    @RequestMapping(value = "/date", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> printWelcome(@RequestParam("dataValue") Date dataValue) {
        Map<String, Object> result = new HashMap<String, Object>();

        result.put("dataValue", dataValue);

        return result;
    }

    @RequestMapping(value = "/sayhi", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> sayHi(HttpServletRequest httpServletRequest, @LoggingInRequired String user) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("user", user);
        myService.doWork();
        helloI.sayHi("----------------  sayHi  ----------------------");
        result.put("instance of helloI", helloI.toString());


        myService.doWork();

        return result;
    }


}