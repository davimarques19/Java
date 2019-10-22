import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		ConverterMoeda conv = new ConverterMoeda();
		
		
		System.out.println("Qual o preço do dollar atualmente? ");
		conv.cotacaoDolar = sc.nextDouble();
		System.out.println("Quantos dolares deseja comprar? ");
		conv.quantidade = sc.nextDouble();
		System.out.println();
		System.out.println("Valor em reais a ser pago: " + conv);
		
		sc.close();
		
	}

}
