package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConvetDecimalToBinary;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ConvetDecimalToBinary convert = new ConvetDecimalToBinary();
		
		System.out.println("Input a decimal number:");
		String myDecimalValue = sc.nextLine();
		
	    convert.setMyDecimalValue(myDecimalValue);
	    
	    System.out.println("Binary number is:"+ convert.convert()); // converte para binário
	    
		sc.close();

	}

}
 