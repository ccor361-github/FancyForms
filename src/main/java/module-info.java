module es.ieslosmontecillos.fancyforms {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.fancyforms to javafx.fxml;
    exports es.ieslosmontecillos.fancyforms;
}