package ru.specialist;

public class App {
	
	// IDEA
	// psfi
	// psfs
	// public static final int

	public static void main(String[] args) {
		int radius = 10;
		
		float circleLength = (float) (2 * Math.PI * radius);
		double circleSquare = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("Длина окружности: %.4f\n", circleLength);
		System.out.printf("Пложадь круга: %.4f\n", circleSquare);

	}

}
