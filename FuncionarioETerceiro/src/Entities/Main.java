package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Número de funcionários: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do funcionário #" + i);
			System.out.println("Funcionário terceirizado? (s/n)");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (c == 's') {
				System.out.println("Valor das dispesas adicionais: ");
				double dispesaAdicional = sc.nextDouble();
				Funcionario fun = new FuncionarioTerceiro(nome, horas, valorPorHora, dispesaAdicional);
				lista.add(fun);
			} else {
				Funcionario fun = new Funcionario(nome, horas, valorPorHora);
				lista.add(fun);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		for(Funcionario fun : lista) {
			System.out.println(fun.getName() + " - $ " + String.format("%.2f ", fun.pagamento()));
		}
		
		
		
		
		sc.close();

	}

}
