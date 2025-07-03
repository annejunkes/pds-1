package model;

import java.sql.Date;


public class Cliente {
    
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private Date dataNascimento;
    
    public Cliente(int id, String nome, String telefone, String endereco, Date dataNascimento){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public Cliente(String nome, String telefone, String endereco, Date dataNascimento){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public Cliente(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    
    
    
}
