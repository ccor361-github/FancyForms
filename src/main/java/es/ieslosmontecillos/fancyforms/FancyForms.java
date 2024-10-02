package es.ieslosmontecillos.fancyforms;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

///@author: Corina Cordobez

public class FancyForms extends Application {

    @Override
    public void start(Stage escenarioPrincipal) {
        //Crear etiquetas, campos de texto y botón
        Label lblTitulo = new Label("Bienvenido");
        lblTitulo.getStyleClass().add("label-title");

        Label lblUsuario = new Label("Nombre de usuario:");
        TextField txtUsuario = new TextField();

        Label lblContrasena = new Label("Contraseña:");
        PasswordField txtContrasena = new PasswordField();

        Button btnIniciarSesion = new Button("Iniciar sesión");
        Label lblEstado = new Label();
        lblEstado.getStyleClass().add("label-status");

        //Acción del botón
        btnIniciarSesion.setOnAction(event -> {
            lblEstado.setText("Botón de iniciar sesión presionado");
        });

        //Crear un GridPane para organizar los campos de texto
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(lblUsuario, 0, 0);
        gridPane.add(txtUsuario, 1, 0);
        gridPane.add(lblContrasena, 0, 1);
        gridPane.add(txtContrasena, 1, 1);
        gridPane.add(btnIniciarSesion, 1, 2);

        //Agrupar los elementos en un VBox (vertical box layout)
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(lblTitulo, gridPane, lblEstado);

        //Crear la escena y cargar la hoja de estilo CSS
        Scene escena = new Scene(vbox, 400, 300);
        escena.getStylesheets().add(getClass().getResource("/Style.css").toExternalForm());

        //Configurar el escenario (ventana principal)
        escenarioPrincipal.setTitle("JavaFX FancyForms");
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
