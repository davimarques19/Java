package exercicios;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o número desejado: ");
		n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("O número é positivo");
		}
		else {
			System.out.println("O número é negativo");
		}
		
		sc.close();

	}

}
