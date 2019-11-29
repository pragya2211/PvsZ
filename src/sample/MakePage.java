package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author zoranpavlovic.blogspot.com
 */
public class MakePage extends Application {
    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Image to Button");

        // BorderPane
        BorderPane bp = new BorderPane();

        // HBox
        HBox hb = new HBox();
        hb.setPadding(new Insets(15, 15, 15, 12));
        hb.setSpacing(10);

        // HBox
        VBox vb = new VBox();
        vb.setPadding(new Insets(15, 12, 15, 12));
        vb.setSpacing(10);

        // Adding images
        Image img1 = new Image(getClass().getResourceAsStream("PlayButton.jpeg"));
        Image img2 = new Image(getClass().getResourceAsStream("back.jpeg"));

        // Adding buttons and images to buttons with no text on buttons
        Button button1 = new Button("", new ImageView(img1));
        hb.getChildren().add(button1);
        Button button2 = new Button("", new ImageView(img2));
        hb.getChildren().add(button2);
        // Adding buttons and images with text on buttons
        Button button3 = new Button("Info Button", new ImageView(img1));
        vb.getChildren().add(button3);

        bp.setTop(hb);
        bp.setCenter(vb);

        // Adding GridPane to the scene
        Scene scene = new Scene(bp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
