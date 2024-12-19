package controller;

import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class CadastroController {

    private Stage stageCadastro;
    
   
    int matricula[] = new int[]{1,2,3,4,5};
    
    RadioButton cursoSelecionado;
    ToggleGroup tgCursos = new ToggleGroup();
    ToggleButton semestreSelecionado;
    ToggleGroup tgSemestres = new ToggleGroup();
    
    @FXML
    private Button btnSair;

    @FXML
    private Button btnSubmeter;
    
     @FXML
    private ButtonBar btnBarSemestre;

    @FXML
    private CheckBox checkBoxBolsista;

    @FXML
    private CheckBox checkBoxMonitoria;

    @FXML
    private CheckBox checkBoxVoluntariado;

    @FXML
    private RadioButton rdBtnADS;

    @FXML
    private ButtonBar rdBtnBarCurso;

    @FXML
    private RadioButton rdBtnInformatica;

    @FXML
    private RadioButton rdBtnModelagem;

    @FXML
    private RadioButton rdBtnQuimica;

    @FXML
    private ToggleButton semestre1;

    @FXML
    private ToggleButton semestre2;

    @FXML
    private ToggleButton semestre3;

    @FXML
    private TextField txtMatricula;
    
///////////////////////////////////////////////////////////////////////////////////////
    
    @FXML
    void onClickBtnSubmeter(ActionEvent event) {
        
        int matriculaInt = Integer.valueOf(txtMatricula.getText());
        int matriculaExiste = 0;
        
        for(int i=0; i<matricula.length;i++){
            if(matriculaInt == matricula[i]){
                matriculaExiste = matricula[i];            
            }
        }
        if(matriculaExiste==0){
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Matricula inválida");
                alerta.setHeaderText("Essa matricula nao existe no sistema");
                alerta.setContentText("Digite novamente");
                alerta.showAndWait();
            }
        if(matriculaExiste!=0){
                System.out.println("\nRelatorio para matricula: " + txtMatricula.getText());
                
        
        cursoSelecionado = (RadioButton)tgCursos.getSelectedToggle();
        System.out.println("Curso: ");
        if(cursoSelecionado!=null){
           System.out.println( cursoSelecionado.getText());  
        }
        else{
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Curso em branco");
            alerta.setHeaderText("O curso precisa ser selecionado");
            alerta.setContentText("Caso seu curso não esteja nas opções, vá em ajuda");
            alerta.showAndWait();
        }
        semestreSelecionado = (ToggleButton)tgSemestres.getSelectedToggle();
        System.out.println("Curso: ");
        if(semestreSelecionado!=null){
           System.out.println( semestreSelecionado.getText());  
        }
        
        
        System.out.println("Atividades exercidas: ");
        if(checkBoxBolsista.isSelected()){
            System.out.println("-Bolsista de projeto");
        }
        if(checkBoxMonitoria.isSelected()){
            System.out.println("-Monitor(a)");
        }
        if(checkBoxVoluntariado.isSelected()){
            System.out.println("-Voluntario(a) de projeto");
        }
        
        }
    }
        
    

    @FXML
    void onClickRdBtnADS(ActionEvent event) {

    }

    @FXML
    void onClickRdBtnInformatica(ActionEvent event) {

    }

    @FXML
    void onClickRdBtnModelagem(ActionEvent event) {

    }

    @FXML
    void onClickRdBtnQuimica(ActionEvent event) {

    }

    @FXML
    void onClickTb1(ActionEvent event) {

    }

    @FXML
    void onClickTb2(ActionEvent event) {

    }

    @FXML
    void onClickTb3(ActionEvent event) {

    }
    
    @FXML
    void onClickBtnSair(ActionEvent event) {
        if(stageCadastro!=null){
            stageCadastro.close();
        }
    }
    
    void setStage(Stage telaCadastro) {
       this.stageCadastro = telaCadastro;
    }

     void ajustarElementosJanela(){
        tgCursos.getToggles().addAll(rdBtnInformatica, rdBtnQuimica, rdBtnModelagem, rdBtnADS);
        tgSemestres.getToggles().addAll(semestre1, semestre2, semestre3);
    }

    
}
