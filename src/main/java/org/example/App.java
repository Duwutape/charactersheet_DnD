package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.controller.Controller;
import org.example.controller.MenuController;

import java.io.IOException;

import static org.example.Constants.*;

public class App extends Application {
    private Stage stage;
    private Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        primaryStage.setScene(new Scene(new Label("Loading...")));
        primaryStage.setTitle("Charsheet");

        show(new MenuController(this, primaryStage));
        primaryStage.show();

        primaryStage.setOnCloseRequest(e -> controller.destroy());
    }

    public void show(Controller controller) {
        controller.init();
        try{
            stage.setResizable(false);
            stage.getScene().setRoot(controller.render());

        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }

        if (stage.getTitle().equals(MENU)) {
            stage.setWidth(405);
            stage.setHeight(400);
        }
        if (stage.getTitle().equals(CREATE_CHAR)) {
            stage.setWidth(324);
            stage.setHeight(424);
        }

        if (this.controller != null) {
            this.controller.destroy();
        }
        this.controller = controller;
        stage.setTitle(controller.getTitle());
    }
}
