package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input any octal number:");
		String myStringValue = sc.nextLine();
		
		int myOctalNumber = Integer.parseInt(myStringValue,8);
		
		String myBinaryNumber = Integer.toBinaryString(myOctalNumber);
		
		System.out.println("Equivalent binary number: "+ myBinaryNumber);
		
		
		sc.close();
	}

}
