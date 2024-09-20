package exercicios3e4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Contatinho>contatos = new ArrayList<Contatinho>();
		
		String nomeArquivo = scan.nextLine();
		nomeArquivo = nomeArquivo + ".txt";
		
		Agenda agenda = new Agenda();
		
		agenda.addContatinho(new Contatinho("Ana", "ana@gmail.com","1233","Diretora"));
		agenda.addContatinho(new Contatinho("Dani", "dani@gmail.com","4567","Coordenadora"));
		agenda.addContatinho(new Contatinho("Renato", "renato@gmail.com","9495","Professor"));
			
		agenda.salvarLista(nomeArquivo);
		
		System.out.print("Insira nome que procura: ");
		String nome = scan.nextLine();
		
		Contatinho contatinho = agenda.buscarContatinho(nome, nomeArquivo);
		
		if(contatinho!=null) {
			System.out.println("Contato encontrado");
			System.out.println("Nome: " + contatinho.getNome() + "\n");
			System.out.println("Email: " + contatinho.getEmail() + "\n");
			System.out.println("Telefone: " + contatinho.getTelefone() + "\n");
			System.out.println("Categoria: " + contatinho.getCategoria() + "\n\n");

		}
	}
}
