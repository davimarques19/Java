import java.util.Locale;
import java.util.Scanner;

public class MediaEletroOO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] prod = new Product[n];
		
		for (int i=0; i < prod.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			prod[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		for (int i=0; i < prod.length; i++) {
			soma += prod[i].getPrice();
		}
		
		double media = soma / prod.length;
		
		System.out.printf("Média: %.2f%n", media);
		sc.close();

	}

}
