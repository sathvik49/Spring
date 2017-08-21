package com.satvik.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		//create application context(container)
	ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
	//create bean
	 Organization obj = (Organization) ctx.getBean("myorg");
	 //invoke method
     obj.meassage();
     //close the appplication context
     ((FileSystemXmlApplicationContext)ctx).close();

	}

}
