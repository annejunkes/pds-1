package exercicios1e2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		File tabuada = new File("tabuada_" + numero + ".txt");
		
		FileWriter fw = new FileWriter(tabuada);
		

		for(int i=0; i<10; i++) {
			
			fw.write(numero + " x " + (i+1) + " = " + (numero*(i+1))+ "\n");
		}
		
		fw.close();

	}

}
