package exercicios;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int y;
		
		System.out.println("Digite os n�meros desejados: ");
		n = sc.nextInt();
		y = sc.nextInt();
		
		if (n % 2 == 0 && y % 2 == 0) {
			System.out.println("S�o multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		sc.close();
	}

}
