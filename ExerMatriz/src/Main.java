import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		
		int contador = 0;
		
		int[][] matriz = new int[n][n]; 
		
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		
		System.out.println("Diagonal: ");
		
		for(int i=0; i<matriz.length; i++) {
				System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println("Números negativos: " + contador);
		
		
		sc.close();
	}

}
