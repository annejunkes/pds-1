/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author anneb
 */
public class ProdutoDAO extends GenericDAO{
    
     // Método para salvar usuarios
    public void salvar(Produto produto) throws SQLException {
        String insert = "INSERT INTO produto(descricao, valor, quantidade_estoque) VALUES(?,?,?)";
          save(insert, produto.getDescricao(), produto.getValor(), produto.getQtdEstoque());
    }

     // Método para alterar usuarios
    public void alterar(Produto produto) throws SQLException {
        String update = "UPDATE produto " + "SET descricao = ?, valor = ?, quantidade_estoque = ?"
                + "WHERE id = ?";
		update(update, produto.getId(), produto.getValor(), produto.getQtdEstoque());
    }

    // Método para excluir usuarios
    public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM produto WHERE id = ?";
        delete(delete, id);
    }

     // Método para buscar usuários
    public ObservableList<Produto> selecionarProdutos() throws SQLException {
        ObservableList<Produto> lista = FXCollections.observableArrayList();
        String sql = "SELECT * FROM produto";
        PreparedStatement pstm = conectarDAO().prepareStatement(sql);

        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            Produto produto = new Produto();
            produto.setId(rs.getInt("id"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setValor(rs.getFloat("valor"));
            produto.setQtdEstoque(rs.getInt("quantidade_estoque"));
            lista.add(produto);
        }

        rs.close();
        pstm.close();
        conectarDAO().close();

        return lista;
    }



    // Método para buscar um usuário por ID
    public Usuario selecionarProduto(Long iduser) throws SQLException {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM USUARIOS WHERE ID = ?";
        PreparedStatement pstm = conectarDAO().prepareStatement(sql);
        pstm.setLong(1, iduser);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setFone(rs.getString("fone"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPerfil(rs.getString("perfil"));
            usuario.setEmail(rs.getString("email"));
            usuario.setDataNasc(rs.getDate("dataNasc").toLocalDate());
        }

        rs.close();
        pstm.close();
        conectarDAO().close();

        return usuario;
    }

}
