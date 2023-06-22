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

public class UniformNextController implements Initializable {
  @FXML
  Button SecondToLast, SecondToFirst, Home, dentMedM, dentMedF, medTechM, medTechF, nursingM, nursingF, pharmaM, pharmaF;

    @FXML
  UniformNextController uniformNextController = null;

  @FXML
  FXMLLoader loader;

    @FXML
  ImageView image9, image10, image11, image12, image13, image14, image15, image16;

  @FXML
  Label name9, name10, name11, name12, name13, name14, name15, name16, price9, price10, price11, price12, price13, price14, price15, price16;

   @FXML
   private Stage stage;

  @FXML
  private Parent root = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

            // -------------DENTAL MEDICINE UNIFORM----------------- //
        name9.setText(LoginController.unifMedicineM.getProductName());
        price9.setText(Double.toString(LoginController.unifMedicineM.getProductPrice()));
        Image Mdenmed = new Image(LoginController.unifMedicineM.getProductImage());
        image9.setImage(Mdenmed);

        name10.setText(LoginController.unifMedicineF.getProductName());
        price10.setText(Double.toString(LoginController.unifMedicineF.getProductPrice()));
        Image Fdenmed = new Image(LoginController.unifMedicineF.getProductImage());
        image10.setImage(Fdenmed);

             // -------------DENTAL MEDICINE UNIFORM----------------- //
        name11.setText(LoginController.unifMedTechM.getProductName());
        price11.setText(Double.toString(LoginController.unifMedTechM.getProductPrice()));
        Image Mmedtech = new Image(LoginController.unifMedTechM.getProductImage());
        image11.setImage(Mmedtech);

        name12.setText(LoginController.unifMedTechF.getProductName());
        price12.setText(Double.toString(LoginController.unifMedTechF.getProductPrice()));
        Image Fmedtech = new Image(LoginController.unifMedTechF.getProductImage());
        image12.setImage(Fmedtech);

             // -------------NURSING UNIFORM----------------- //
        name13.setText(LoginController.unifNursingM.getProductName());
        price13.setText(Double.toString(LoginController.unifNursingM.getProductPrice()));
        Image Mnursing = new Image(LoginController.unifNursingM.getProductImage());
        image13.setImage(Mnursing);

        name14.setText(LoginController.unifNursingF.getProductName());
        price14.setText(Double.toString(LoginController.unifNursingF.getProductPrice()));
        Image Fnursing = new Image(LoginController.unifNursingF.getProductImage());
        image14.setImage(Fnursing);

        // -------------PHARMACY UNIFORM----------------- //
        name15.setText(LoginController.unifPharmaM.getProductName());
        price15.setText(Double.toString(LoginController.unifPharmaM.getProductPrice()));
        Image Mpharma = new Image(LoginController.unifPharmaM.getProductImage());
        image15.setImage(Mpharma); 

        name16.setText(LoginController.unifPharmaF.getProductName());
        price16.setText(Double.toString(LoginController.unifPharmaF.getProductPrice()));
        Image Fpharma = new Image(LoginController.unifPharmaF.getProductImage());
        image16.setImage(Fpharma); 

    }




            public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(dentMedM)) {
            LoginController.unifMedicineM.setProductStatus(true);
            LoginController.unifMedicineM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane9);
            
        }

        else if (sourceButton == dentMedF) {
           LoginController.unifMedicineF.setProductStatus(true);
           LoginController.unifMedicineF.setProductQuantity(1);
           LoginController.cart.addItem(LoginController.myCartController.pane10);
            
        }

        else if (sourceButton == medTechM) {
            LoginController.unifMedTechM.setProductStatus(true);
            LoginController.unifMedTechM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane11);
            
        }

        else if (sourceButton == medTechF) {
            LoginController.unifMedTechF.setProductStatus(true);
            LoginController.unifMedTechF.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane12);

        }

        else if (sourceButton == nursingM) {
            LoginController.unifNursingM.setProductStatus(true);
            LoginController.unifNursingM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane13);

        }

        else if (sourceButton == nursingF) {
            LoginController.unifNursingF.setProductStatus(true);
            LoginController.unifNursingF.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane14);

        }
        else if (sourceButton == pharmaM) {
            LoginController.unifPharmaM.setProductStatus(true);
            LoginController.unifPharmaM.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane15);

        }
        else if (sourceButton == pharmaF) {
            LoginController.unifPharmaF.setProductStatus(true);
            LoginController.unifPharmaF.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myCartController.pane16);

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
    
            public void gotoLast(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/uniformLAST.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
        
            public void gotoFirst(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/uniform.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
           public void gotoCart(ActionEvent event) throws IOException {
            LoginController.myCartController.showItems(LoginController.cart.getItemList());
            LoginController.myCartController.getInitialAmount();
            
            loader = new FXMLLoader(getClass().getResource("/view/MyCart.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
}
