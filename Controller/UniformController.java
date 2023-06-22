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

public class UniformController implements Initializable {
  @FXML
  Button Next, Home, poloM1, poloF2, poloM3, poloF4, poloM5, poloF6, poloM7, poloF8;

  @FXML
  UniformLastController uniformLastController = null;

  @FXML
  ImageView image1, image2, image3, image4, image5, image6, image7, image8;

  @FXML 
  Label price1, name1, price2, name2, price3, name3, price4, name4, price5, name5, price6, name6, price7, name7, price8, name8;

  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

  @FXML
  private Parent root = null;

   @FXML
   static Parent homeRoot = null;

  @FXML
  static MyCartController myCartController = null;

      @Override
    public void initialize(URL location, ResourceBundle resources) {

            // -------------TRAD UNIFORM----------------- //
        name1.setText(LoginController.unifTradM.getProductName());
        price1.setText(Double.toString(LoginController.unifTradM.getProductPrice()));
        Image Mtrad = new Image(LoginController.unifTradM.getProductImage());
        image1.setImage(Mtrad);

        name2.setText(LoginController.unifTradF.getProductName());
        price2.setText(Double.toString(LoginController.unifTradF.getProductPrice()));
        Image Ftrad = new Image(LoginController.unifTradF.getProductImage());
        image2.setImage(Ftrad);

            // -------------TOURISM UNIFORM----------------- //
        name3.setText(LoginController.unifTourM.getProductName());
        price3.setText(Double.toString(LoginController.unifTourM.getProductPrice()));
        Image Mtour = new Image(LoginController.unifTourM.getProductImage());
        image3.setImage(Mtour);
        
        name4.setText(LoginController.unifTourF.getProductName());
        price4.setText(Double.toString(LoginController.unifTourF.getProductPrice()));
        Image Ftour = new Image(LoginController.unifTourF.getProductImage());
        image4.setImage(Ftour);

        // -------------DENTAL HYGIENE UNIFORM----------------- //
        name5.setText(LoginController.unifDentHygM.getProductName());
        price5.setText(Double.toString(LoginController.unifDentHygM.getProductPrice()));
        Image MHyg = new Image(LoginController.unifDentHygM.getProductImage());
        image5.setImage(MHyg);

        name6.setText(LoginController.unifDentHygF.getProductName());
        price6.setText(Double.toString(LoginController.unifDentHygF.getProductPrice()));
        Image FHyg = new Image(LoginController.unifDentHygF.getProductImage());
        image6.setImage(FHyg);

        // -------------DENTAL LAB TECH UNIFORM----------------- //
        name7.setText(LoginController.unifDentLabM.getProductName());
        price7.setText(Double.toString(LoginController.unifDentLabM.getProductPrice()));
        Image MDentL = new Image(LoginController.unifDentLabM.getProductImage());
        image7.setImage(MDentL);

        name8.setText(LoginController.unifDentLabF.getProductName());
        price8.setText(Double.toString(LoginController.unifDentLabF.getProductPrice()));
        Image FDentL = new Image(LoginController.unifDentLabF.getProductImage());
        image8.setImage(FDentL);

    }

    

         public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("Bulldogs Exchange", "Your selected item added to your cart");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(poloM1)) {
            LoginController.unifTradM.setProductStatus(true);
            LoginController.unifTradM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane1);
            
        }

        else if (sourceButton == poloF2) {
           LoginController.unifTradF.setProductStatus(true);
           LoginController.unifTradF.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane2);
            
        }

        else if (sourceButton == poloM3) {
            LoginController.unifTourM.setProductStatus(true);
            LoginController.unifTourM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane3);
        }

        else if (sourceButton == poloF4) {
            LoginController.unifTourF.setProductStatus(true);
            LoginController.unifTourF.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane4);

        }

        else if (sourceButton == poloM5) {
            LoginController.unifDentHygM.setProductStatus(true);
            LoginController.unifDentHygM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane5);

        }

        else if (sourceButton == poloF6) {
            LoginController.unifDentHygF.setProductStatus(true);
            LoginController.unifDentHygF.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane6);

        }
        else if (sourceButton == poloF8) {
            LoginController.unifDentLabF.setProductStatus(true);
            LoginController.unifDentLabF.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane8);

        }
        else if (sourceButton == poloM7) {
            LoginController.unifDentLabM.setProductStatus(true);
            LoginController.unifDentLabM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane7);

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
            public void NextOne(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/UniformNXT.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
    // public void gotoCart(ActionEvent event) throws IOException {

    //     // Load items to cart before switching to checkout page
    //     LoginController.myCartController.showItems(LoginController.cart.getItemList());

    //     // Set initial total amount in checkout page
    //     LoginController.myCartController.getInitialAmount();

    //     Scene scene = new Scene(LoginController.homeRoot);
    //     stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    //     stage.setScene(scene);
    //     stage.show();
    // }
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

