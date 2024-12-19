package controller;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MediaController {

    private Stage stageMedia;
    
    @FXML
    private Button btnVerificar;

    @FXML
    private TextField txtMateria;

    @FXML
    private TextField txtNota1;

    @FXML
    private TextField txtNota2;

    @FXML
    private TextField txtNota3;

    @FXML
    void onClickBtnVerificar(ActionEvent event) {
        
        try{
        double n1 = Double.valueOf(txtNota1.getText());
        double n2 = Double.valueOf(txtNota2.getText());
        double n3 = Double.valueOf(txtNota3.getText());
        double media = (n1+n2+n3)/3;
        System.out.println("Media = " + media); 

       if(media>=6){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Aprovado em " + txtMateria.getText()+ "!");
        alerta.setHeaderText("A sua média é maior ou igual a 6");
        alerta.setContentText("Parabens!");
        alerta.showAndWait();
       }
       if(media<6){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Reprovado em "+ txtMateria.getText());
        alerta.setHeaderText("A sua nota não atingiu a média");
        alerta.setContentText("Estude para recuperacoes!");
        alerta.showAndWait();
       }
        
        }catch(NumberFormatException n){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Campos de notas precisam ser preenchidos");
        alerta.setHeaderText("");
        alerta.setContentText("");
        alerta.showAndWait();
}
    }

    
    void setStage(Stage telaMedia) {
        this.stageMedia = telaMedia;
    }
    
}
