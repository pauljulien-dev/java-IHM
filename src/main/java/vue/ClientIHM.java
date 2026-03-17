package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientIHM extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new VBoxRoot(300,80).getScene();
        stage.setScene(scene);
        stage.setTitle("Deuxième Projet IHM");
        stage.show();
    }

    public static void main(String[] args){
        Application.launch();
    }

}
