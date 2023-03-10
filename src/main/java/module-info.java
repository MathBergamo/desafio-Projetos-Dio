module com.example.labpadroesprojetojava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens one.digitalinnovation.gof to javafx.fxml;
    exports one.digitalinnovation.gof;
    exports one.digitalinnovation.gof.controller;
    opens one.digitalinnovation.gof.controller to javafx.fxml;
    exports one.digitalinnovation.gof.Singleton;
    opens one.digitalinnovation.gof.Singleton to javafx.fxml;
}