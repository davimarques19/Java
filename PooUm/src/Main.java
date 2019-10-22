import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.println("Área: " + ret.area() );
		System.out.println( "Perimetro: " + ret.perimetro());
		System.out.println("Diagonal: " + ret.diagonal());
		sc.close();

	}

}
