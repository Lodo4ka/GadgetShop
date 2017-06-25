package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lodo4ka on 25/06/2017.
 */
public class StartwindowController {



    public void signIn(ActionEvent actionEvent) {
        try {
            Parent homePageParent = FXMLLoader.load(getClass().getResource("/view/checkingLogin.fxml"));
            Scene homePageScene = new Scene(homePageParent);
            Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            appStage.hide();
            appStage.setScene(homePageScene);
            appStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void signUp(ActionEvent actionEvent) {
        try {
            Parent homePageParent = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
            Scene homePageScene = new Scene(homePageParent);
            Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            appStage.hide();
            appStage.setScene(homePageScene);
            appStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
