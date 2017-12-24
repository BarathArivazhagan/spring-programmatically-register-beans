package com.barath.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	private ConfigurableApplicationContext applicationContext;

	@Test
	public void testDemoBeanCreation() {
		
		DemoClass demoClazzObj=(DemoClass) applicationContext.getBean("demoBean");
		demoClazzObj.demoMethod();
	}
	
	@Test
	public void testSomeOtherDemoBeanCreation() {
		
		DemoClass demoClazzObj=(DemoClass) applicationContext.getBean("someOtherDemoBean");
		demoClazzObj.demoMethod();
	}

}
