/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimeioJavaFX extends Application{

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       //define url
       URL url = new File("src/pincipal/Sample.fxml").toURI().toURL();
       Parent root = FXMLLoader.load(url);
       //Criar cena
       Scene cena = new Scene (root);
       stage.setScene(cena);
       stage.show();
    }
    
}
