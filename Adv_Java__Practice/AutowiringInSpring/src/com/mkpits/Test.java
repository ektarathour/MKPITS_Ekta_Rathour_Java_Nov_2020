package com.mkpits;

import org.springframework.context.ApplicationContext;
import org.springframework.context.Support.classPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {

		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
	       A a=context.getBean("a",A.class);
	       

		
		a.display();

		}
		}

