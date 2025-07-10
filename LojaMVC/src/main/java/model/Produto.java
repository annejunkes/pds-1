
package model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Produto {
    
    private int id;
    private String descricao;
    private float valor;
    private int qtdEstoque;

    // Método construtor com todos os parâmetros
    public Produto(int id, String descricao, float valor, int qtdEstoque) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;

    }

    // Método construtor com todos os parâmetros menos ID
    public Produto( String descricao, float valor, int qtdEstoque) {
        this.descricao = descricao;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;

    }


    public Produto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getValor() {
        return valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }



    private transient IntegerProperty idProperty;

    public IntegerProperty idProperty() {
        if (idProperty == null) {
            idProperty = new SimpleIntegerProperty(id);
        }
        return idProperty;
    }

    private transient StringProperty descricaoProperty;

    public StringProperty descricaoProperty() {
        if (descricaoProperty == null) {
            descricaoProperty = new SimpleStringProperty(descricao);
        }
        return descricaoProperty;
    }

    private transient StringProperty valorProperty;

    public StringProperty valorProperty() {
        if (valorProperty == null) {
            valorProperty = new SimpleStringProperty(String.valueOf(valor));
        }
        return valorProperty;
    }

    private transient IntegerProperty estoqueProperty;

    public IntegerProperty estoqueProperty() {
        if (estoqueProperty == null) {
            estoqueProperty = new SimpleIntegerProperty(qtdEstoque);
        }
        return estoqueProperty;
    }

}

