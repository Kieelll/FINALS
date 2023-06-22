package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class UniformLastController implements Initializable{
@FXML
Button lastToSecond, Home, PoloPsycM, PoloPsycF;

@FXML
UniformLastController uniformLastController = null;

@FXML
FXMLLoader loader;

@FXML
Label price17, price18, name17, name18;

@FXML
ImageView image17, image18;

@FXML
private Stage stage;

@FXML
private Parent root = null;

@FXML
static MyCartController myCartController = null;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
                  // -------------PSCYCHOLOGY UNIFORM----------------- //
        name17.setText(LoginController.unifPsychM.getProductName());
        price17.setText(Double.toString(LoginController.unifPsychM.getProductPrice()));
        Image MPscych = new Image(LoginController.unifPsychM.getProductImage());
        image17.setImage(MPscych);

        name18.setText(LoginController.unifPsychF.getProductName());
        price18.setText(Double.toString(LoginController.unifPsychF.getProductPrice()));
        Image FPscych = new Image(LoginController.unifPsychF.getProductImage());
        image18.setImage(FPscych);



    }


            public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("Bulldogs Exchange", "item added to your cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(PoloPsycM)) {
            LoginController.unifPsychM.setProductStatus(true);
            LoginController.unifPsychM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane17);
            
            
        }

        else if (sourceButton == PoloPsycF) {
           LoginController.unifPsychF.setProductStatus(true);
           LoginController.unifPsychF.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane18);
            
        }

            }



  
          public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
            public void gotoSecond(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/uniformNXT.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
            public void gotoCart(ActionEvent event) throws IOException {
        // Load items to cart before switching to checkout page
        LoginController.myCartController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.myCartController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
