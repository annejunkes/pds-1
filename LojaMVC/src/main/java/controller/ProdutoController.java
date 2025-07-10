
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import model.Cliente;
import model.Produto;
import model.ProdutoDAO;
import util.AlertaUtil;

public class ProdutoController {
    
    ProdutoDAO produtoDAO;   
    private Stage stageProduto;
    private Runnable onProdutoSalvo;
    
     public ProdutoController() {
        produtoDAO = new ProdutoDAO();
    }
     
     @FXML
    public void initialize() {

        Platform.runLater(() -> {
            //esse método permite que a tela inicialize sem depender de uma operação mais demorada
            try {
                carregarProdutos();
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
    private TextField txtDescricao;

    @FXML
    private TextField txtValor;

    @FXML
    private TextField txtQtdEstoque;

    @FXML
    void btnSalvarClick(ActionEvent event) throws SQLException {
        
        if(txtDescricao.getText().isEmpty()  || txtDescricao.getText().isBlank() || 
                    txtValor.getText().isEmpty() || txtValor.getText().isBlank() ||
                    txtQtdEstoque.getText().isEmpty() || txtQtdEstoque.getText().isBlank()){
                    
                    AlertaUtil.mostrarErro("Campos não preenchidos",
                    "Você deve preencher todos os campos!");
                }
                else{
                    
                    float valor = Float.valueOf(txtValor.getText());
                    int qtdEstoque = Integer.valueOf(txtQtdEstoque.getText());
                    
                    Produto produto = new Produto(txtDescricao.getText(), valor, qtdEstoque);
                    produtoDAO = new ProdutoDAO();
                    produtoDAO.salvar(produto);
                    produtoDAO.selecionarProdutos();
                    

                }

    }
    
    public void setStage(Stage stageProduto){
        this.stageProduto = stageProduto;
    }
    
    
    @FXML
    public void carregarProdutos() throws IOException, SQLException {
        tilePaneLista.getChildren().clear(); // Limpa a galeria antes de recarregar
        
            List<Produto> produtos = produtoDAO.selecionarProdutos();
            if (produtos.isEmpty()) {
                System.out.println("Nenhum produto encontrado no banco de dados.");
                

            }
            for (Produto produto : produtos) {
                if(produto!=null){
                adicionarProdutoLista(produto);
                }
                else{ // caso o link da foto estiver com problema uma outra foto substitui ela
                    System.out.println("Não carregou o produto");
                }

            } 
        
    }
    
    
    
    public void adicionarProdutoLista(Produto produto){
       
       Label lblProduto = new Label();
       lblProduto.setPrefHeight(80);
       lblProduto.setPrefWidth(920);
       lblProduto.setStyle("-fx-font-size: 12px; -fx-underline: true;");
       lblProduto.setText("Cliente");
       
       tilePaneLista.getChildren().add(lblProduto);
       

       if(produto!=null){
           lblProduto.setText("ID: " + produto.getId() +
           "\nDescrição: " + produto.getDescricao() +
           "\nValor: " + produto.getValor() +
           "\nQuantidade em estoque: " + produto.getQtdEstoque()+"\n");
           
          lblProduto.setOnMouseClicked(event -> {
                try {
                    System.out.println("Produto id: " + produto.getId());
                    //AbrirTelaLogin();
                //abrirTelaAtualizarArtigo(cliente); 
                } catch (Exception e) {
                System.err.println("Erro ao abrir tela de detalhes do produto: " + e.getMessage());
                e.printStackTrace();
                }
            });
           
           lblProduto.setOnMouseEntered(event -> {
               lblProduto.setStyle("-fx-font-size: 12px; -fx-underline: true; -fx-text-fill: #840d0b" );
           });
           lblProduto.setOnMouseExited(event -> {
               lblProduto.setStyle("-fx-font-size: 12px; -fx-underline: true; -fx-text-fill: black" );
           });
       }
       
       
   }

}
