package com.ma.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
	//��ʾSpring MVC����һ��Controller���Լ����ظ��ļ����µ�hello
public class HelloMvcConntroller {
		
		//host:port/hello/mvc
		@RequestMapping("/mvc")
		public String helloMvc(){
			return "home";  //����home.jsp
		}
	
}
