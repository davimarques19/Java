package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Ei", "Ta"};
		
		String path = "C:\\Users\\Hazeredo\\Documents\\teste-escrita.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();			
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
