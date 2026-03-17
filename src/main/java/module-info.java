module fr.paul.deuxiemeprojet {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens fr.paul.deuxiemeprojet to javafx.fxml;
    exports vue;
}