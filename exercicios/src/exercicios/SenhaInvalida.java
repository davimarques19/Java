package exercicios;

import java.util.Scanner;

public class SenhaInvalida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int receber = sc.nextInt();
		
		while (receber != senha) {
			System.out.println("Senha Inválida!");
			receber = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
	}

}
