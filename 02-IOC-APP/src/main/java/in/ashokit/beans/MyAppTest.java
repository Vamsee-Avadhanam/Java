package in.ashokit.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("beans.xml");
		
		
	}
}
