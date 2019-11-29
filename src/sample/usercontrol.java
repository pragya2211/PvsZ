package sample;

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

public class usercontrol implements Initializable{

    @FXML
    private Button btn2;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {

                    Parent root = FXMLLoader.load(getClass().getResource("level1.fxml"));

//                    Parent root1 = fXMLLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                    Stage pstage = (Stage) btn2.getScene().getWindow();
                    pstage.close();

                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
