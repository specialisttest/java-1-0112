package ru.specialist;

public class App {

	public static void main(String[] args) {
		//System.out.printf("0x%X\n", (int)'Ù');
		System.out.print(' ');
		for(int i = 0; i <= 0x0F; i++)
			System.out.printf("%3X", i);
		
		System.out.println();
		
		for(int row = 0; row <= 0x0F; row++) {
			System.out.printf("%X", row);
			
			for(int col = 0; col <= 0xF; col++) {
				char ch = (char)(col * 16 + row);
				if (ch < 0x21 || col == 8 || col == 9) ch = ' ';
				System.out.printf("%3c", ch);
			}
			
			System.out.println();
		}
	}

}
