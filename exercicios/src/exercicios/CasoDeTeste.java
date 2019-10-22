package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CasoDeTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.print("Digite a quantidade de casos: ");
		
		int quantidade = sc.nextInt();
		float result = 0;
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite os valores: ");
			float valor1 = sc.nextFloat();
			
			
			
			result = (quantidade * 2);
			
		}
		
		System.out.println("Reultado: " + result);
		sc.close();
	}

}
