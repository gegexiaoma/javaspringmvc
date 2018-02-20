package com.ma.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/my")
public class HelloMvcController {
//		ÍøÖ·£ºhttp://localhost:8080/springMVC/my/test
		@RequestMapping(value="/test",method={RequestMethod.GET,RequestMethod.POST})
		public String test(){
			return "home";
		}
	
}
