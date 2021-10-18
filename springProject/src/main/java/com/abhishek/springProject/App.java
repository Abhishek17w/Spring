package com.abhishek.springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/abhishek/springProject/spring.xml");
    	
    	//Vehicle obj = (Vehicle)context.getBean("bike");
    	//obj.drive();
		
		Car t = (Car) context.getBean("car");
    	//System.out.println(t);
    	t.drive();
    }
}
