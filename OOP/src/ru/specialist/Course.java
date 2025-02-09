package ru.specialist;

interface Printable {
	void print();
	
}

public class Course implements Printable{

	public String title;
	public int duration;
	
	public void print() {
		System.out.printf("%s - %d\n", title, duration);
	}
}
