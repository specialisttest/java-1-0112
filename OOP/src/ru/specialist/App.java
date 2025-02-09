package ru.specialist;

public class App {
	
//	public static void printCourse(String title, int duration) {
//		System.out.printf("%s - %d\n", title, duration);
//	}

	public static void main(String[] args) {
//		String courseTitle1 = "Java Base";
//		int courseDuration1 = 40;
//
//		String courseTitle2 = "JavaScript Base";
//		int courseDuration2 = 24;
//		
//		//System.out.printf("%s - %d\n", courseTitle1, courseDuration2);
//		printCourse(courseTitle1, courseDuration2);
		
		Course c1 = new Course();
		c1.title = "Java Base";
		c1.duration = 40;
		
		Course c2 = new Course();
		c2.title = "JavaScript";
		c2.duration = 24;
		
		c1.print();
		c2.print();
		
		
	}

}
