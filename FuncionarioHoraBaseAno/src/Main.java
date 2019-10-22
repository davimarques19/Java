import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.ContratoHora;
import Entities.Departamento;
import Entities.Trabalhador;
import Entities.enums.NivelTrabalhor;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String dep = sc.nextLine();
		
		System.out.println("Dados do trabalhador: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível: ");
		String nivel = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trab = new Trabalhador(nome, NivelTrabalhor.valueOf(nivel), salarioBase, new Departamento(dep));
		
		System.out.println("Quantos contratos para o trabalhador? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com o contrato #" + i + " dados: ");
			System.out.print("Data (DD/MM/YYYY): ");
			Date datas = sdf.parse(sc.next());
			System.out.println("Valor Por hora");
			double valorHora = sc.nextDouble();
			System.out.println("Duração: (horas)");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(datas, valorHora, horas);
			trab.addContrato(contrato);
		}
		
		System.out.println();
		System.out.println("Entre com o mês (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome: " + trab.getName());
		System.out.println("Departamento: " + trab.getDepartamento().getNome());
		System.out.println("Calculo: " + mesEAno + ": " + String.format("%.2f", trab.calcular(ano, mes)));
		sc.close();

	}

}
