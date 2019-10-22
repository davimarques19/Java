package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalarioNumero {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		float valorHora, calculaSalario;
		
		System.out.print("Digite o número do funcionário");
		numero = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor hora: ");
		valorHora = sc.nextFloat();
		
		calculaSalario = horasTrabalhadas * valorHora;
		
		System.out.println("O número do funcionário é: " + numero);
		System.out.printf("O salário é U$ %.2f", calculaSalario);

	}

}
