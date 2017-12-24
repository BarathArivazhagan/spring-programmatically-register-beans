package com.barath.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class DemoClass {
	
	
	@Autowired
	private ConfigurableApplicationContext applicationContext;

	
	public void demoMethod(){
		System.out.println("Demo method");
	}
	
	@PostConstruct
	public void init(){
		
		ConfigurableBeanFactory beanFactory=applicationContext.getBeanFactory();
		beanFactory.registerSingleton("demoBean", new DemoClass());
		beanFactory.registerSingleton("someOtherDemoBean", new DemoClass());
	}

}
