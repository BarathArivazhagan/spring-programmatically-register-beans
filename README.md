# spring-programmatically-register-beans

Spring boot application demonstrates how to use Configurable Application context to register beans programmatically.


### How to register a bean programmatically in spring application context ?

```
ConfigurableApplicationContext applicationContext=SpringApplication.run(Application.class, args);	
ConfigurableBeanFactory beanFactory=applicationContext.getBeanFactory();
beanFactory.registerSingleton("testBean", new Object());
```
