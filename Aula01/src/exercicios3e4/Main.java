package exercicios3e4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Contatinho>contatos = new ArrayList<Contatinho>();
		int cont =0;
		int opcao;
		
		Agenda agenda = new Agenda();
		
		agenda.addContatinho(new Contatinho("Ana", "ana@gmail.com","1233","Professora"));
		
		agenda.salvarLista("contatinhos.txt");
		
		


	}
}
