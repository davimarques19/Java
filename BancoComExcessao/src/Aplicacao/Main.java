package Aplicacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta: ");
		System.out.print("Número da conta: ");
		int number = sc.nextInt();
		System.out.print("Gerente: ");
		String holder = sc.next();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Retirar limite: ");
		double limiteDeSaque = sc.nextDouble();
		
		Conta acc = new Conta(number, holder, saldo, limiteDeSaque);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double moeda = sc.nextDouble();
		try {
			acc.saque(moeda);
			System.out.println("New balance: " + String.format("%.2f", acc.getSaldo()));
		}
		catch (Excessao e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
