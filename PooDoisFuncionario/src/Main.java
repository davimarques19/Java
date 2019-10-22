import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.print("Nome: ");
		empregado.name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		empregado.bruto = sc.nextDouble();
		System.out.print("Taxa: ");
		empregado.imposto = sc.nextDouble();
		System.out.println("Empregado: " + empregado + "\n");
		System.out.print("Qual a porcentagem para o aumento salarial? ");
		double porcentagem = sc.nextDouble();
		empregado.aumento(porcentagem);
		
		
		
		System.out.print("Dados atualizados: " + empregado + "\n");
		
		sc.close();
	}

}
