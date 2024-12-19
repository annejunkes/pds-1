package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class TelaInicialController {

    @FXML
    private Menu menuAjuda;

    @FXML
    private Menu menuBoletim;

    @FXML
    private Menu menuCadastro;

    @FXML
    private MenuItem menuFazerCadastro;

    @FXML
    private MenuItem menuMedia;

    @FXML
    private MenuItem menuSobre;
    
    @FXML
    void onClickBtnFazerCadastro(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CadastroView.fxml"));      
        Parent root = loader.load();
        
        Stage telaCadastro = new Stage();
        
        CadastroController cc = loader.getController();
        cc.setStage(telaCadastro);
        
         telaCadastro.setOnShown(evento -> {
            cc.ajustarElementosJanela();
        });
        
        telaCadastro.setScene(new Scene(root));
        telaCadastro.setTitle("Área de cadastro");
        telaCadastro.show();
    }

    @FXML
    void onClickBtnMedia(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MediaView.fxml"));
        Parent root = loader.load();
        
        Stage telaMedia = new Stage();
        
        MediaController mc = loader.getController();
        mc.setStage(telaMedia);
        
       telaMedia.setScene(new Scene(root));
       telaMedia.setTitle("Calcular média de notas");
       telaMedia.show();

    }
    
    @FXML
    void onClickBtnSobre(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Sobre");
        alerta.setHeaderText("Informações do sistema");
        alerta.setContentText("Portal para acessar informações do aluno");
        alerta.showAndWait();
    }
}
