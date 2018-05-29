package AOP_Homework_Receipt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Hello {
	public static void main(String[] args) {

		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:AOP/applicationContext.xml");
		Hi hi = context.getBean("hi",Hi.class);
		hi.hello();
		
	}
}
