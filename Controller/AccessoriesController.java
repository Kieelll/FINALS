package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import alert.AlertMaker;




public class AccessoriesController implements Initializable{
  @FXML
   Label name26, name27, name28, name29, name30, name31, price26, price27, price28, price29, price30, price31;
   
   @FXML
    ImageView image26, image27, image28, image29, image30, image31;

  @FXML
  Button Home, Cart, bagTag, windB, capG, laceB, laceG, laceBG;
  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

   @FXML
  static MyCartController myCartController = null;

   @FXML
   static Parent homeRoot = null;


  @FXML
  private Parent root = null;

  @Override
    public void initialize(URL location, ResourceBundle resources) {

        name26.setText(LoginController.bagTag.getProductName());
        price26.setText(Double.toString(LoginController.bagTag.getProductPrice()));
        Image bagTag = new Image(LoginController.bagTag.getProductImage());
        image26.setImage(bagTag);   

        name27.setText(LoginController.windbreaker.getProductName());
        price27.setText(Double.toString(LoginController.windbreaker.getProductPrice()));
        Image windbreaker = new Image(LoginController.windbreaker.getProductImage());
        image27.setImage(windbreaker);

        name28.setText(LoginController.capGold.getProductName());
        price28.setText(Double.toString(LoginController.capGold.getProductPrice()));
        Image capGold = new Image(LoginController.capGold.getProductImage());
        image28.setImage(capGold);

        name29.setText(LoginController.bluelace.getProductName());
        price29.setText(Double.toString(LoginController.bluelace.getProductPrice()));
        Image bluelace = new Image(LoginController.bluelace.getProductImage());
        image29.setImage(bluelace);

        name30.setText(LoginController.goldLace.getProductName());
        price30.setText(Double.toString(LoginController.goldLace.getProductPrice()));
        Image goldLace = new Image(LoginController.goldLace.getProductImage());
        image30.setImage(goldLace);

        name31.setText(LoginController.bgLace.getProductName());
        price31.setText(Double.toString(LoginController.bgLace.getProductPrice()));
        Image bgLace = new Image(LoginController.bgLace.getProductImage());
        image31.setImage(bgLace);
    }


  public void buy(ActionEvent event) throws IOException {   
      
        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(bagTag)) {
            LoginController.bagTag.setProductStatus(true);
            LoginController.bagTag.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane26);
            
        }

        else if (sourceButton == windB) {
           LoginController.windbreaker.setProductStatus(true);
           LoginController.windbreaker.setProductQuantity(1);
         LoginController.cart.addItem(LoginController.myCartController.pane27);
        }

        else if (sourceButton == capG) {
           LoginController.capGold.setProductStatus(true);
           LoginController.capGold.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane28);
            
        }

        else if (sourceButton == laceB) {
           LoginController.bluelace.setProductStatus(true);
           LoginController.bluelace.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane29);
            
        }

        else if (sourceButton == laceG) {
           LoginController.goldLace.setProductStatus(true);
           LoginController.goldLace.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane30);
            
        }

        else if (sourceButton == laceBG) {
           LoginController.bgLace.setProductStatus(true);
           LoginController.bgLace.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane31);
            
        }

        LoginController.cart.showItems();
  }

  
    AccessoriesController accessoriesController = null;

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

