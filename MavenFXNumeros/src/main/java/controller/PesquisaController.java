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
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PesquisaController {

    private Stage stagePesquisa;  
    RadioButton botaoLinguagensSelecionado;  
    ToggleGroup  tgLinguagens = new ToggleGroup();
    ToggleButton tgSOSelecionado;
    ToggleGroup tgSO = new ToggleGroup();
    
    @FXML
    private ButtonBar btnBarSO;

    @FXML
    private Button btnSubmeter;

    @FXML
    private Button btnFechar;
        
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

    String sistemaFav;
    String linguagemFav;
    
    @FXML
    void onCilickBtnSubmeter(ActionEvent event) {
        
        if(!txtNome.getText().isEmpty()){
        System.out.println("\n\nResultado da pesquisa para " + txtNome.getText());

    }
        botaoLinguagensSelecionado = (RadioButton)tgLinguagens.getSelectedToggle();
        System.out.print("Linguagem Favorita: ");
        if( botaoLinguagensSelecionado != null){
            System.out.println( botaoLinguagensSelecionado.getText());
        }else{
            System.out.println("Nao selecionado");
        }
        
        tgSOSelecionado = (ToggleButton)tgSO.getSelectedToggle();
        System.out.print("SO Favorito: ");
        if( tgSOSelecionado != null){
            System.out.println( tgSOSelecionado.getText());
        }else{
            System.out.println("Nao selecionado");
        }
        
        
        System.out.print("\nPrograma todo dia? ");
       // if(chckBoxPrograma.isSelected())
        System.out.print(chckBoxPrograma.isSelected() == true ? "Sim\n" : "Não\n");
        
        System.out.print("\nGosta de programar? ");
       // if(chckBoxPrograma.isSelected())
        System.out.print(chckBoxGosta.isSelected() == true ? "Sim\n" : "Não\n");
    }

    @FXML
    void onClickBtnFechar(ActionEvent event) {
        if(stagePesquisa != null){
            stagePesquisa.close();
        }
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
    
      @FXML
    void onClickRdBtnC(ActionEvent event) {
        linguagemFav = "C";
    }

    @FXML
    void onClickRdBtnJava(ActionEvent event) {
         linguagemFav = "Java";
    }

    @FXML
    void onClickRdBtnPython(ActionEvent event) {
        linguagemFav = "Python";
    }

    void setStage(Stage novaTela) {
       this.stagePesquisa = novaTela;
    }
    
    void ajustarElementosJanela(){
        tgLinguagens.getToggles().addAll(rdbtnC, rdbtnJava, rdbtnPython);
        //outra forma de setar
 
        tgSO.getToggles().addAll(tbWindows, tbMac, tbLinux);
    }
}
