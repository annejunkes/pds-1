package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Usuario {
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty nome = new SimpleStringProperty();
    private final StringProperty fone = new SimpleStringProperty();
    private final StringProperty login = new SimpleStringProperty();
    private final StringProperty senha = new SimpleStringProperty();
    private final StringProperty perfil = new SimpleStringProperty();

	// Método construtor com todos os parâmetros
	public Usuario(int id, String nome, String fone, String login, String senha, String perfil) {
		this.id.set(id);
		this.nome.set(nome);
		this.fone.set(fone);
		this.login.set(login); 
		this.senha.set(senha);
		this.perfil.set(perfil);
	}

	// Método construtor com todos os parâmetros menos ID
	public Usuario(String nome, String fone, String login, String senha, String perfil) {
		this.nome.set(nome);
		this.fone.set(fone);
		this.login.set(login); 
		this.senha.set(senha);
		this.perfil.set(perfil);
	}

	// Método construtor para o login
	public Usuario(String login, String senha, String perfil) {
		this.login.set(login); 
		this.senha.set(senha);
		this.perfil.set(perfil);
	}

	// Método construtor sem parâmetros
	public Usuario() {

	}

	public IntegerProperty idProperty() {
		return id;
	}
        
        public long getId() {
		return id.get();
	}
        
	public void setId(int id) {
		this.id.set(id);
	}

        public StringProperty nomeProperty() {
		return nome;
	}
	public String getNome() {
		return nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}
        
        public StringProperty foneProperty() {
		return fone;
	}
        
	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
