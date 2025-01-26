package ru.specialist;

public class App {
	
	static boolean B() {
		System.out.println("B()");
		return false;
	}

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c;
		
		// ЛОГИЧЕСКОЕ И (&& и &)
		c = a && b;
		
		// ЛОГИЧЕСКОЕ ИЛИ (|| и |)
		c = a || b;
		
		// ЛОГИЧЕСКОЕ НЕ
		c = !a;
		
		c = !(a && b); // !a || !b
		
		c =  a || !B(); 
		
		int n = -10;
		
		c = (n / 2) == (n - 5);
		/*
			==
			!=
			>
			<
			>=
			<=
		
		*/
		
		c = (n >= 0) && (n <= 100);
		
		//c = (n < 0) || (n > 100);
		
		c = (n < 0) || (n > 100);
				
				
				
		System.out.println( c );
		

	}

}
