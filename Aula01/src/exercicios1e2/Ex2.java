package exercicios1e2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quer saber se já existe um arquivo com a tabuada de um número?");
		System.out.println("Digite o número:");
		
		int numero = scan.nextInt();
		
		File tabuadaAnterior = new File("C:\\Users\\anneb\\OneDrive\\Área de Trabalho\\Github\\pds-1\\Aula01\\tabuada_"+numero+".txt");
		
		if(!tabuadaAnterior.exists()) {
			System.out.println("Esse arquivo NÃO existe.");
		}
		else{
			System.out.println("Esse arquivo existe.");
		}
	

	}
	

}
