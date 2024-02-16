package com.cha.userlogin;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class SignupController {
    @FXML private javafx.scene.control.Button submitButton;

    @FXML
    private void onSubmitButtonClick(){
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
    }

}