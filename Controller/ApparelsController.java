package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ApparelsController implements Initializable{
   @FXML
   Label name19, name20, name21, name22, name23, name24, name25, price19, price20, price21, price22, price23, price24, price25 ;
   
   @FXML
    ImageView image19, image20, image21, image22, image23, image24, image25;

  @FXML
  Button Home, Cart, hoodie, nusgPM, nusgPF, nuTee, nuTeeB, nuTeeDB, nuTeeBl;

  @FXML
  FXMLLoader loader;

    @FXML
   static Parent homeRoot = null;

   @FXML
   private Stage stage;

   @FXML
  static MyCartController myCartController = null;

  @FXML
  private Parent root = null;

  @Override
    public void initialize(URL location, ResourceBundle resources) {

        name19.setText(LoginController.hoodie.getProductName());
        price19.setText(Double.toString(LoginController.hoodie.getProductPrice()));
        Image hoodie = new Image(LoginController.hoodie.getProductImage());
        image19.setImage(hoodie);   

        name20.setText(LoginController.nusgPoloMale.getProductName());
        price20.setText(Double.toString(LoginController.nusgPoloMale.getProductPrice()));
        Image nusgPoloMale = new Image(LoginController.nusgPoloMale.getProductImage());
        image20.setImage(nusgPoloMale);

        name21.setText(LoginController.nusgPoloFemale.getProductName());
        price21.setText(Double.toString(LoginController.nusgPoloFemale.getProductPrice()));
        Image nusgPoloFemale = new Image(LoginController.nusgPoloFemale.getProductImage());
        image21.setImage(nusgPoloFemale);

        name22.setText(LoginController.bulldogsTeeN.getProductName());
        price22.setText(Double.toString(LoginController.bulldogsTeeN.getProductPrice()));
        Image bulldogsTeeN = new Image(LoginController.bulldogsTeeN.getProductImage());
        image22.setImage(bulldogsTeeN);

        name23.setText(LoginController.bulldogsTeeBlue.getProductName());
        price23.setText(Double.toString(LoginController.bulldogsTeeBlue.getProductPrice()));
        Image bulldogsTeeBlue = new Image(LoginController.bulldogsTeeBlue.getProductImage());
        image23.setImage(bulldogsTeeBlue);

        name24.setText(LoginController.bulldogsTeeDB.getProductName());
        price24.setText(Double.toString(LoginController.bulldogsTeeDB.getProductPrice()));
        Image bulldogsTeeDB = new Image(LoginController.bulldogsTeeDB.getProductImage());
        image24.setImage(bulldogsTeeDB);

        
        name25.setText(LoginController.bulldogsTeeBlack.getProductName());
        price25.setText(Double.toString(LoginController.bulldogsTeeBlack.getProductPrice()));
        Image bulldogsTeeBlack = new Image(LoginController.bulldogsTeeBlack.getProductImage());
        image25.setImage(bulldogsTeeBlack);
    }

    
  public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(hoodie)) {
            LoginController.hoodie.setProductStatus(true);
            LoginController.hoodie.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane19);
            
        }

        else if (sourceButton == nusgPM) {
           LoginController.nusgPoloMale.setProductStatus(true);
           LoginController.nusgPoloMale.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane20);
            
        }

        else if (sourceButton == nusgPF) {
           LoginController.nusgPoloFemale.setProductStatus(true);
           LoginController.nusgPoloFemale.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane21);
            
        }

        else if (sourceButton == nuTee) {
           LoginController.bulldogsTeeN.setProductStatus(true);
           LoginController.bulldogsTeeN.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane22);
            
        }

        else if (sourceButton == nuTeeB) {
           LoginController.bulldogsTeeBlue.setProductStatus(true);
           LoginController.bulldogsTeeBlue.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane23);
            
        }

        else if (sourceButton == nuTeeDB) {
           LoginController.bulldogsTeeDB.setProductStatus(true);
           LoginController.bulldogsTeeDB.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane24);
            
        }

        else if (sourceButton == nuTeeBl) {
           LoginController.bulldogsTeeBlack.setProductStatus(true);
           LoginController.bulldogsTeeBlack.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane25);
            
        }

        LoginController.cart.showItems();
  }

  
    ApparelsController aparelsController = null;
            public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }

        public void gotoCart(ActionEvent event) throws IOException {
        if (homeRoot == null) {
            homeRoot = FXMLLoader.load(getClass().getResource("/view/home.fxml"));
        }
        if (myCartController == null) {
            FXMLLoader cartLoader = new FXMLLoader(getClass().getResource("/view/MyCart.fxml"));
            homeRoot = cartLoader.load();
            myCartController = cartLoader.getController();
        }
        
        myCartController.showItems(LoginController.cart.getItemList());
        myCartController.getInitialAmount();

        Scene scene = new Scene(homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}


