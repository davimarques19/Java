package exercicios;

import java.util.Scanner;

public class Diferenca {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Digite o primeiro número: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		b = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		c = sc.nextInt();
		System.out.print("Digite o quarto número: ");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("O resultado da fórmula é: " + diferenca);
		
		sc.close();
	}

}
