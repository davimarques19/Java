package exercicios;

import java.util.Scanner;

public class JogoDuracao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracaoInicio = 1, duracaoFim = 24;
		
		System.out.println("Digite a hora inicial ");
		horaInicial = sc.nextInt();
		System.out.println("Digite a hora final ");
		horaFinal = sc.nextInt();
		
		
		if (horaInicial >= duracaoInicio) {
			System.out.println("O jogo durou horas!");
		}
		else {
			System.out.println("Hora inválida");
		}
		sc.close();
	}

}
