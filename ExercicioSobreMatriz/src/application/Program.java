package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � a ordem da matriz?");
		int n = sc.nextInt();
		
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Diagonal principal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
			
		}
		System.out.println();

		
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
				
			}
			
		}
		
		System.out.println("N�meros negativos:"+count);
		
		
		sc.close();
		
		

	}

}
