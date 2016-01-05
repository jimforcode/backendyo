package com.springapp.mvc.controller;



import com.springapp.mvc.manager.HelloI;
import com.springapp.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
 public class HelloController {

	@Autowired
	HelloService helloService;

	@Resource(name = "helloImpExtra")
//	@Autowired
//	@Qualifier("helloImpExtra")
	HelloI helloI;
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object>  printWelcome(HttpServletRequest httpServletRequest) {
        Map<String,Object> result =new HashMap<String,Object>();

 		result.put("httpServletRequest.getRemoteHost()",httpServletRequest.getRemoteAddr()+"| "+helloService);
		result.put("count ",httpServletRequest.getRemoteAddr()+"| "+helloService.say());
		return result;
	}

	@RequestMapping(value = "/sayhi",method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object>  sayHi(HttpServletRequest httpServletRequest) {
		Map<String,Object> result =new HashMap<String,Object>();
			helloI.sayHi("  what ever i 've done!");
		result.put("say","hi");
		return result;
	}



}