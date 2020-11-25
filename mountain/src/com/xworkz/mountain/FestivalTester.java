package com.xworkz.mountain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mountain.part.Festival;
import com.xworkz.mountain.part.Season;

public class FestivalTester {

	public static void main(String[] args) {

		String xmlFile="resources/festival.xml";
		//instantiation...initialize 
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFile);
		Festival refOfFestival=spring.getBean(Festival.class);		
		Season refOfSeason=spring.getBean("festival",Season.class);
		refOfSeason.display();
		refOfFestival.celebration("Srikanth");

		
	}

}
