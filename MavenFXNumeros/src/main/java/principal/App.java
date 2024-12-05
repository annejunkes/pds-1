package principal;

import javafx.application.Application;

import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * JavaFX App
 */
public class App extends Application {



    @Override
    public void start(Stage stage) throws IOException {
    
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Tela2View.fxml"));
        
        Parent root = loader.load();
        
        Scene cena = new Scene(root);
        stage.setTitle("Pesquisa de Programação");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}