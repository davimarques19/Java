import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> func = new ArrayList<>();

		System.out.println("Quantos funcionários deseja adicionar? ");
		int escolha = sc.nextInt();

		for (int i = 0; i < escolha; i++) {
			System.out.print("Digite o id:");
			int id = sc.nextInt();
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o salário: ");
			double salary = sc.nextDouble();
			func.add(new Funcionario(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Funcionario func2 = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func2 == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func2.convert(percentage);
		}

		for (Funcionario x : func) {
			System.out.println(func);
		}

		sc.close();
	}

}
