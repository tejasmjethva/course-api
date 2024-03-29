package com.springboot.starter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	/**
	 * @RequestMapping annotation maps only GET request by default
	 * 
	 * @return
	 */
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
}
