package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Tela2Controller {

    String sistemaFav;
    
    @FXML
    private Menu menuArquivo;

    @FXML
    private Menu menuCalculadora;

    @FXML
    private MenuItem menuPesquisa;

    @FXML
    private MenuItem menuSair;

    @FXML
    private MenuItem menuSobre;

    @FXML
    private MenuItem menuSomar;
    

    @FXML
    void onClickBtnPesquisa(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PesquisaView.fxml"));    
        Parent root = loader.load();
        
        Stage novaTela = new Stage();
        
        PesquisaController pc = loader.getController();
        pc.setStage(novaTela);
        
        novaTela.setOnShown(evento -> {
            pc.ajustarElementosJanela();
        });

        novaTela.setTitle("Pesquisa de Programção");
        novaTela.setScene(new Scene(root));
        novaTela.show();

    }

    @FXML
    void onClickBtnSobre(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Sobre");
        alerta.setHeaderText("Informações do sistema");
        alerta.setContentText("Sisema desenvolvido na aula de pds");
        alerta.showAndWait();
    }

    @FXML
    void onClickBtnSomar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SomarView.fxml"));    
        Parent root = loader.load();
        
        Stage novaTela = new Stage();
        
        SomarController sc = loader.getController();
        sc.setStage(novaTela);
        
        novaTela.setTitle("Soma de números");
        novaTela.setScene(new Scene(root));
        novaTela.show();

    }

    @FXML
    void onCllickBtnSair(ActionEvent event) {
        if(fecharSistema()){
            System.exit(0);
            
        }
        else{
            event.consume();
        }

    }
    
    public boolean fecharSistema(){
       Alert confirmar = new Alert(Alert.AlertType.CONFIRMATION);
       confirmar.setTitle("Confirmação");
       confirmar.setHeaderText("Deseja fechar a aplicação?");
        confirmar.setContentText("Toas as mudanças não salvas serão perdidas");

       return confirmar.showAndWait().filter(response -> response == ButtonType.OK).isPresent(); 
    }
}
