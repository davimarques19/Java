import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Entre com o número da conta: ");
		int conta = sc.nextInt();
		System.out.println("Entre com o titular da conta: ");
		String titular = sc.next();

		System.out.println("Deseja iniciar com um depósito? s/n");
		char escolha = sc.next().charAt(0);

		if (escolha == 'y') {
			System.out.print("Entre com o valor a ser depositado: ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(titular, conta, depositoInicial);
		}
		else {
			banco = new Banco(titular, conta);
		}
		
		System.out.println("Dados da conta: \n" + banco);
		
		System.out.print("Entre com o valor a ser depositado: ");
		double saldo = sc.nextDouble();
		banco.deposito(saldo);
		System.out.println("Dados da conta atualizados: \n" + banco);
		
		System.out.println("Quanto deseja sacar? ");
		double valor = sc.nextDouble();
		banco.setSaque(valor);
		System.out.println("Dados da conta atualizados: \n" + banco);

		sc.close();

	}

}
