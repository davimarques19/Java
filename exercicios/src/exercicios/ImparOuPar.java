package exercicios;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int n;
			
			System.out.println("Digite o número desejado: ");
			n = sc.nextInt();
			
			if (n % 2 == 0) { 
				System.out.println("O número é Par");
			}
			else {
				System.out.println("O número é Impar");
			}
			sc.close();
	}

}
