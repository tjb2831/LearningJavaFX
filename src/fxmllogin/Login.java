package fxmllogin;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {

	@Override
	public void start(Stage stage) throws Exception 
	{
		URL fxml = getClass().getResource("fxml/login.fxml");
		Parent root = FXMLLoader.load(fxml);
		Scene scene = new Scene(root, 300, 275);
		
		stage.setTitle("FXML Welcome");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
