package com.barath.app;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {
	


	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(Application.class, args);
		ConfigurableBeanFactory beanFactory=applicationContext.getBeanFactory();
		Application app=new Application();
		beanFactory.registerSingleton("testBean", app.new TestClass<String>());		
		TestClass<String> testObj=applicationContext.getBean(TestClass.class);
		testObj.testMethod("hello");
		
	}
	
	public class TestClass<T>{	
		public void testMethod(T t) {
			System.out.println("Test Method");		
		}		
	}
	
	
	
}
