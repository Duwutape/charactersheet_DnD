package org.example.controller;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.example.Main;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class PictureController implements Controller {

    private final CreateController createController;

    private VBox contentBox;
    private HBox imgBox;
    private Image selectedImg;

    public PictureController(CreateController createController) {
        this.createController = createController;
    }

    @Override
    public String getTitle() {
        return "Charsheet - Choose image";
    }

    @Override
    public void init() {

    }

    @Override
    public Parent render() throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("view/pictureSelect.fxml")));

        ScrollPane contentScroll = (ScrollPane) parent.lookup("#scrollpane_content");
        Button backButton = (Button) parent.lookup("#button_back");
        Button selectButton = (Button) parent.lookup("#button_select");

        contentBox = new VBox();

        renderCustomImg();
        renderPresetImg();

        contentScroll.setContent(contentBox);

        backButton.setOnAction(action -> createController.stopPicPopup());

        selectButton.setOnAction(action -> {
            createController.setImage(selectedImg);
            createController.stopPicPopup();
        });

        return parent;
    }

    @Override
    public void destroy() {

    }

    private void renderCustomImg() {
        File dir = new File("src/main/resources/char_images/custom_images");

        if (Objects.requireNonNull(dir.listFiles()).length != 0) {
            Label label = new Label("custom pictures");
            label.setStyle("-fx-font-size: 14");

            contentBox.getChildren().add(label);

            renderImg(dir);

            contentBox.getChildren().add(new Separator());
        }
    }

    private void renderPresetImg() {
        File dir = new File("src/main/resources/char_images/preset_images");

        if (Objects.requireNonNull(dir.listFiles()).length != 0) {
            Label label = new Label("preset pictures");
            label.setStyle("-fx-font-size: 14");
            contentBox.getChildren().add(label);

            renderImg(dir);
        }
    }

    private void renderImg(File dir) {
        int count = 0;

        for (File file : Objects.requireNonNull(dir.listFiles())) {
            if (count % 4 == 0) {
                imgBox = new HBox();
                imgBox.setSpacing(10);
                imgBox.setPadding(new Insets(5, 0, 5, 0));
                contentBox.getChildren().add(imgBox);
            }

            Image image = new Image(file.toURI().toString());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(90);
            imageView.setFitWidth(90);

            Button button = new Button();
            button.setGraphic(imageView);

            button.setOnAction(action -> {
                selectedImg = image;
            });

            imgBox.getChildren().add(button);
            count++;
        }
    }

    public Image getSelectedImg() {
        return selectedImg;
    }
}
