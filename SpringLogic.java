package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLogic {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca=SpringApplication.run(SpringLogic.class,args);
		
		Student soumya=new Student();
		soumya.setSid(102);
		soumya.setMarks(230);
		soumya.setSname("soumya");

		
		
		Student s=ca.getBean(Student.class);
		
		//System.out.println(s.getSid()+"  "+s.getSname()+"   "+s.getMarks());
		
		
		

	}

}
