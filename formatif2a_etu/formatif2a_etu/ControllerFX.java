package a23.climoilou.mono2.formatifs.controller;

import a23.climoilou.mono2.formatifs.model.Model;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerFX {
    private Model model = new  Model();

    @FXML
    private TextField textField;

    @FXML
    void pushButton(ActionEvent event) {
        textField.setText("le nombre est : " + model.getValue());
    }




}


