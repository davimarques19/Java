package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float escolha;
		
		System.out.println("Digite o número: ");
		escolha = sc.nextFloat();
		
		if (escolha >= 0 && escolha <= 25) {
			System.out.println("Intervalo (0, 25]");
		}
		else if (escolha > 25 && escolha <= 50) {
			System.out.println("Intervalo (25, 50]");
		}
		else if (escolha > 50 && escolha <= 75) {
			System.out.println("Intervalo (50, 75]");
		}
		else if (escolha > 75 && escolha <= 100) {
			System.out.println("Intervalo (75, 100]");
		} 
		else {
			System.out.println("Fora do Intervalo");
		}
		sc.close();
	}

}
