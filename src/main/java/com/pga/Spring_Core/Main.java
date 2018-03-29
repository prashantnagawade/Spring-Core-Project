package com.pga.Spring_Core;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Date d = (Date)ctx.getBean("date");
		System.out.println("Date using Spring :\n" + d);

		try {
			Thread.sleep(4000);
		} catch (Exception e) {e.printStackTrace();}

		Date d2 = (Date)ctx.getBean("date");
		System.out.println("\nDate using Spring : (same Date as spring creates all singleton classes!)\n" + d2);

		//STUDENT
		//C'tor based...
		Student s1 = (Student)ctx.getBean("stud1");
		System.out.println("\n\n C'tor based... "+s1);

		//Setter based...
		Student s2 = (Student)ctx.getBean("stud2");
		System.out.println("Setter based... "+s2);
	}
}
