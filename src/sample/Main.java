package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("style1.fxml"));
        primaryStage.setTitle("Plants vs Zombies");

        primaryStage.setScene(new Scene(root));
        //, 300, 275));
        primaryStage.show();

       /* primaryStage.setOnCloseRequest( event ->
        {
            System.out.println("CLOSING");
            contr.close();
        });*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
