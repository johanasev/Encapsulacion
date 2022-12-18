module poo.encapsulacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens poo.encapsulacion to javafx.fxml;
    exports poo.encapsulacion;
}