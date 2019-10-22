package exercicios;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a opção desejada: ");
		int opcao = sc.nextInt();
		
		while (opcao != 4) {
			String opcao1 = "1. Álcool";
			String opcao2 = "2. Gasolina";
			String opcao3 = "3. Diesel";
			String opcao4 = "4. Sair";
			opcao = sc.nextInt();
		}
			System.out.println("");
		sc.close();
		
	}

	public static void menu(String x, String y, String z, String w) {
		String opcao1 = "1. Álcool";
		String opcao2 = "2. Gasolina";
		String opcao3 = "3. Diesel";
		String opcao4 = "4. Sair";
	}
}
