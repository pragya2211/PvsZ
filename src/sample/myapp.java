package sample;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
public class myapp extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        Parent root = FXMLLoader.load(getClass().getResource("myapp.fxml"));
        //Initialising path of the media file, replace this with your file path
        String path = "/Users/pragyagandhi/Desktop/myvid.mp4";

        //Instantiating Media class
        Media media = new Media(new File(path).toURI().toString());

        //Instantiating MediaPlayer class
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        //Instantiating MediaView class
        MediaView mediaView = new MediaView(mediaPlayer);

        //by setting this property to true, the Video will be played
        mediaPlayer.setAutoPlay(true);

        //setting group and scene
        Group root1 = new Group();
        root1.getChildren().add(mediaView);
        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Playing video");
        //Scene scene = new Scene(root,500,400);
        //primaryStage.setScene(scene);
        //stage.show();
        primaryStage.show();
    }
    /*public static void main(String[] args) {
        launch(args);
    }*/

}
