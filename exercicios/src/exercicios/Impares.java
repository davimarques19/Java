package exercicios;

import java.util.Scanner;

public class Impares {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 != 0 ) {
				System.out.println(i);
			}
			
		}
		
		sc.close();		
	}

}
