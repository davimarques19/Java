package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalarioNumero {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		float valorHora, calculaSalario;
		
		System.out.print("Digite o n�mero do funcion�rio");
		numero = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor hora: ");
		valorHora = sc.nextFloat();
		
		calculaSalario = horasTrabalhadas * valorHora;
		
		System.out.println("O n�mero do funcion�rio �: " + numero);
		System.out.printf("O sal�rio � U$ %.2f", calculaSalario);

	}

}
