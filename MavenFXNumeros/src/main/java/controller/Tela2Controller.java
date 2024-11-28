package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Tela2Controller {

    @FXML
    private ButtonBar btnBarSO;

    @FXML
    private Button btnLinux;

    @FXML
    private Button btnMac;

    @FXML
    private Button btnSubmeter;

    @FXML
    private Button btnWindows;

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
    private TextField txtNome;

    @FXML
    void onCilickBtnSubmeter(ActionEvent event) {
        System.out.println("Resultado da pesquisa para " + txtNome.getText());
    }

}
