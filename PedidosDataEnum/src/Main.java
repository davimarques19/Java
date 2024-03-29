import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.PedidoStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.println("Email: ");
		String emailCliente = sc.nextLine();
		System.out.println("Data de nascimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cli = new Cliente(nomeCliente, emailCliente, dataNascimento);
		
		System.out.println("Entre com os dados do pedido: ");
		String statusPedido = sc.nextLine();
		
		System.out.print("Quantos s�o os itens do pedido: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Entre com os dados do pedido #" + i);
			System.out.print("Nome do produto");
			String nome = sc.nextLine();
			System.out.print("Pre�o do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade do produto: ");
			int quantidade = sc.nextInt();
		}
		
		sc.close();
	}

}
