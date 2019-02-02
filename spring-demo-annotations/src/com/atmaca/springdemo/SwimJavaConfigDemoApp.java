package com.atmaca.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// 
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE < 100);
		System.out.println(Byte.MIN_VALUE);

		int[] resultArr = new int[3];
		System.out.println(resultArr.length);
		resultArr[0] = 1;
		System.out.println(resultArr.length);
		
		// close the context
		context.close();
	}

}
