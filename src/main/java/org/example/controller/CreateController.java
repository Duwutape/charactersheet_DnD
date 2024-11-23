package org.example.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.App;
import org.example.Constants;
import org.example.Main;
import org.example.model.Char;
import org.example.service.CreateService;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class CreateController implements Controller{

    private final App app;
    private final Stage primaryStage;

    private final PictureController pictureController = new PictureController(this);
    private final CreateService createService = new CreateService();
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
        Button backButton = (Button) parent.lookup("#button_prev");
        Button nextButton = (Button) parent.lookup("#button_next");
        TextField nameField = (TextField) parent.lookup("#field_name");
        MenuButton classSelect = (MenuButton) parent.lookup("#select_class");
        MenuButton speciesSelect = (MenuButton) parent.lookup("#select_species");
        MenuButton levelSelect = (MenuButton) parent.lookup("#select_level");
        MenuButton versionSelect = (MenuButton) parent.lookup("#select_verion");

        folderLink.setOnAction(action -> {
            try {
                Desktop.getDesktop().open(new File("src/main/resources/char_images/custom_images"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        updateImg();

        imgButton.setOnAction(action -> {
            createPicPopup();
        });

        backButton.setOnAction(action -> {
            app.show(new MenuController(app, primaryStage));
        });

        nextButton.setOnAction(action -> {

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

    public void setImage(Image image) {
        this.image = image;
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
