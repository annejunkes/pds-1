
package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import model.Cliente;
import model.ClienteDAO;
import util.AlertaUtil;
public class ClienteController {
    
    ClienteDAO clienteDAO;
    
    private Stage stageCliente;
    
   
    @FXML
    private Button btnSalvar;
    
    @FXML
    private TilePane tilePaneLista;

    @FXML
    private TextField txtDataNascimento;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;

    @FXML
    void btnSalvarClick(ActionEvent event) throws SQLException {
                
                if(txtNome.getText().isEmpty()  || txtNome.getText().isBlank() || 
                    txtTelefone.getText().isEmpty() || txtTelefone.getText().isBlank() ||
                    txtEndereco.getText().isEmpty() || txtEndereco.getText().isBlank() ||
                    txtDataNascimento.getText().isEmpty() || txtDataNascimento.getText().isBlank()){
                    
                    AlertaUtil.mostrarErro("Campos não preenchidos",
                    "Você deve preencher todos os campos!");
                }
                else{
                    
                    Date dataFormatada =  Date.valueOf(txtDataNascimento.getText());
                    
                    Cliente cliente = new Cliente(txtNome.getText(),  txtTelefone.getText(), txtEndereco.getText(), dataFormatada);
                    clienteDAO.inserirCliente(cliente);
                    clienteDAO.listarClientes();
                }
                        

    }
    
    public void setStage(Stage stageCliente){
        this.stageCliente = stageCliente;
    }
    
    void ajustarElementosJanela() throws SQLException {
        carregarClientesTabela();
    }
    
    @FXML
    public void carregarClientesTabela(){
        tilePaneLista.getChildren().clear();
        
        //List<Cliente> clientes = clienteDAO.listarClientes();
        
    }

}
    

