package exercicios;

import java.util.Scanner;

public class InOrOut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor: ");
		int n = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {

			int num = sc.nextInt();

			if (num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}

		}

		System.out.println("in: " + in);
		System.out.println("out: " + out);

		sc.close();

	}

}
