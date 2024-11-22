package org.example.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.example.App;
import org.example.Constants;
import org.example.Main;

import java.io.IOException;
import java.util.Objects;

public class MenuController implements Controller {

    private final App app;
    private final Stage primaryStage;

    public MenuController(App app, Stage primaryStage) {
        this.app = app;
        this.primaryStage = primaryStage;
    }

    @Override
    public String getTitle() {
        return Constants.MENU;
    }

    @Override
    public void init() {

    }

    @Override
    public Parent render() throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("view/menu.fxml")));
        Button aboutButton = (Button) parent.lookup("#button_about");
        Button createButton = (Button) parent.lookup("#button_create");

        createButton.setOnAction(action -> {
            app.show(new CreateController(app, primaryStage));
        });

        aboutButton.setOnAction(action -> {
        });
        return parent;
    }

    @Override
    public void destroy() {

    }
}
