package ru.specialist;

import java.io.Closeable;

class DBConnection implements Closeable {
	
	public DBConnection() {
		System.out.println("open connection");
	}
	
	public void execute() {
		System.out.println("query db");
		throw new IllegalArgumentException();
	}
	
	public void close() {
		System.out.println("close connection");
	}
}

public class App {

	public static void test(String s1, String s2) throws Exception {
		try {
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			
			if (n1 < 0 || n1 > 100)
				//throw new IllegalArgumentException("n1 out of [0..100]"); // uncontrolled
				throw new Exception("n1 out of [0..100]"); // controlled
			
			int n = n1 / n2;
			
			System.out.println(n);
		}
		catch(ArithmeticException ex) {
			System.out.println( ex.getMessage() );
		}
		//catch(NumberFormatException | ArithmeticException ex) { // since Java 7
		//catch(NumberFormatException ex) {
		catch(RuntimeException ex) {
			System.out.println( ex.getMessage() );
		}
		finally {
			System.out.println("finally");
			return;
		}
		//System.out.println("continue test");
	}
	
	public static void main(String[] args) throws Exception {
		try {
			test("156", "4");
		}
		catch(ArithmeticException ex) {
			System.out.println( ex.getMessage() );
		}		
		System.out.println("continue main");
		
		/*DBConnection db = new DBConnection();
		try {
			db.execute();
			db.execute();
		}
		finally {
			db.close();
		}*/
		
		// Ресурсный try
		try(DBConnection db1 = new DBConnection();
			DBConnection db2 = new DBConnection()) {
			db1.execute();
			db2.execute();
		} // db.close()

	}

}
