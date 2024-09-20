package exercicios3e4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	Scanner scan = new Scanner(System.in);
	
	//ArrayList<Contatinho>contatos = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		List<Contatinho>contatos = new ArrayList<Contatinho>();
		int cont =0;
		
		System.out.println("Opções: (1)addContatinhos (2)ordenarLista (3)salvarLista (4)buscarContatinho\n"
				+ "Digite uma opção: ");
		int opcao = scan.nextInt();
		
		if(opcao==1) {
		
		addContatinhos(contatos,cont);
		}
		

		
		if(opcao==3) {
		salvarLista(contatos);
		}
		
		if(opcao==4) {
			buscarContatinho(contatos);
			}
		


	}
	
	public static void addContatinhos(List<Contatinho>contatos, int cont) {
		
		Scanner scan = new Scanner(System.in);
		
		Contatinho contato = new Contatinho();
			
		System.out.println("Nome: ");
		String nome = scan.nextLine();
		contato.setNome(nome);
		
		System.out.println("Email: ");
		String email = scan.nextLine();
		contato.setEmail(email);
		
		System.out.println("Telefone: ");
		String telefone = scan.nextLine();
		contato.setTelefone(telefone);
		
		System.out.println("Categoria: ");
		String categoria = scan.nextLine();
		contato.setCategoria(categoria);
		
		contatos.add(contato);
		
		cont = cont +1;
	}
	
	public static void ordenarLista(List<Contatinho>contatos,int cont) {
		
		for(Contatinho c: contatos) {
			
			System.out.println("Nome: " + c.getNome() + "\n");
			
		}
	}
	
	public static void salvarLista(List<Contatinho>contatos) throws IOException {
		
		File lista = new File("lista_de_contatos.txt");
		
		FileWriter fw = new FileWriter(lista,true);
			
		for(Contatinho c: contatos) {
			
			fw.write("Nome: " + c.getNome() + "\n");
			fw.write("Email: " + c.getEmail() + "\n");
			fw.write("Telefone: " + c.getTelefone() + "\n");
			fw.write("Categoria: " + c.getCategoria() + "\n\n");
			
		}

		fw.close();
		
		}
	
	public static void buscarContatinho(List<Contatinho>contatos) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);

		
		File lista = new File("C:\\Users\\anneb\\OneDrive\\Área de Trabalho\\Github\\pds-1\\Aula01\\lista_de_contatos.txt");
		
		String linhas = new String();
		
		Scanner s = new Scanner(System.in);
		Scanner scan = new Scanner(lista);
		
		System.out.println("Digite o nome do contato:");
		String nome = s.nextLine();
		
		scan.nextLine();
		
		while(scan.hasNext()) {
			linhas = scan.nextLine();
		}
		
		if(linhas.contains(nome)) {
			System.out.println(linhas);
		}
	}
		
		
	}


