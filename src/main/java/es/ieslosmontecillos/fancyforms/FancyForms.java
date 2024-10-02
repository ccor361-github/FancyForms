import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear etiquetas y campos de texto
        Label lblUsername = new Label("Username:");
        TextField txtUsername = new TextField();

        Label lblPassword = new Label("Password:");
        PasswordField txtPassword = new PasswordField();

        Button btnLogin = new Button("Login");

        // Crear un GridPane para organizar los elementos
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);  // Espacio horizontal
        gridPane.setVgap(10);  // Espacio vertical

        gridPane.add(lblUsername, 0, 0);
        gridPane.add(txtUsername, 1, 0);
        gridPane.add(lblPassword, 0, 1);
        gridPane.add(txtPassword, 1, 1);
        gridPane.add(btnLogin, 1, 2);

        // Crear una escena y cargar el CSS desde la carpeta resources
        Scene scene = new Scene(gridPane, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/login.css").toExternalForm());  // ** Cambiar ruta a /login.css

        // Configurar el escenario
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
