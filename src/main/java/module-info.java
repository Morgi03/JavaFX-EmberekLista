module hu.petrik.embereklista {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.embereklista to javafx.fxml;
    exports hu.petrik.embereklista;
}