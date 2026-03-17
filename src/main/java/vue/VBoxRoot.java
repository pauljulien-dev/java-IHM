package vue;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import modele.Date;


public class VBoxRoot {
    VBox root = new VBox(10);
    Date date = Date.lireDate();
    Scene scene;


    public VBoxRoot(double dimensionX, double dimensionY) {
        scene=new Scene(root,dimensionX,dimensionY);
        setup();
    }
    public void setup(){
        Label dateDuJourLabel = new Label(date.toString());
        Label dateDemainLabel = new Label(date.dateDuLendemain().toString());
        root.getChildren().add(dateDuJourLabel);
        root.getChildren().add(dateDemainLabel);
    }

    public Scene getScene() {
        return scene;
    }
}
