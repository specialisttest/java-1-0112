package ru.specialist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//List<String> courses = new ArrayList<String>();
		Collection<String> courses = new LinkedList<String>();
		System.out.println(courses.size());
		courses.add( "Java base" );
		courses.add( "Java OOP" );
		courses.add( "Spring" );
		courses.add( "Spring boot" );
		System.out.println(courses.size());
		
		//for(int i = 0; i < courses.size(); i++)
		//	System.out.println(courses.get(i));
		
		/*Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
		}*/
		for(String course : courses)
			System.out.println(course);
		

	}

}
