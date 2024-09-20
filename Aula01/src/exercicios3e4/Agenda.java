package exercicios3e4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	
	public Contatinho buscarContatinho(String nome, String nomeArquivo) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
			
			String linha;
			while((linha = reader.readLine())!=null){
				
				String partes[] = linha.split("#");
				if(partes.length==4 && partes[0].equalsIgnoreCase(nome)) {
					
					return new Contatinho(partes[0], partes[1], partes[2], partes[3]);
					
				}
				else {
					System.out.println("Nome não encontrado\n");
					break;
				}
				
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		return null;
		
	}
	
}