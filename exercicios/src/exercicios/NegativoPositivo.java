package exercicios;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o n�mero desejado: ");
		n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("O n�mero � positivo");
		}
		else {
			System.out.println("O n�mero � negativo");
		}
		
		sc.close();

	}

}
