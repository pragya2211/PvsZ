package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.util.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class tryController implements Initializable {
    @FXML
    private Button btn1;
    @FXML
    private Label label1234;
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //btn1.setMaxSize(100, 200);
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(3));
        transition.setNode(label1234);
        transition.setToX(-100);
        //System.out.println(label1234.getLayout X());
        transition.setToX(-300);
        transition.setAutoReverse(true);
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.play();

    }

}
