package exercicios;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int primeiro;
		int segundo;
		int resultado;
		
		System.out.print("Digite o primeiro n�mero: ");
		primeiro = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		segundo = sc.nextInt();		

		resultado = (primeiro + segundo); 
		
		System.out.println("O resultado da soma �: " + resultado);		

	}

}
