import java.util.Locale;
import java.util.Scanner;

public class FixacaoNext {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price: ");
		double productPrice = sc.nextDouble();
		System.out.println("Enter your last name, age and height:");
		String name2 = sc.next();
		int bedrooms2 = sc.nextInt();
		double height = sc.nextDouble();
				
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.println(productPrice);
		System.out.println(name2);
		System.out.println(bedrooms2);
		System.out.println(height);
		
	}

}
