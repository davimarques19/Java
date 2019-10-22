package exercicios;

import java.util.Scanner;

public class CalcularMaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiro;
		int segundo;
		int terceiro;
		
		System.out.println("Digite três números");
		primeiro = sc.nextInt();
		segundo = sc.nextInt();
		terceiro = sc.nextInt();
		
		if (primeiro > segundo && primeiro > terceiro) {
			System.out.println(" Higher = " + primeiro);
		}
		else if (segundo > primeiro && segundo > terceiro) {
			System.out.println("Higher = " + segundo);
		}
		else {
			System.out.println("Higher = " + terceiro);
		}
		
		sc.close();
	}

}
