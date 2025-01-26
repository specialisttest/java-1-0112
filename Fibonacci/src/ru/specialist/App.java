package ru.specialist;

public class App {

	public static void main(String[] args) {
		int k1 = 1;
		int k2 = 1;
		System.out.println(k1);
		System.out.println(k2);
		
		int k3;
		
		while ( (k3 = k1 + k2) < 1000 ) {
			System.out.println(k3);
			k1 = k2;
			k2 = k3;
		}
		
		

	}

}
