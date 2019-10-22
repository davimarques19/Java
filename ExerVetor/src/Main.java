import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade = sc.nextInt();
		Quartos[] quarto = new Quartos[10];

		for (int i = 0; i < quantidade; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nomeEstudante = sc.nextLine();
			System.out.print("Email: ");
			String emailEstudante = sc.nextLine();
			System.out.println("Quarto: ");
			int numeroQuarto = sc.nextInt();
			quarto[numeroQuarto] = new Quartos(nomeEstudante, emailEstudante);
		}

		System.out.println("Quartos Alugados: ");
		for (int i = 0; i < quarto.length; i++) {
			if (quarto[i] != null) {
				System.out.println(i + ": " + quarto[i]);
			}
		}
		
		/**
		for (int i = 0; i < quarto.length; i++) {
			System.out.println(i + ": " + quarto[i]);
		}
		**/
		
		sc.close();

	}

}
