package sample;

import javafx.animation.Interpolator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.util.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class myappController implements Initializable {
   @FXML
    private ImageView zombie1;
    @FXML
    private ImageView zombie2;
    @FXML
    private ImageView peashooter;
    @FXML
    private Button peashooter1;
    @FXML
    private ImageView lawnmover;
    @FXML
    private ImageView pea;
    @FXML
    private ImageView sun;
    @FXML
    private Button menu;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        menu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {

                    Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

//                    Parent root1 = fXMLLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                    Stage pstage = (Stage) menu.getScene().getWindow();
                    pstage.close();

                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        TranslateTransition transition = new TranslateTransition();
        TranslateTransition transition3 = new TranslateTransition();
        TranslateTransition transition4 = new TranslateTransition();

        TranslateTransition transition2 = new TranslateTransition();

        peashooter1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               // System.out.println("hii");
                peashooter.setVisible(true);
                pea.setVisible(true);
                zombie1.setVisible(true);
                zombie2.setVisible(true);


                transition.setDuration(Duration.seconds(14));
            //    transition.setDelay(Duration.seconds(6));
                transition.setNode(zombie1);
                //      transition.setNode(lawnmover);
              //  transition.setFromX(540);
                transition.setToX(-340);
                //System.out.println(label1234.getLayout X());
                //transition.setToX(-300);
                //   transition.setAutoReverse(true);
                transition.setCycleCount(1);
                //transition.setInterpolator(Interpolator.LINEAR);
                transition.play();

                transition3.setDuration(Duration.seconds(14));
                transition3.setDelay(Duration.seconds(6));
                transition3.setNode(zombie2);
                //      transition.setNode(lawnmover);
                //  transition3.setFromX(540);
                transition3.setToX(-450);
                //System.out.println(label1234.getLayout X());
                //transition.setToX(-300);
                //   transition.setAutoReverse(true);
                transition3.setCycleCount(1);
                //transition.setInterpolator(Interpolator.LINEAR);
                transition3.play();


                transition2.setDuration(Duration.seconds(3));
                //    transition.setDelay(Duration.seconds(6));
                transition2.setNode(pea);
                //      transition.setNode(lawnmover);
                //  transition.setFromX(540);
                transition2.setToX(540);
                //System.out.println(label1234.getLayout X());
                //transition.setToX(-300);
                //   transition.setAutoReverse(true);
                transition2.setCycleCount(4);
                //transition2.setInterpolator(Interpolator.LINEAR);
                transition2.play();

                //zombie1.setVisible(true);
            }
        });

        //btn1.setMaxSize(100, 200);
       //
        //transition4.setDelay(Duration.seconds(3));
        sun.setVisible(true);
        transition4.setDelay(Duration.seconds(4));
        transition4.setNode(sun);
        transition4.setDuration(Duration.seconds(15));
        transition4.setToY(400);
        transition4.setCycleCount(1);
        transition4.play();
        transition4.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println(zombie1.getX());

                sun.setVisible(false);
            }
        });

       TranslateTransition transition1 = new TranslateTransition();
        transition1.setDuration(Duration.seconds(6));
      //  transition1.setNode(zombie1);
        transition1.setNode(lawnmover);
     //   transition1.setDelay(Duration.seconds(30));
        transition1.setToX(540);
        //System.out.println(label1234.getLayout X());
        //transition.setToX(-300);
        //transition1.setAutoReverse(true);
        transition1.setCycleCount(1);

        transition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println(zombie1.getX());

                zombie1.setVisible(false);
            }
        });
        transition3.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println(zombie1.getX());
                zombie2.setVisible(false);
                transition1.play();

            }
        });

        transition1.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               // System.out.println(.getX());
                lawnmover.setVisible(false);
            }
        });
        //System.out.println(zombie1.getX());


    }

}
