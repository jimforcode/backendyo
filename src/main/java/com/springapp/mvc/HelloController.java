package com.springapp.mvc;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
 public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object>  printWelcome() {
        Map<String,Object> result =new HashMap<String,Object>();
		result.put("zj","something");
		return result;
	}

}