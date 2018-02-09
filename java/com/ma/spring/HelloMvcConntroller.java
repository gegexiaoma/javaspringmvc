package com.ma.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
	//提示Spring MVC这是一个Controller，以及拦截根文件夹下的hello
public class HelloMvcConntroller {
		
		//host:port/hello/mvc
		@RequestMapping("/mvc")
		public String helloMvc(){
			return "home";  //返回home.jsp
		}
	
}
