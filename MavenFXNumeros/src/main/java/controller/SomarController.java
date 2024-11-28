package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SomarController {

    @FXML
    private Button btnFechar;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSomar;

    @FXML
    private Label lblNumero1;

    @FXML
    private Label lblNumero2;

    @FXML
    private Label lblResultado;

    @FXML
    private Label lblSoma;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;
    
    @FXML
    private Button btnTela2;

    @FXML
    void onClickBtnFechar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void onClickBtnLimpar(ActionEvent event) {
        txtNumero1.setText("");
        txtNumero2.setText("");
        lblSoma.setText("");
        txtNumero1.requestFocus();

    }

    @FXML
    void onClickBtnSomar(ActionEvent event) {
        
        try{
        Double numero1 = Double.valueOf(txtNumero1.getText());
         Double numero2 = Double.valueOf(txtNumero2.getText());
         
         Double soma = numero1 + numero2;
         lblSoma.setText(soma.toString());
        }catch(NumberFormatException n){
            System.out.println("Número inválido");
        }
    }
    
    @FXML
    void onClickBtnTela2(ActionEvent event) throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Teste2.fxml"));
        
        Parent root = loader.load();
        
        Stage stage = new Stage();
        
        Tela2Controller t2c = loader.getController();
        //t2c.setStage(stage);
        
        Scene cena = new Scene(root);
        stage.setTitle("Pesquisa de Programação");
        stage.setScene(cena);
        stage.show();

    }

}

