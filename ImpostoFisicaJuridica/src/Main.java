import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contribuintes;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> lista = new ArrayList<>();
		
		System.out.println("Entre com o n�mero de pagamento: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Taxa de pagamento #" + n);
			System.out.println("Individual ou empresa? (i/e) ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Pre�o: ");
			double rendaAnual = sc.nextDouble();
			if (c == 'i') {
				System.out.println("Gastos com saude: ");
				double gastoSaude = sc.nextDouble();
				Contribuintes con = new PessoaFisica(nome, rendaAnual, gastoSaude);
				lista.add(con);
			}
			else {
				System.out.println("N�mero de empregados: ");
				int numeroFuncionarios = sc.nextInt();
				Contribuintes con = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				lista.add(con);
			}
			
		}
		double soma = 0.0;
		System.out.println();
		System.out.println("Taxas: ");
		for (Contribuintes contribuintes : lista) {
			System.out.println(contribuintes.getNome() + ": $ " + String.format("%.2f", contribuintes.taxa()));
			soma += contribuintes.taxa();
		}
		
		System.out.println();
		System.out.println("Total de taxas: $ " + String.format("%.2f", soma));
		
		sc.close();

	}

}
