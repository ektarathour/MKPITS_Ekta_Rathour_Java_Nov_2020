package com.mkpits.denoSpringMvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("hello")
	public String hello()
	{
		return "hello.jsp";
	}

}
