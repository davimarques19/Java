package exercicios;

import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float area;
		float raio;
		float pi = 3.14159f;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextFloat();
		
		area = (pi * raio * raio);
		
		System.out.printf("O valor da área é: %.4f", area);
		
		sc.close();
	}

}
