package exercicios;

import java.util.Scanner;

public class Diferenca {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Digite o primeiro n�mero: ");
		a = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		b = sc.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		c = sc.nextInt();
		System.out.print("Digite o quarto n�mero: ");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("O resultado da f�rmula �: " + diferenca);
		
		sc.close();
	}

}
