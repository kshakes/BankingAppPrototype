module com.kshakes.kshakesbank {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.kshakes.kshakesbank to javafx.fxml;
    exports com.kshakes.kshakesbank;
}