
package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
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
    private Runnable onClienteSalvo;
    
     public ClienteController() {
        clienteDAO = new ClienteDAO();
    }

    
    @FXML
    public void initialize() {

        Platform.runLater(() -> {
            //esse método permite que a tela inicialize sem depender de uma operação mais demorada
            try {
                carregarClientes();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

    }
    
    
    
   
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
                    clienteDAO = new ClienteDAO();
                    clienteDAO.inserirCliente(cliente);
                    clienteDAO.listarClientes();
                    
                    if(onClienteSalvo != null){
                    onClienteSalvo.run();
        }
                }
                        

    }
    
    @FXML
    public void carregarClientes() throws IOException, SQLException {
        tilePaneLista.getChildren().clear(); // Limpa a galeria antes de recarregar
        
            List<Cliente> clientes = clienteDAO.listarClientes();
            if (clientes.isEmpty()) {
                System.out.println("Nenhum artigo encontrado no banco de dados.");
                

            }
            for (Cliente cliente : clientes) {
                if(cliente!=null){
                adicionarClienteLista(cliente);
                }
                else{ // caso o link da foto estiver com problema uma outra foto substitui ela
                    System.out.println("Não carregou o artigo");
                }

            } 
        
    }
    
    public void setStage(Stage stageCliente){
        this.stageCliente = stageCliente;
    }
    
    void ajustarElementosJanela() throws SQLException {

    }
    
    public void setOnClienteSalvo(Runnable callback){
        this.onClienteSalvo = callback;
    }
    

     public void adicionarClienteLista(Cliente cliente){
       
       Label lblCliente = new Label();
       lblCliente.setPrefHeight(80);
       lblCliente.setPrefWidth(920);
       lblCliente.setStyle("-fx-font-size: 12px; -fx-underline: true;");
       lblCliente.setText("Cliente");
       
       tilePaneLista.getChildren().add(lblCliente);
       

       if(cliente!=null){
           lblCliente.setText("Nome: " + cliente.getNome() +
           "\nTelefone: " + cliente.getTelefone() +
           "\nEndereço: " + cliente.getEndereco() +
           "\nData de nascimento: " + cliente.getDataNascimento()+"\n");
           
           lblCliente.setOnMouseClicked(event -> {
                try {
                    System.out.println("Cliente id: " + cliente.getId());
                    //AbrirTelaLogin();
                //abrirTelaAtualizarArtigo(cliente); 
                } catch (Exception e) {
                System.err.println("Erro ao abrir tela de detalhes do artigo: " + e.getMessage());
                e.printStackTrace();
                }
            });
           
           lblCliente.setOnMouseEntered(event -> {
               lblCliente.setStyle("-fx-font-size: 12px; -fx-underline: true; -fx-text-fill: #840d0b" );
           });
           lblCliente.setOnMouseExited(event -> {
               lblCliente.setStyle("-fx-font-size: 12px; -fx-underline: true; -fx-text-fill: black" );
           });
       }
       
       
   }

}
    

