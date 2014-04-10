package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Login form example from Oracle's tutorial, 
 * 		JavaFX: Getting Started with JavaFX
 * 
 * @author Oracle Corporation
 * @author TJ Bresnahan
 *
 * @see <a href="http://docs.oracle.com/javase/8/javafx/get-started-tutorial/form.htm">
 * 			http://docs.oracle.com/javase/8/javafx/get-started-tutorial/form.htm
 * 		</a>
 */
public class Login extends Application
{
	@Override
	public void start(Stage stage)
	{
		stage.setTitle("JavaFX Welcome");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10d);
		grid.setVgap(10d);
		grid.setPadding(new Insets(25, 25, 25, 25));
		//grid.setGridLinesVisible(true);
		
		Text sceneTitle = new Text("Welcome");
		sceneTitle.setId("welcome-text");
		grid.add(sceneTitle, 0, 0, 2, 1);
		
		TextField userName = new TextField();
		grid.add(new Label("User Name:"), 0, 1);
		grid.add(userName, 1, 1);
		
		PasswordField password = new PasswordField();
		grid.add(new Label("Password:"), 0, 2);
		grid.add(password, 1, 2);
		
		Button btn = new Button("Sign in");
		HBox wrap = new HBox(10);
		wrap.setAlignment(Pos.BOTTOM_RIGHT);
		wrap.getChildren().add(btn);
		grid.add(wrap, 1, 3);
	
		final Text actionTarget = new Text();
		grid.add(actionTarget, 1, 4);
		actionTarget.setId("action-target");
		
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent evt)
			{
				actionTarget.setText("Submit button clicked!");
			}
		});
		
		Scene scene = new Scene(grid, 300, 275);
		scene.getStylesheets().add(
				getClass().getResource("resource/Login.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
