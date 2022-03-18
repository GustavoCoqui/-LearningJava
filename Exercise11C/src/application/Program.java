package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the radius:");
		double radius = sc.nextDouble();
		
		System.out.println("Perimeter: " + perimeter(radius));
		
		System.out.println("Area: " + area(radius));
		
		sc.close();
	}

	public static double perimeter(double radius) {
		return 2 * Math.PI * radius;	
	}
	
	public static double area(double radius) {
		return Math.PI * Math.pow(radius,2);
	}
}
