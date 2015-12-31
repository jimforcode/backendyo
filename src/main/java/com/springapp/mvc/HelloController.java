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
//		model.addAttribute("message", "well done!");

		Map<String,Object> result =new HashMap<String,Object>();
		result.put("zj","something");
        result.put("s",new Person("aaa",1));
		return result;
	}
 class Person{
  private  String aaa;
  private  Integer age;

  public Person(String aaa, Integer age) {
   this.aaa = aaa;
   this.age = age;
  }

  public String getAaa() {
   return aaa;
  }

  public void setAaa(String aaa) {
   this.aaa = aaa;
  }

  public Integer getAge() {
   return age;
  }

  public void setAge(Integer age) {
   this.age = age;
  }
 }
}