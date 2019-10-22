package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CodigoEQuantidadeLanches {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoItem, quantidade;
		float valor1 = 4f, valor2 = 4.5f, valor3 = 5f, valor4 = 2f, valor5 = 1.5f, resultado;
		
		System.out.println("Digite o código: ");
		codigoItem = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigoItem == 1) {
			resultado = valor1 * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		} 
		else if (codigoItem == 2) {
			resultado = valor2 * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		} 
		else if (codigoItem == 3) {
			resultado = valor3 * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		}
		else if (codigoItem == 4) {
			resultado = valor4 * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		}
		else if (codigoItem == 5) {
			resultado = valor5 * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		}
		sc.close();
	}
}
