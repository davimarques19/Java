package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservas;
import model.excessoes.Excessoes;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Número do quarto: ");
			int number = sc.nextInt();
			System.out.println("Data de entrada (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Data de saída (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());
			
			Reservas reserva = new Reservas(number, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("Entre com a data para atualizar os dados da reserva: ");
			System.out.println("Entrada (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Saída (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			           		  
			reserva.updateDates(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);	
		}
		catch (ParseException e) {
			System.out.println("Data inválida");
		}
		catch (Excessoes e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		
		sc.close();
	}

}
