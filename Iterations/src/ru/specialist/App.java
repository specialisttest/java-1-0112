package ru.specialist;

public class App {

	public static void main(String[] args) {
		for(int i=1; i <= 10; i++) {
			if (i == 4) continue;
			if (i == 8) break;
			System.out.println(i);
		}
		
		// бесконечный цикл
		//for(;;);
		
		//for(; a < 1000 ;)
		int a = 2000;
		while ( a < 1000 ) {
			System.out.println(a);
			a *= 2; // a = a * 2
		}
		
		a = 1;
		do {
			System.out.println(a);
		} while ( (a *= 2) < 1000 );
		
		
		
		
		//for(int i=100; i > 0; i -=3)
		//	System.out.println(i);
		
	}

}
