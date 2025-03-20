
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    
    private Stage stageLogin;
    
    @FXML
    private Button btnFechar;

    @FXML
    private Button btnLogar;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;
    
    @FXML
    void btnFecharClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnLogarClick(ActionEvent event) {

    }
    
    public void abrirJanela(){
        System.out.println("abrir janela");
    }
    
    public void setStage(Stage stage){
        this.stageLogin = stage;
    }
}
