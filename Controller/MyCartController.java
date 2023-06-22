package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyCartController implements Initializable{
    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12, pane13, pane14, pane15, pane16, pane17, pane18, pane19, pane20, pane21, pane22, pane23, pane24, pane25, pane26, pane27, pane28, pane29, pane30, pane31, pane32, pane33, pane34, pane35, pane36, pane37, pane38, pane39, pane40 ;
    
    @FXML
    VBox myvbox;

    @FXML
    VBox scrollpaneVBox;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15, name16, name17, name18, name19, name20, name21, name22, name23, name24, name25, name26, name27, name28, name29, name30, name31, name32, name33, name34, name35, name36, name37, name38, name39, name40 ;

    @FXML
    Label price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, price14, price15, price16, price17, price18, price19, price20, price21, price22, price23, price24, price25, price26, price27, price28, price29, price30, price31, price32, price33, price34, price35, price36, price37, price38, price39, price40, total;

    @FXML
    ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13, image14, image15, image16, image17, image18, image19, image20, image21, image22, image23, image24, image25, image26, image27, image28, image29, image30, image31, image32, image33, image34, image35, image36, image37, image38, image39, image40;

    @FXML
    private ChoiceBox<String> quantity1,quantity2,quantity3,quantity4,quantity5,quantity6,quantity7,quantity8,quantity9,quantity10,quantity11,quantity12,quantity13,quantity14,quantity15,quantity16,quantity17,quantity18,
                        quantity19,quantity20,quantity21,quantity22,quantity23,quantity24,quantity25,quantity26,quantity27,quantity28,quantity29,quantity30,quantity31,quantity32,quantity33,quantity34,quantity35,
                                quantity36,quantity37,quantity38,quantity39;
    
    private String[] quantity = { "1", "2", "3", "4", "5" };


        
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //UNIFORM
        name1.setText(LoginController.unifTradM.getProductName());
        price1.setText(Double.toString(LoginController.unifTradM.getProductPrice()));
        Image unifTradM = new Image(LoginController.unifTradM.getProductImage());
        image1.setImage(unifTradM);   

        name2.setText(LoginController.unifTradF.getProductName());
        price2.setText(Double.toString(LoginController.unifTradF.getProductPrice()));
        Image unifTradF = new Image(LoginController.unifTradF.getProductImage());
        image2.setImage(unifTradF);

        name3.setText(LoginController.unifTourM.getProductName());
        price3.setText(Double.toString(LoginController.unifTourM.getProductPrice()));
        Image unifTourM = new Image(LoginController.unifTourM.getProductImage());
        image3.setImage(unifTourM);

        name4.setText(LoginController.unifTourF.getProductName());
        price4.setText(Double.toString(LoginController.unifTourF.getProductPrice()));
        Image unifTourF = new Image(LoginController.unifTourF.getProductImage());
        image4.setImage(unifTourF);

        name5.setText(LoginController.unifDentHygM.getProductName());
        price5.setText(Double.toString(LoginController.unifDentHygM.getProductPrice()));
        Image unifDentHygM = new Image(LoginController.unifDentHygM.getProductImage());
        image5.setImage(unifDentHygM);

        name6.setText(LoginController.unifDentHygF.getProductName());
        price6.setText(Double.toString(LoginController.unifDentHygF.getProductPrice()));
        Image unifDentHygF = new Image(LoginController.unifDentHygF.getProductImage());
        image6.setImage(unifDentHygF);
        
        name7.setText(LoginController.unifDentLabM.getProductName());
        price7.setText(Double.toString(LoginController.unifDentLabM.getProductPrice()));
        Image unifDentLabM = new Image(LoginController.unifDentLabM.getProductImage());
        image7.setImage(unifDentLabM);

        name8.setText(LoginController.unifDentLabF.getProductName());
        price8.setText(Double.toString(LoginController.unifDentLabF.getProductPrice()));
        Image unifDentLabF = new Image(LoginController.unifDentLabF.getProductImage());
        image8.setImage(unifDentLabF);

        
        name9.setText(LoginController.unifMedicineM.getProductName());
        price9.setText(Double.toString(LoginController.unifMedicineM.getProductPrice()));
        Image unifMedicineM = new Image(LoginController.unifMedicineM.getProductImage());
        image9.setImage(unifMedicineM);  
        
        name10.setText(LoginController.unifMedicineF.getProductName());
        price10.setText(Double.toString(LoginController.unifMedicineF.getProductPrice()));
        Image unifMedicineF = new Image(LoginController.unifMedicineF.getProductImage());
        image10.setImage(unifMedicineF); 

        name11.setText(LoginController.unifMedTechM.getProductName());
        price11.setText(Double.toString(LoginController.unifMedTechM.getProductPrice()));
        Image unifMedTechM = new Image(LoginController.unifMedTechM.getProductImage());
        image11.setImage(unifMedTechM);

        name12.setText(LoginController.unifMedTechF.getProductName());
        price12.setText(Double.toString(LoginController.unifMedTechF.getProductPrice()));
        Image unifMedTechF = new Image(LoginController.unifMedTechF.getProductImage());
        image12.setImage(unifMedTechF);

        name13.setText(LoginController.unifNursingM.getProductName());
        price13.setText(Double.toString(LoginController.unifNursingM.getProductPrice()));
        Image unifNursingM = new Image(LoginController.unifNursingM.getProductImage());
        image13.setImage(unifNursingM);

        name14.setText(LoginController.unifNursingF.getProductName());
        price14.setText(Double.toString(LoginController.unifNursingF.getProductPrice()));
        Image unifNursingF = new Image(LoginController.unifNursingF.getProductImage());
        image14.setImage(unifNursingF);

        name15.setText(LoginController.unifPharmaM.getProductName());
        price15.setText(Double.toString(LoginController.unifPharmaM.getProductPrice()));
        Image unifPharmaM = new Image(LoginController.unifPharmaM.getProductImage());
        image15.setImage(unifPharmaM);

        name16.setText(LoginController.unifPharmaF.getProductName());
        price16.setText(Double.toString(LoginController.unifPharmaF.getProductPrice()));
        Image unifPharmaF = new Image(LoginController.unifPharmaF.getProductImage());
        image16.setImage(unifPharmaF);

        name17.setText(LoginController.unifPsychM.getProductName());
        price17.setText(Double.toString(LoginController.unifPsychM.getProductPrice()));
        Image unifPsychM = new Image(LoginController.unifPsychM.getProductImage());
        image17.setImage(unifPsychM);

        name18.setText(LoginController.unifPsychF.getProductName());
        price18.setText(Double.toString(LoginController.unifPsychF.getProductPrice()));
        Image unifPsychF = new Image(LoginController.unifPsychF.getProductImage());
        image18.setImage(unifPsychF);

        //APPARELS

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

        //ACCESSORIES

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

        //BOOKS
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



        // Set default quantities in choicebox to 1
       quantity1.setValue("1");
    quantity2.setValue("1");
    quantity3.setValue("1");
    quantity4.setValue("1");
    quantity5.setValue("1");
    quantity6.setValue("1");
    quantity7.setValue("1");
    quantity8.setValue("1");
    quantity9.setValue("1");
    quantity10.setValue("1");
    quantity11.setValue("1");
    quantity12.setValue("1");
    quantity13.setValue("1");
    quantity14.setValue("1");
    quantity15.setValue("1");
    quantity16.setValue("1");
    quantity17.setValue("1");
    quantity18.setValue("1");
    quantity19.setValue("1");
    quantity20.setValue("1");
    quantity21.setValue("1");
    quantity22.setValue("1");
    quantity23.setValue("1");
    quantity24.setValue("1");
    quantity25.setValue("1");
    quantity26.setValue("1");
    quantity27.setValue("1");
    quantity28.setValue("1");
    quantity29.setValue("1");
    quantity30.setValue("1");
    quantity31.setValue("1");
    quantity32.setValue("1");
    quantity33.setValue("1");
    quantity34.setValue("1");
    quantity35.setValue("1");
    quantity36.setValue("1");
    quantity37.setValue("1");
    quantity38.setValue("1");
    quantity39.setValue("1");



        // Insert quantity array to choicebox
        quantity1.getItems().addAll(quantity);
        quantity2.getItems().addAll(quantity);
        quantity3.getItems().addAll(quantity);
        quantity4.getItems().addAll(quantity);
        quantity5.getItems().addAll(quantity);
        quantity6.getItems().addAll(quantity);
        quantity7.getItems().addAll(quantity);
        quantity8.getItems().addAll(quantity);
        quantity9.getItems().addAll(quantity);
        quantity10.getItems().addAll(quantity);
        quantity11.getItems().addAll(quantity);
        quantity12.getItems().addAll(quantity);
        quantity13.getItems().addAll(quantity);
        quantity14.getItems().addAll(quantity);
        quantity15.getItems().addAll(quantity);
        quantity16.getItems().addAll(quantity);
        quantity17.getItems().addAll(quantity);
        quantity18.getItems().addAll(quantity);
        quantity19.getItems().addAll(quantity);
        quantity20.getItems().addAll(quantity);
        quantity21.getItems().addAll(quantity);
        quantity22.getItems().addAll(quantity);
        quantity23.getItems().addAll(quantity);
        quantity24.getItems().addAll(quantity);
        quantity25.getItems().addAll(quantity);
        quantity26.getItems().addAll(quantity);
        quantity27.getItems().addAll(quantity);
        quantity28.getItems().addAll(quantity);
        quantity29.getItems().addAll(quantity);
        quantity30.getItems().addAll(quantity);
        quantity31.getItems().addAll(quantity);
        quantity32.getItems().addAll(quantity);
        quantity33.getItems().addAll(quantity);
        quantity34.getItems().addAll(quantity);
        quantity35.getItems().addAll(quantity);
        quantity36.getItems().addAll(quantity);
        quantity37.getItems().addAll(quantity);
        quantity38.getItems().addAll(quantity);
        quantity39.getItems().addAll(quantity);


        // Add event handler on all choiceboxes
        quantity1.setOnAction(this::computeTotal);
        quantity2.setOnAction(this::computeTotal);
        quantity3.setOnAction(this::computeTotal);
        quantity4.setOnAction(this::computeTotal);
        quantity5.setOnAction(this::computeTotal);
        quantity6.setOnAction(this::computeTotal);
        quantity7.setOnAction(this::computeTotal);
        quantity8.setOnAction(this::computeTotal);
        quantity9.setOnAction(this::computeTotal);
        quantity10.setOnAction(this::computeTotal);
        quantity11.setOnAction(this::computeTotal);
        quantity12.setOnAction(this::computeTotal);
        quantity13.setOnAction(this::computeTotal);
        quantity14.setOnAction(this::computeTotal);
        quantity15.setOnAction(this::computeTotal);
        quantity16.setOnAction(this::computeTotal);
        quantity17.setOnAction(this::computeTotal);
        quantity18.setOnAction(this::computeTotal);
        quantity19.setOnAction(this::computeTotal);
        quantity20.setOnAction(this::computeTotal);
        quantity21.setOnAction(this::computeTotal);
        quantity22.setOnAction(this::computeTotal);
        quantity23.setOnAction(this::computeTotal);
        quantity24.setOnAction(this::computeTotal);
        quantity25.setOnAction(this::computeTotal);
        quantity26.setOnAction(this::computeTotal);
        quantity27.setOnAction(this::computeTotal);
        quantity28.setOnAction(this::computeTotal);
        quantity29.setOnAction(this::computeTotal);
        quantity30.setOnAction(this::computeTotal);
        quantity31.setOnAction(this::computeTotal);
        quantity32.setOnAction(this::computeTotal);
        quantity33.setOnAction(this::computeTotal);
        quantity34.setOnAction(this::computeTotal);
        quantity35.setOnAction(this::computeTotal);
        quantity36.setOnAction(this::computeTotal);
        quantity37.setOnAction(this::computeTotal);
        quantity38.setOnAction(this::computeTotal);
        quantity39.setOnAction(this::computeTotal);



    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;
        double item9Amount = 0;
        double item10Amount = 0;
        double item11Amount = 0;
        double item12Amount = 0;
        double item13Amount = 0;
        double item14Amount = 0;
        double item15Amount = 0;
        double item16Amount = 0;
        double item17Amount = 0;
        double item18Amount = 0;
        double item19Amount = 0;
        double item20Amount = 0;
        double item21Amount = 0;
        double item22Amount = 0;
        double item23Amount = 0;
        double item24Amount = 0;
        double item25Amount = 0;
        double item26Amount = 0;
        double item27Amount = 0;
        double item28Amount = 0;
        double item29Amount = 0;
        double item30Amount = 0;
        double item31Amount = 0;
        double item32Amount = 0;
        double item33Amount = 0;
        double item34Amount = 0;
        double item35Amount = 0;
        double item36Amount = 0;
        double item37Amount = 0;
        double item38Amount = 0;
        double item39Amount = 0;
        
        ChoiceBox source = (ChoiceBox) event.getSource();
        // If product is chosen, compute item amount
        //UNIFORM
        if (LoginController.unifTradM.getProductStatus()) {

            double qty = Double.parseDouble(quantity1.getValue());
            LoginController.unifTradM.setProductQuantity(qty);
            item1Amount = LoginController.unifTradM.getProductPrice() * qty;

            if (source == quantity1) {
                item1Amount = LoginController.unifTradM.getProductPrice() * qty;
            }
        }

        if (LoginController.unifTradF.getProductStatus()) {

            double qty = Double.parseDouble(quantity2.getValue());
            LoginController.unifTradF.setProductQuantity(qty);
            item2Amount = LoginController.unifTradF.getProductPrice() * qty;

            if (source == quantity2) {
                item2Amount = LoginController.unifTradF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifTourM.getProductStatus()) {

            double qty = Double.parseDouble(quantity3.getValue());
            LoginController.unifTourM.setProductQuantity(qty);
            item3Amount = LoginController.unifTourM.getProductPrice() * qty;

            if (source == quantity3) {
                item3Amount = LoginController.unifTourM.getProductPrice() * qty;
            }
        }

        if (LoginController.unifTourF.getProductStatus()) {

            double qty = Double.parseDouble(quantity4.getValue());
            LoginController.unifTourF.setProductQuantity(qty);
            item4Amount = LoginController.unifTourF.getProductPrice() * qty;

            if (source == quantity4) {
                item4Amount = LoginController.unifTourF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifDentHygM.getProductStatus()) {

            double qty = Double.parseDouble(quantity5.getValue());
            LoginController.unifDentHygM.setProductQuantity(qty);
            item5Amount = LoginController.unifDentHygM.getProductPrice() * qty;

            if (source == quantity5) {
                item5Amount = LoginController.unifDentHygM.getProductPrice() * qty;
            }
        }

        if (LoginController.unifDentHygF.getProductStatus()) {

            double qty = Double.parseDouble(quantity6.getValue());
            LoginController.unifDentHygF.setProductQuantity(qty);
            item6Amount = LoginController.unifDentHygF.getProductPrice() * qty;

            if (source == quantity6) {
                item5Amount = LoginController.unifDentHygF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifDentLabM.getProductStatus()) {

            double qty = Double.parseDouble(quantity7.getValue());
            LoginController.unifDentLabM.setProductQuantity(qty);
            item7Amount = LoginController.unifDentLabM.getProductPrice() * qty;

            if (source == quantity7) {
                item7Amount = LoginController.unifDentLabM.getProductPrice() * qty;
            }
        }

        if (LoginController.unifDentLabF.getProductStatus()) {

            double qty = Double.parseDouble(quantity8.getValue());
            LoginController.unifDentLabF.setProductQuantity(qty);
            item8Amount = LoginController.unifDentLabF.getProductPrice() * qty;

            if (source == quantity8) {
                item8Amount = LoginController.unifDentLabF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifMedicineM.getProductStatus()) {

            double qty = Double.parseDouble(quantity9.getValue());
            LoginController.unifMedicineM.setProductQuantity(qty);
            item9Amount = LoginController.unifMedicineM.getProductPrice() * qty;

            if (source == quantity9) {
                item9Amount = LoginController.unifMedicineM.getProductPrice() * qty;
            }
        }

        if (LoginController.unifMedicineF.getProductStatus()) {

            double qty = Double.parseDouble(quantity10.getValue());
            LoginController.unifMedicineF.setProductQuantity(qty);
            item10Amount = LoginController.unifMedicineF.getProductPrice() * qty;

            if (source == quantity10) {
                item10Amount = LoginController.unifMedicineF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifMedTechM.getProductStatus()) {

            double qty = Double.parseDouble(quantity11.getValue());
            LoginController.unifMedTechM.setProductQuantity(qty);
            item11Amount = LoginController.unifMedTechM.getProductPrice() * qty;

            if (source == quantity11) {
                item11Amount = LoginController.unifMedTechM.getProductPrice() * qty;
            }
        }

        if (LoginController.unifMedTechF.getProductStatus()) {

            double qty = Double.parseDouble(quantity12.getValue());
            LoginController.unifMedTechF.setProductQuantity(qty);
            item12Amount = LoginController.unifMedTechF.getProductPrice() * qty;

            if (source == quantity12) {
                item12Amount = LoginController.unifMedTechF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifNursingM.getProductStatus()) {

            double qty = Double.parseDouble(quantity13.getValue());
            LoginController.unifNursingM.setProductQuantity(qty);
            item13Amount = LoginController.unifNursingM.getProductPrice() * qty;

            if (source == quantity13) {
                item13Amount = LoginController.unifNursingM.getProductPrice() * qty;
            }
        }

        if (LoginController.unifNursingF.getProductStatus()) {

            double qty = Double.parseDouble(quantity14.getValue());
            LoginController.unifNursingF.setProductQuantity(qty);
            item14Amount = LoginController.unifNursingF.getProductPrice() * qty;

            if (source == quantity14) {
                item14Amount = LoginController.unifNursingF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifPharmaM.getProductStatus()) {

            double qty = Double.parseDouble(quantity15.getValue());
            LoginController.unifPharmaM.setProductQuantity(qty);
            item15Amount = LoginController.unifPharmaM.getProductPrice() * qty;

            if (source == quantity15) {
                item15Amount = LoginController.unifPharmaM.getProductPrice() * qty;
            }
        }

         if (LoginController.unifPharmaF.getProductStatus()) {

            double qty = Double.parseDouble(quantity16.getValue());
            LoginController.unifPharmaF.setProductQuantity(qty);
            item16Amount = LoginController.unifPharmaF.getProductPrice() * qty;

            if (source == quantity16) {
                item16Amount = LoginController.unifPharmaF.getProductPrice() * qty;
            }
        }

        if (LoginController.unifPsychM.getProductStatus()) {

            double qty = Double.parseDouble(quantity17.getValue());
            LoginController.unifPsychM.setProductQuantity(qty);
            item17Amount = LoginController.unifPsychM.getProductPrice() * qty;

            if (source == quantity17) {
                item17Amount = LoginController.unifPsychM.getProductPrice() * qty;
            }
        }

         if (LoginController.unifPsychF.getProductStatus()) {

            double qty = Double.parseDouble(quantity18.getValue());
            LoginController.unifPsychF.setProductQuantity(qty);
            item18Amount = LoginController.unifPsychF.getProductPrice() * qty;

            if (source == quantity18) {
                item18Amount = LoginController.unifPsychF.getProductPrice() * qty;
            }
        }

         if (LoginController.hoodie.getProductStatus()) {

            double qty = Double.parseDouble(quantity19.getValue());
            LoginController.hoodie.setProductQuantity(qty);
            item19Amount = LoginController.hoodie.getProductPrice() * qty;

            if (source == quantity19) {
                item19Amount = LoginController.hoodie.getProductPrice() * qty;
            }
        }

        if (LoginController.nusgPoloMale.getProductStatus()) {

            double qty = Double.parseDouble(quantity20.getValue());
            LoginController.nusgPoloMale.setProductQuantity(qty);
            item20Amount = LoginController.nusgPoloMale.getProductPrice() * qty;

            if (source == quantity20) {
                item20Amount = LoginController.nusgPoloMale.getProductPrice() * qty;
            }
        }

        if (LoginController.nusgPoloFemale.getProductStatus()) {

            double qty = Double.parseDouble(quantity21.getValue());
            LoginController.nusgPoloFemale.setProductQuantity(qty);
            item21Amount = LoginController.nusgPoloFemale.getProductPrice() * qty;

            if (source == quantity21) {
                item21Amount = LoginController.nusgPoloFemale.getProductPrice() * qty;
            }

        }

        if (LoginController.bulldogsTeeN.getProductStatus()) {

            double qty = Double.parseDouble(quantity22.getValue());
            LoginController.bulldogsTeeN.setProductQuantity(qty);
            item22Amount = LoginController.bulldogsTeeN.getProductPrice() * qty;

            if (source == quantity22) {
                item22Amount = LoginController.bulldogsTeeN.getProductPrice() * qty;
            }

        }

        if (LoginController.bulldogsTeeBlue.getProductStatus()) {

            double qty = Double.parseDouble(quantity23.getValue());
            LoginController.bulldogsTeeBlue.setProductQuantity(qty);
            item23Amount = LoginController.bulldogsTeeBlue.getProductPrice() * qty;

            if (source == quantity23) {
                item23Amount = LoginController.bulldogsTeeBlue.getProductPrice() * qty;
            }

        }

        if (LoginController.bulldogsTeeDB.getProductStatus()) {

            double qty = Double.parseDouble(quantity24.getValue());
            LoginController.bulldogsTeeDB.setProductQuantity(qty);
            item24Amount = LoginController.bulldogsTeeDB.getProductPrice() * qty;

            if (source == quantity24) {
                item24Amount = LoginController.bulldogsTeeDB.getProductPrice() * qty;
            }

        }

        if (LoginController.bulldogsTeeBlack.getProductStatus()) {

            double qty = Double.parseDouble(quantity25.getValue());
            LoginController.bulldogsTeeBlack.setProductQuantity(qty);
            item25Amount = LoginController.bulldogsTeeBlack.getProductPrice() * qty;

            if (source == quantity25) {
                item25Amount = LoginController.bulldogsTeeBlack.getProductPrice() * qty;
            }

        }

        if (LoginController.bagTag.getProductStatus()) {

            double qty = Double.parseDouble(quantity26.getValue());
            LoginController.bagTag.setProductQuantity(qty);
            item26Amount = LoginController.bagTag.getProductPrice() * qty;

            if (source == quantity26) {
                item26Amount = LoginController.bagTag.getProductPrice() * qty;
            }

        }

        if (LoginController.windbreaker.getProductStatus()) {

            double qty = Double.parseDouble(quantity27.getValue());
            LoginController.windbreaker.setProductQuantity(qty);
            item27Amount = LoginController.windbreaker.getProductPrice() * qty;

            if (source == quantity27) {
                item27Amount = LoginController.windbreaker.getProductPrice() * qty;
            }

        }

        if (LoginController.capGold.getProductStatus()) {

            double qty = Double.parseDouble(quantity28.getValue());
            LoginController.capGold.setProductQuantity(qty);
            item28Amount = LoginController.capGold.getProductPrice() * qty;

            if (source == quantity28) {
                item28Amount = LoginController.capGold.getProductPrice() * qty;
            }

        }

        if (LoginController.bluelace.getProductStatus()) {

            double qty = Double.parseDouble(quantity29.getValue());
            LoginController.bluelace.setProductQuantity(qty);
            item29Amount = LoginController.bluelace.getProductPrice() * qty;

            if (source == quantity29) {
                item29Amount = LoginController.bluelace.getProductPrice() * qty;
            }

        }

        if (LoginController.goldLace.getProductStatus()) {

            double qty = Double.parseDouble(quantity30.getValue());
            LoginController.goldLace.setProductQuantity(qty);
            item30Amount = LoginController.goldLace.getProductPrice() * qty;

            if (source == quantity30) {
                item30Amount = LoginController.goldLace.getProductPrice() * qty;
            }

        }

        if (LoginController.bgLace.getProductStatus()) {

            double qty = Double.parseDouble(quantity31.getValue());
            LoginController.bgLace.setProductQuantity(qty);
            item31Amount = LoginController.bgLace.getProductPrice() * qty;

            if (source == quantity31) {
                item31Amount = LoginController.bgLace.getProductPrice() * qty;
            }

        }

        if (LoginController.anatomy.getProductStatus()) {

            double qty = Double.parseDouble(quantity32.getValue());
            LoginController.anatomy.setProductQuantity(qty);
            item32Amount = LoginController.anatomy.getProductPrice() * qty;

            if (source == quantity32) {
                item32Amount = LoginController.anatomy.getProductPrice() * qty;
            }

        }

        if (LoginController.rleOne.getProductStatus()) {

            double qty = Double.parseDouble(quantity33.getValue());
            LoginController.rleOne.setProductQuantity(qty);
            item33Amount = LoginController.rleOne.getProductPrice() * qty;

            if (source == quantity33) {
                item33Amount = LoginController.rleOne.getProductPrice() * qty;
            }

        }

         if (LoginController.rleTwo.getProductStatus()) {

            double qty = Double.parseDouble(quantity34.getValue());
            LoginController.rleTwo.setProductQuantity(qty);
            item34Amount = LoginController.rleTwo.getProductPrice() * qty;

            if (source == quantity34) {
                item34Amount = LoginController.rleTwo.getProductPrice() * qty;
            }

        }

        if (LoginController.rleThree.getProductStatus()) {

            double qty = Double.parseDouble(quantity35.getValue());
            LoginController.rleThree.setProductQuantity(qty);
            item35Amount = LoginController.rleThree.getProductPrice() * qty;

            if (source == quantity35) {
                item35Amount = LoginController.rleThree.getProductPrice() * qty;
            }

        }

        if (LoginController.rleFour.getProductStatus()) {

            double qty = Double.parseDouble(quantity36.getValue());
            LoginController.rleFour.setProductQuantity(qty);
            item36Amount = LoginController.rleFour.getProductPrice() * qty;

            if (source == quantity36) {
                item36Amount = LoginController.rleFour.getProductPrice() * qty;
            }

        }

        if (LoginController.biochem.getProductStatus()) {

            double qty = Double.parseDouble(quantity37.getValue());
            LoginController.biochem.setProductQuantity(qty);
            item37Amount = LoginController.biochem.getProductPrice() * qty;

            if (source == quantity37) {
                item37Amount = LoginController.biochem.getProductPrice() * qty;
            }

        }

        if (LoginController.taxonomy.getProductStatus()) {

            double qty = Double.parseDouble(quantity38.getValue());
            LoginController.taxonomy.setProductQuantity(qty);
            item38Amount = LoginController.taxonomy.getProductPrice() * qty;

            if (source == quantity38) {
                item38Amount = LoginController.taxonomy.getProductPrice() * qty;
            }

        }

        if (LoginController.pharmaBook.getProductStatus()) {

            double qty = Double.parseDouble(quantity39.getValue());
            LoginController.pharmaBook.setProductQuantity(qty);
            item39Amount = LoginController.pharmaBook.getProductPrice() * qty;

            if (source == quantity39) {
                item39Amount = LoginController.pharmaBook.getProductPrice() * qty;
            }

        }



        // Compute total amount for all items chosen
        totalAmount = item1Amount + 
                    item2Amount + 
                    item3Amount + 
                    item4Amount + 
                    item5Amount + 
                    item6Amount + 
                    item7Amount + 
                    item8Amount + 
                    item8Amount + 
                    item9Amount +  
                    item10Amount +
                    item11Amount +
                    item12Amount +
                    item13Amount +
                    item14Amount +
                    item15Amount +
                    item16Amount +
                    item17Amount +
                    item18Amount +
                    item19Amount +
                    item20Amount +
                    item21Amount +
                    item22Amount +
                    item23Amount +
                    item24Amount +
                    item25Amount +
                    item26Amount +
                    item27Amount +
                    item28Amount +
                    item29Amount +
                    item30Amount +
                    item31Amount +
                    item32Amount +
                    item33Amount +
                    item34Amount +
                    item35Amount +
                    item36Amount +
                    item37Amount +
                    item38Amount +
                    item39Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
        
    }

    public void getInitialAmount() {

        double totalAmount = 0.00;

        //UNIFORM

        if (LoginController.unifTradM.getProductStatus()) {
            totalAmount += LoginController.unifTradM.getProductPrice();
        }

        if (LoginController.unifTradF.getProductStatus()) {
            totalAmount += LoginController.unifTradF.getProductPrice();
        }

        if (LoginController.unifTourM.getProductStatus()) {
            totalAmount += LoginController.unifTourM.getProductPrice();
        }

        if (LoginController.unifTourF.getProductStatus()) {
            totalAmount += LoginController.unifTourF.getProductPrice();
        }

        if (LoginController.unifDentHygM.getProductStatus()) {
            totalAmount += LoginController.unifDentHygM.getProductPrice();
        }

        if (LoginController.unifDentHygF.getProductStatus()) {
            totalAmount += LoginController.unifDentHygF.getProductPrice();
        }

        if (LoginController.unifDentLabM.getProductStatus()) {
            totalAmount += LoginController.unifDentLabM.getProductPrice();
        }

        if (LoginController.unifDentLabF.getProductStatus()) {
            totalAmount += LoginController.unifDentLabF.getProductPrice();
        }

        if (LoginController.unifMedicineM.getProductStatus()) {
            totalAmount += LoginController.unifMedicineM.getProductPrice();
        }

        if (LoginController.unifMedicineF.getProductStatus()) {
            totalAmount += LoginController.unifMedicineF.getProductPrice();
        }

        if (LoginController.unifMedTechM.getProductStatus()) {
            totalAmount += LoginController.unifMedTechM.getProductPrice();
        }

        if (LoginController.unifMedTechF.getProductStatus()) {
            totalAmount += LoginController.unifMedTechF.getProductPrice();
        }

        if (LoginController.unifNursingM.getProductStatus()) {
            totalAmount += LoginController.unifNursingM.getProductPrice();
        }

        if (LoginController.unifNursingF.getProductStatus()) {
            totalAmount += LoginController.unifNursingF.getProductPrice();
        }

        if (LoginController.unifPharmaM.getProductStatus()) {
            totalAmount += LoginController.unifPharmaM.getProductPrice();
        }

        if (LoginController.unifPharmaF.getProductStatus()) {
            totalAmount += LoginController.unifPharmaF.getProductPrice();
        }

        if (LoginController.unifPsychM.getProductStatus()) {
            totalAmount += LoginController.unifPsychM.getProductPrice();
        }

        if (LoginController.unifPsychF.getProductStatus()) {
            totalAmount += LoginController.unifPsychF.getProductPrice();
        }

        //APPARELS 

        if (LoginController.hoodie.getProductStatus()) {
            totalAmount += LoginController.hoodie.getProductPrice();
        }

        if (LoginController.nusgPoloMale.getProductStatus()) {
            totalAmount += LoginController.nusgPoloMale.getProductPrice();
        }

        if (LoginController.nusgPoloFemale.getProductStatus()) {
            totalAmount += LoginController.nusgPoloFemale.getProductPrice();
        }

        if (LoginController.bulldogsTeeN.getProductStatus()) {
            totalAmount += LoginController.bulldogsTeeN.getProductPrice();
        }

        if (LoginController.bulldogsTeeBlue.getProductStatus()) {
            totalAmount += LoginController.bulldogsTeeBlue.getProductPrice();
        }

        if (LoginController.bulldogsTeeDB.getProductStatus()) {
            totalAmount += LoginController.bulldogsTeeDB.getProductPrice();
        }

        if (LoginController.bulldogsTeeBlack.getProductStatus()) {
            totalAmount += LoginController.bulldogsTeeBlack.getProductPrice();
        }

        //ACCESSORIES
        if (LoginController.bagTag.getProductStatus()) {
            totalAmount += LoginController.bagTag.getProductPrice();
        }

        if (LoginController.windbreaker.getProductStatus()) {
            totalAmount += LoginController.windbreaker.getProductPrice();
        }

        if (LoginController.capGold.getProductStatus()) {
            totalAmount += LoginController.capGold.getProductPrice();
        }

        if (LoginController.bluelace.getProductStatus()) {
            totalAmount += LoginController.bluelace.getProductPrice();
        }

        if (LoginController.goldLace.getProductStatus()) {
            totalAmount += LoginController.goldLace.getProductPrice();
        }

        if (LoginController.bgLace.getProductStatus()) {
            totalAmount += LoginController.bgLace.getProductPrice();
        }

        //BOOKS

        if (LoginController.anatomy.getProductStatus()) {
            totalAmount += LoginController.anatomy.getProductPrice();
        }

        if (LoginController.rleOne.getProductStatus()) {
            totalAmount += LoginController.rleOne.getProductPrice();
        }

        if (LoginController.rleTwo.getProductStatus()) {
            totalAmount += LoginController.rleTwo.getProductPrice();
        }

        if (LoginController.rleThree.getProductStatus()) {
            totalAmount += LoginController.rleThree.getProductPrice();
        }

        if (LoginController.rleFour.getProductStatus()) {
            totalAmount += LoginController.rleFour.getProductPrice();
        }

        if (LoginController.biochem.getProductStatus()) {
            totalAmount += LoginController.biochem.getProductPrice();
        }

        if (LoginController.taxonomy.getProductStatus()) {
            totalAmount += LoginController.taxonomy.getProductPrice();
        }

        if (LoginController.pharmaBook.getProductStatus()) {
            totalAmount += LoginController.pharmaBook.getProductPrice();
        }

        total.setText(Double.toString(totalAmount));
    }

    // Go to Receipt Page
    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
        public void gotoCart(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MyCart.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
            public void gotoHome(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
                public void gotorec(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }
}

//     @FXML
//     private VBox cartVBox;

//     @FXML
//     private Label totalAmountLabel;

//     private List<CartItem> cartItems;

//     @Override
//     public void initialize(URL location, ResourceBundle resources) {
//         // Initialize the cart view
//     }

//     public void showItems(List<CartItem> cartItems) {
//         // Clear the previous cart items
//         cartVBox.getChildren().clear();

//         // Set the new cart items
//         this.cartItems = cartItems;

//         // Add each cart item to the cart view
//         for (CartItem item : cartItems) {
//             if (item.getProduct().getProductStatus()) {
//                 cartVBox.getChildren().add(item.getCartItemPane());
//             }
//         }
//     }

//     public void getInitialAmount() {
//         // Calculate and set the initial total amount
//         double totalAmount = 0.0;
//         for (CartItem item : cartItems) {
//             if (item.getProduct().getProductStatus()) {
//                 totalAmount += item.getProduct().getProductPrice() * item.getProduct().getProductQuantity();
//             }
//         }
//         totalAmountLabel.setText(String.valueOf(totalAmount));
//     }
// }