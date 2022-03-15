package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input any octal value:");
		String myStringValue = sc.nextLine();
		
		int myDecimalValue = Integer.parseInt(myStringValue,8);
		
		
		System.out.println("Equivalent decimal value: " + myDecimalValue);
		
		
		
		sc.close();
		
		
	}

}
