package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJdbc {

	
	
	
	public static void main(String[] args) {
	ConfigurableApplicationContext ca=SpringApplication.run(SpringLogic.class,args);
	
	EmployeeDao ed=ca.getBean(EmployeeDao.class,args);
	
	Employee ee=new Employee();
	ee.setEid(102);
    ee.setEname("manjula");
    
   ee.setEsalary(2400);
   
	ed.insert(ee);
	
}
}
