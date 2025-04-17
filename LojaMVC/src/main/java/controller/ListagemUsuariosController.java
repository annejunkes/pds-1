package controller;

import java.io.File;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.Usuario;

public class ListagemUsuariosController {

    Stage stageListagemUsuarios;
    
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnFechar;

    @FXML
    private TableView<Usuario> tabelaUsuarios;

    @FXML
    private TextField txtBusca;

    @FXML
    void btnFecharClick(ActionEvent event) {
        stageListagemUsuarios.close();
    }

    @FXML
    void menuCadastroUsuarioClick(ActionEvent event) {
   
    }
    
    void setStage(Stage telaListagemUsuarios){
        this.stageListagemUsuarios = telaListagemUsuarios;
    }

}