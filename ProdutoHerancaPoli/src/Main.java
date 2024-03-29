import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o n�mero de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados do produto: #" + i);
			System.out.println("O produto � novo, usado ou importado? (n/u/i)");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			if (c == 'u') {
				System.out.print("Data de fabrica��o? (DD/MM/YYYY)");
				Date dataDeFabricacao = sdf.parse(sc.next());
				Produto prod = new ProdutoUsado(nome, preco, dataDeFabricacao);
				lista.add(prod);
			} 
			else if (c == 'i') {
				System.out.print("Taxa alfandega: ");
				double taxaAlfandega = sc.nextDouble();
				Produto prod = new ProdutoImportado(nome, preco, taxaAlfandega);
				lista.add(prod);
			}
			else {
				Produto prod = new Produto(nome, preco);
				lista.add(prod);
			}
		}
		
		System.out.println();
		System.out.println("Etiqueta de pre�os: ");
		
		for (Produto prod : lista) {
			System.out.println(prod.etiquetaDePreco());
		}
		
		
		sc.close();

	}

}
