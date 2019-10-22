package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculaPeca {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
		float valorPeca1, valorPeca2, resultado;
		
		System.out.print("Digite o valor, número da peça e valor da primeira peça: ");
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextFloat();
		System.out.print("Digite o valor, número da peça e valor da segunda peça: ");
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextFloat();
		
		resultado = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
		
		System.out.printf("Valor a pagar: R$ %.2f", resultado);
		
	}

}
