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

public class BooksController implements Initializable{
   @FXML
   Label name32, name33, name34, name35, name36, name37, name38, name39, price32, price33, price34, price35, price36, price37, price38, price39 ;

   @FXML
    ImageView image32, image33, image34, image35, image36, image37, image38, image39;

  @FXML
  Button Home, Cart, anatomy, rleOne, rleTwo, rleThree, rleFour, biochem, taxonomy, pharmaBook;

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

        
        name32.setText(LoginController.anatomy.getProductName());
        price32.setText(Double.toString(LoginController.anatomy.getProductPrice()));
        Image anatomy = new Image(LoginController.anatomy.getProductImage());
        image32.setImage(anatomy);


        name33.setText(LoginController.rleOne.getProductName());
        price33.setText(Double.toString(LoginController.rleOne.getProductPrice()));

        Image rleOne = new Image(LoginController.rleOne.getProductImage());
        image33.setImage(rleOne);


        name34.setText(LoginController.rleTwo.getProductName());
        price34.setText(Double.toString(LoginController.rleTwo.getProductPrice()));
        Image rleTwo = new Image(LoginController.rleTwo.getProductImage());
        image34.setImage(rleTwo);


        name35.setText(LoginController.rleThree.getProductName());
        price35.setText(Double.toString(LoginController.rleThree.getProductPrice()));
        Image rleThree = new Image(LoginController.rleThree.getProductImage());
        image35.setImage(rleThree);


        name36.setText(LoginController.rleFour.getProductName());
        price36.setText(Double.toString(LoginController.rleFour.getProductPrice()));
        Image rleFour = new Image(LoginController.rleFour.getProductImage());
        image36.setImage(rleFour);


        name37.setText(LoginController.biochem.getProductName());
        price37.setText(Double.toString(LoginController.biochem.getProductPrice()));
        Image biochem = new Image(LoginController.biochem.getProductImage());
        image37.setImage(biochem);


        name38.setText(LoginController.taxonomy.getProductName());
        price38.setText(Double.toString(LoginController.taxonomy.getProductPrice()));
        Image taxonomy = new Image(LoginController.taxonomy.getProductImage());
        image38.setImage(taxonomy);


        name39.setText(LoginController.pharmaBook.getProductName());
        price39.setText(Double.toString(LoginController.pharmaBook.getProductPrice()));
        Image pharmaBook = new Image(LoginController.pharmaBook.getProductImage());
       image39.setImage(pharmaBook);

    }

  public void buy(ActionEvent event) throws IOException {
    AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(anatomy)) {
            LoginController.anatomy.setProductStatus(true);
            LoginController.anatomy.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane32);
            
            
        }

        else if (sourceButton == rleOne) {
           LoginController.rleOne.setProductStatus(true);
           LoginController.rleOne.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane33);
            
        }

        else if (sourceButton == rleTwo) {
           LoginController.rleTwo.setProductStatus(true);
           LoginController.rleTwo.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane34);
            
        }

        else if (sourceButton == rleThree) {
           LoginController.rleThree.setProductStatus(true);
           LoginController.rleThree.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane35);
            
        }

        else if (sourceButton == rleFour) {
           LoginController.rleFour.setProductStatus(true);
           LoginController.rleFour.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane36);
            
        }

        else if (sourceButton == biochem) {
           LoginController.biochem.setProductStatus(true);
           LoginController.biochem.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane37);
            
        }

        else if (sourceButton == taxonomy) {
           LoginController.taxonomy.setProductStatus(true);
           LoginController.taxonomy.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane38);
            
        }

        else if (sourceButton == pharmaBook) {
           LoginController.pharmaBook.setProductStatus(true);
           LoginController.pharmaBook.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane39);
            
        }

        LoginController.cart.showItems();

        
  }

    BooksController booksController = null;


    
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

