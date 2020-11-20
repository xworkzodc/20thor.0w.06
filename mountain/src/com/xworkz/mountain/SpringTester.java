package com.xworkz.mountain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mountain.part.Virus;

public class SpringTester {

	public static void main(String[] args) {

		System.out.println("starting spring engine");
		
		String configFileName="resources/spring.xml";
		
		ApplicationContext spring=new ClassPathXmlApplicationContext(configFileName);
		
		Virus refOfVirus=spring.getBean(Virus.class);
		refOfVirus.spreadDisease();
		
		String refOfString=spring.getBean(String.class);
		
		System.out.println("refOfString"+ refOfString.isEmpty() +"this is weired thing");
		
		spring.getBean(Thread.class);
	}

}
