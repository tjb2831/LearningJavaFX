package fxmllogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class LoginController
{
	@FXML private Text actionTarget;
	
	@FXML protected void handleOnSubmit(ActionEvent evt)
	{
		actionTarget.setText("Sign in button pressed!");
	}
}
