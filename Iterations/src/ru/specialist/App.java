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
		
		// 1 2 3 4  ... 10
		// 2 4 6 8  ... 20
		// ...
		
	
	abc:
		for(int i=1; i <= 10; i++ ) { // вывод 10 строк
			for(int j=1; j <= 10; j++) {
				//if (j == 5) goto abc; // C, C++, C#
				if (j == 5) break abc;
				System.out.printf("%-4d", i * j);
			}
			System.out.println();
		}
	
	
		System.out.println("main continue");
		
		
		
		//for(int i=100; i > 0; i -=3)
		//	System.out.println(i);
		
	}

}
