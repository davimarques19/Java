package exercicios;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int n;
			
			System.out.println("Digite o n�mero desejado: ");
			n = sc.nextInt();
			
			if (n % 2 == 0) { 
				System.out.println("O n�mero � Par");
			}
			else {
				System.out.println("O n�mero � Impar");
			}
			sc.close();
	}

}
