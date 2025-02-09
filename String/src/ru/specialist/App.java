package ru.specialist;

public class App {
	
	public static String toBinary(int n) {
		char[] bits = new char[4];
		for(int i = 3; i >= 0; i--) {
			bits[i] = ( (n & 1) == 0) ? '0' : '1';
			n >>= 1; // n = n >> 1;
		}
		return new String(bits);
	}

	public static void main(String[] args) {
		// 5 0101 >> 1 = 0010
		// 
		
		System.out.println( toBinary(5) ); // 00000101
		System.out.println( toBinary(7) ); // 00000111
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		String s5 = new String(new char[] {'a', 'c'}); // "ac"
		
		String s3 = "cde"; //new 
		String s4 = "cde";
		
		String s6 = "cd\t\n\" \\ \u002F";
		System.out.println(s6);
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s2));
		
		String hello = "Привет";
		String name = "Сергей";
		
		String r = hello + " " + name + "!";
		
		/*
		 * "Привет"
		 * "Привет "
		 * "Привет Сергей"
		 * "Привет Сергей!"
		 * 
		 */
		
		
		System.out.println( r );
		System.out.println( r.length() );
		System.out.println( r.charAt(0) ); // П
		System.out.println( r.charAt( r.length()-1 ) ); // !
		
		System.out.println( r.contains("Сергей") );
		System.out.println( r.indexOf("Сергей") );
		System.out.println( r.trim() );
		System.out.println( r.substring(7) );
		System.out.println( r.substring(7, 13) );
		System.out.println( r = r.replace("Сергей", "Андрей") );
		System.out.println( r );
		System.out.println( r.toUpperCase() );
		System.out.println( r.toLowerCase() );
		System.out.println( r );
		
		
		// VERY BAD (fired!!!)
//		String result = "";
//		for(int i=1; i <= 100; i++)
//			result += String.valueOf(i) + " ";
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i <= 100; i++)
			sb.append(i).append(" ");
		
		String result = sb.toString();
			
		System.out.println( result );
		
		
		int a = 5; // 0101
		int b = 7; // 0111
		
		int c = a & b; // 0101
		c = a | b; // 0111
		c = ~a; // 1000
		
		c = b << 2; // 0111 << 2 == 011100
		c = b >> 2; // 0101 >> 2 == 0001
		
		// 00001
		c = (a >> 1) & 1;
		
		System.out.println(c);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
