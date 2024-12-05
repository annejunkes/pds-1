package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class PesquisaController {

    String sistemaFav;
    @FXML
    private ButtonBar btnBarSO;

    @FXML
    private Button btnSubmeter;

    @FXML
    private CheckBox chckBoxGosta;

    @FXML
    private CheckBox chckBoxPrograma;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblPesquisa;

    @FXML
    private Label lblSO;

    @FXML
    private Label lblSO1;

    @FXML
    private ButtonBar rdBtnBarLinguagens;

    @FXML
    private RadioButton rdbtnC;

    @FXML
    private RadioButton rdbtnJava;

    @FXML
    private RadioButton rdbtnPython;

    @FXML
    private ToggleButton tbLinux;

    @FXML
    private ToggleButton tbMac;

    @FXML
    private ToggleButton tbWindows;

    @FXML
    private TextField txtNome;

    @FXML
    void onCilickBtnSubmeter(ActionEvent event) {
        System.out.println("\nResultado da pesquisa para " + txtNome.getText());
        System.out.println("Sistema Favorito: " + sistemaFav);
    }

    @FXML
    void onClickTbLinux(ActionEvent event) {
        sistemaFav = "Linux";
    }
    
    @FXML
    void onClickTbWindows(ActionEvent event) {
        sistemaFav = "Windows";
    }
    
    @FXML
    void onClickTbMac(ActionEvent event) {
        sistemaFav = "Mac";
    }
}
