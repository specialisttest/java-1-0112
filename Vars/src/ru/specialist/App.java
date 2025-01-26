package ru.specialist;

/**
 * Main program class
 * @author Sergey Shuykov
 * @since 1.0
 */

class Борщ {
	
	int q; // поля объекта
}

public class App { // pascal notation
	
	int q; // поля объекта
	
	
	public static final String DEFAULT_COLOR = "black";
	
	public static int y; //глобальная переменая
	

	/**
	 * Program entry point
	 * @param args command line parameters
	 * @see java.lang.System
	 */
	public static void main(String[] args) {
		int counter;  // создание переменной
		counter = 5 + 2 * 3;  // присваивание переменной
		
		for(int i=1; i <= 10; i++)
			System.out.println(i);
		
		//System.out.println(i);
		
		// блочный оператор
		{
			int a = 5;
			System.out.println(a);
			{
				System.out.println(a);
				System.out.println(counter);
			}
		}
		
		{
			String a = "abc"; 
			System.out.println(a);
			System.out.println(counter);
		}
		
		System.out.println( counter );
		counter = 17;
		
		
		var userName = "Sergey"; // String userName = "Sergey";
		
		String prefferedUserColor; // camel notation
		prefferedUserColor = null;
		
		
		
		var x = 55; //int x = 55;
		
		int Int; // bad
		
		
		
		x = (counter + 3) * 2;
		int z = x + 5;
		
		x = x + 2; // x += 2;
		
		
		System.out.println( counter );
		System.out.println( x + 5 );
		System.out.println( z );
		System.out.println( y );
		
		//Math.PI
		//Math.E
		
		//Борщ борщ = new Борщ();
		var борщ = new Борщ();
		
		int l = 5;
		Integer p = l; // boxing  new Integer(l)
		l = p; // unboxing
		
		long ll = Long.MAX_VALUE; // implicit conv
		int xx = (int)ll; // explicit conv
		
		System.out.println(ll);
		System.out.println(xx);
		
		ll = 5L;
		
		long m = 2L * Integer.MAX_VALUE ; 
		System.out.println(m);
		
		int h = 0x1F; // 16
		h = 040; // 8
		h = 0b0101;
		
		System.out.println( h );
		
		double d = 2D;
		d = 2e8; // 200000000
		float f = 2.5f;
		// + - * / %
		System.out.println( d );
		
		double cube = Math.pow(2.5, 3);
		System.out.println( cube );
		
		int q = 5;
		double q2 = q / 2D;
		System.out.println(q2);
		
		int n = 10;
		//n *= 2; //n = n*2; // синтаксический сахар
		//n = n + 1;
		//n += 1;
		//n++; // postfix (suffix)
		//++n; // prefix
		
		int a = 10;
		
		//int b = a++ + ++a; // UB in C 
		//       10 +  12
		int b = ++a + a++; // bad
		//       11 +  11
		
		
		
		System.out.println(a); // 12 
		System.out.println(b); // 22
		
		
		/*
			блочный комментарий 
			// строчный комментарий
		
		 */
		
		// utf-16
		char ch = 'A';
		ch = '\t';
		ch = '\u002F';
		System.out.println(ch);
	}

}
