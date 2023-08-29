package a23.climoilou.mono2.formatifs.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationFX extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        assert stage != null : "null stage";

        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("../view/viewFX.fxml"));
        fxmlLoader.setController(this);
        Scene scene = new Scene(fxmlLoader.load(), 600, 240);
        stage.setTitle("A21 - Mono2 - Formatif1");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
