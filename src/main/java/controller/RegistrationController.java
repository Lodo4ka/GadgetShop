package controller;

import entity.User;
import exception.ProductShopException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import service.RegistrationService;

import java.io.IOException;

/**
 * Created by lodo4ka on 19/06/2017.
 */
public class RegistrationController {


    private RegistrationService registrationService = new RegistrationService();


    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPass;




    @FXML
    public void register(ActionEvent actionEvent) throws IOException {

        try{

            String textField = txtUserName.getText();
            String passField = txtPass.getText();

            if (textField.equalsIgnoreCase("admin") && passField.equalsIgnoreCase("admin")){

                Parent homePageParent = FXMLLoader.load(getClass().getResource("/view/adminpanel.fxml"));
                Scene homePageScene = new Scene(homePageParent);
                Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                appStage.hide();
                appStage.setScene(homePageScene);
                appStage.show();
            }
            else {
                User user = new User(textField, passField);

                registrationService.register(user);

                Parent homePageParent = FXMLLoader.load(getClass().getResource("/view/checkingLogin.fxml"));
                Scene homePageScene = new Scene(homePageParent);
                Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                appStage.hide();
                appStage.setScene(homePageScene);
                appStage.show();
            }
        }
        catch (ProductShopException e){

        }
    }
}

