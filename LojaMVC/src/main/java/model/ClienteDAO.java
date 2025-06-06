package model;

import dal.ConexaoBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClienteDAO {
    
    public void inserirCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (nome, telefone, endereco, data_nascimento) VALUES (?, ?, ?, ?)";
    
        try (Connection conn = ConexaoBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEndereco());
            stmt.setDate(4, cliente.getDataNascimento());
            
            stmt.executeUpdate();
            System.out.println("O cliente foi inserido no banco!");
        
    }catch(SQLException e){
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
    }
    }
    
    
    public void listarClientes() throws SQLException{
        String sql = "SELECT * FROM cliente";
        
        try (Connection conn = ConexaoBD.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()){
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");
                Date dataNascimento = rs.getDate("data_nascimento");
                
                System.out.println("ID: " + id + 
                        "\nNome: " + nome + 
                        "\nTelefone: " + telefone +
                        "\nEndereco: " + endereco +
                        "\nData nascimento: " + dataNascimento);
                
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar clientes: " + e.getMessage());
        }
        
        
    }
    
}
