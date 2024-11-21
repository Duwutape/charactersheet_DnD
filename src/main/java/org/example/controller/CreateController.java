package org.example.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.example.App;
import org.example.Constants;
import org.example.Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class CreateController implements Controller{

    private final App app;
    private final Stage primaryStage;

    private final PictureController pictureController = new PictureController(this);
    private Button imgButton;
    private Image image;
    private Stage popup;

    public CreateController(App app, Stage primaryStage) {
        this.app = app;
        this.primaryStage = primaryStage;
    }

    @Override
    public String getTitle() {
        return Constants.CREATE_CHAR;
    }

    @Override
    public void init() {

    }

    @Override
    public Parent render() throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("view/createChar.fxml")));

        Hyperlink folderLink = (Hyperlink) parent.lookup("#link_folder");
        imgButton = (Button) parent.lookup("#button_img");

        folderLink.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("src/main/resources/char_images/custom_images"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        updateImg();

        imgButton.setOnAction(event -> {
            createPicPopup();
        });

        return parent;
    }

    @Override
    public void destroy() {

    }

    private void createPicPopup() {
        popup = new Stage();
        popup.setResizable(false);

        Scene popupScene = null;
        try {
            popupScene = new Scene(pictureController.render());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        popup.setScene(popupScene);
        popup.setTitle(pictureController.getTitle());
        popup.initOwner(primaryStage);
        popup.show();
    }

    public void stopPicPopup() {
        popup.close();
    }

    public void receiveImg() {
        image = pictureController.getSelectedImg();
        updateImg();
    }

    public void updateImg() {
        if (image != null) {
            imgButton.setText("");

            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);
            imgButton.setGraphic(imageView);
        }
    }

}
