package exercicios3e4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	private List<Contatinho> contatinhos;
	
	public Agenda() {
		
		this.contatinhos=new ArrayList<>();
		
	}
	
	public void addContatinho(Contatinho contato) {
		contatinhos.add(contato);
	}
	
	public void ordenarLista() {
		Collections.sort(contatinhos, Comparator.comparing(Contatinho::getNome));
	}
	
	public void salvarLista(String nomeArquivo) {
		ordenarLista();
		
		try (BufferedWriter wr = new BufferedWriter(new FileWriter(nomeArquivo))) {
			
			for(Contatinho c: contatinhos) {
				wr.write(c.toString()+"\n");
			}
			
		}catch(Exception e) {
			System.out.println("Erro ao salvar arquivo: " +e.getMessage());
		}
	}
	
	//public static void addContatinhos(ArrayList<Contatinho>contatos, int cont) {
		
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
	
	public static void buscarContatinho(ArrayList<Contatinho>contatos) throws FileNotFoundException {
		//Scanner scan = new Scanner(System.in);

		
		File lista = new File("C:\\Users\\anneb\\OneDrive\\Área de Trabalho\\Github\\pds-1\\Aula01\\lista_de_contatos.txt");
		
		String linhas = new String();
		
		Scanner scan = new Scanner(System.in);
		Scanner leArquivo = new Scanner(lista);
		
		System.out.println("Digite o nome do contato:");
		String nome = scan.nextLine();
		
		leArquivo.nextLine();
		
		while(leArquivo.hasNext()) {
			linhas = scan.nextLine();
		}
		
		if(linhas.contains(nome)) {
			System.out.println(linhas.indexOf(nome));
		}
	}
		
		
	}


