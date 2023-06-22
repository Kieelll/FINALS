package Controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {
    
    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount, item9Amount, item10Amount, item11Amount, item12Amount, item13Amount, item14Amount, item15Amount, item16Amount, item17Amount, item18Amount, item19Amount, item20Amount, item21Amount, item22Amount, item23Amount, item24Amount, item25Amount, item26Amount, item27Amount, item28Amount, item29Amount, item30Amount, item31Amount, item32Amount, item33Amount, item34Amount, item35Amount, item36Amount, item37Amount, item38Amount, item39Amount;

    @FXML
    MyCartController myCartController = null;
    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10, qty11, qty12, qty13, qty14, qty15, qty16, qty17, qty18, qty19, qty20, qty21, qty22, qty23, qty24, qty25, qty26, qty27, qty28, qty29, qty30, qty31, qty32, qty33, qty34, qty35, qty36, qty37, qty38, qty39,
            product1,product2,product3,product4,product5,product6,product7,product8,product9,product10,product11,product12,product13,product14,product15,product16,product17,product18,product19,product20,product21,product22,product23,product24,product25,product26,product27,product28,product29,product30,product31,product32,product33,product34,product35,product36,product37,product38,product39,
            price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, price14, price15, price16, price17, price18, price19, price20, price21, price22, price23, price24, price25, price26, price27, price28, price29, price30, price31, price32, price33, price34, price35, price36, price37, price38, price39,
            amount1,amount2,amount3,amount4,amount5,amount6,amount7,amount8,amount9,amount10,amount11,amount12,amount13,amount14,amount15,amount16,amount17,amount18,amount19,amount20,amount21,amount22,amount23,amount24,amount25,amount26,amount27,amount28,amount29,amount30,amount31,amount32,amount33,amount34,amount35,amount36,amount37,amount38, amount39,
            total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginController.unifTradM.getProductStatus()) {
            product1.setText(LoginController.unifTradM.getProductName());
            qty1.setText(Double.toString(LoginController.unifTradM.getProductQuantity()));
            price1.setText(Double.toString(LoginController.unifTradM.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.unifTradM.getProductPrice() * LoginController.unifTradM.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.unifTradM.getProductPrice() * LoginController.unifTradM.getProductQuantity();

        }

           if (LoginController.unifTradF.getProductStatus()) {
            product2.setText(LoginController.unifTradF.getProductName());
            qty2.setText(Double.toString(LoginController.unifTradF.getProductQuantity()));
            price2.setText(Double.toString(LoginController.unifTradF.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.unifTradF.getProductPrice() * LoginController.unifTradF.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.unifTradF.getProductPrice() * LoginController.unifTradF.getProductQuantity();

        }

          if (LoginController.unifTourM.getProductStatus()) {
            product3.setText(LoginController.unifTourM.getProductName());
            qty3.setText(Double.toString(LoginController.unifTourM.getProductQuantity()));
            price3.setText(Double.toString(LoginController.unifTourM.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.unifTourM.getProductPrice() * LoginController.unifTourM.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.unifTourM.getProductPrice() * LoginController.unifTourM.getProductQuantity();

        }

          if (LoginController.unifTourF.getProductStatus()) {
            product4.setText(LoginController.unifTourF.getProductName());
            qty4.setText(Double.toString(LoginController.unifTourF.getProductQuantity()));
            price4.setText(Double.toString(LoginController.unifTourF.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.unifTourF.getProductPrice() * LoginController.unifTourF.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.unifTourF.getProductPrice() * LoginController.unifTourF.getProductQuantity();

        }

        if (LoginController.unifDentHygM.getProductStatus()) {
            product5.setText(LoginController.unifDentHygM.getProductName());
            qty5.setText(Double.toString(LoginController.unifDentHygM.getProductQuantity()));
            price5.setText(Double.toString(LoginController.unifDentHygM.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.unifDentHygM.getProductPrice() * LoginController.unifDentHygM.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.unifDentHygM.getProductPrice() * LoginController.unifDentHygM.getProductQuantity();

        }

        if (LoginController.unifDentHygF.getProductStatus()) {
            product6.setText(LoginController.unifDentHygF.getProductName());
            qty6.setText(Double.toString(LoginController.unifDentHygF.getProductQuantity()));
            price6.setText(Double.toString(LoginController.unifDentHygF.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.unifDentHygF.getProductPrice() * LoginController.unifDentHygF.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.unifDentHygF.getProductPrice() * LoginController.unifDentHygF.getProductQuantity();

        }

        if (LoginController.unifDentLabM.getProductStatus()) {
            product7.setText(LoginController.unifDentLabM.getProductName());
            qty7.setText(Double.toString(LoginController.unifDentLabM.getProductQuantity()));
            price7.setText(Double.toString(LoginController.unifDentLabM.getProductPrice()));
            amount7.setText(Double
                    .toString(LoginController.unifDentLabM.getProductPrice() * LoginController.unifDentLabM.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = LoginController.unifDentLabM.getProductPrice() * LoginController.unifDentLabM.getProductQuantity();

        }

        if (LoginController.unifDentLabF.getProductStatus()) {
            product8.setText(LoginController.unifDentLabF.getProductName());
            qty8.setText(Double.toString(LoginController.unifDentLabF.getProductQuantity()));
            price8.setText(Double.toString(LoginController.unifDentLabF.getProductPrice()));
            amount8.setText(Double
                    .toString(LoginController.unifDentLabF.getProductPrice() * LoginController.unifDentLabF.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = LoginController.unifDentLabF.getProductPrice() * LoginController.unifDentLabF.getProductQuantity();

        }

        if (LoginController.unifMedicineM.getProductStatus()) {
            product9.setText(LoginController.unifMedicineM.getProductName());
            qty9.setText(Double.toString(LoginController.unifMedicineM.getProductQuantity()));
            price9.setText(Double.toString(LoginController.unifMedicineM.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.unifMedicineM.getProductPrice() * LoginController.unifMedicineM.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.unifMedicineM.getProductPrice() * LoginController.unifMedicineM.getProductQuantity();

        }

        if (LoginController.unifMedicineF.getProductStatus()) {
            product10.setText(LoginController.unifMedicineF.getProductName());
            qty10.setText(Double.toString(LoginController.unifMedicineF.getProductQuantity()));
            price10.setText(Double.toString(LoginController.unifMedicineF.getProductPrice()));
            amount10.setText(Double
                    .toString(LoginController.unifMedicineF.getProductPrice() * LoginController.unifMedicineF.getProductQuantity()));

            product10.setVisible(true);
            qty10.setVisible(true);
            price10.setVisible(true);
            amount10.setVisible(true);

            item10Amount = LoginController.unifMedicineF.getProductPrice() * LoginController.unifMedicineF.getProductQuantity();

        }

        if (LoginController.unifMedTechM.getProductStatus()) {
            product11.setText(LoginController.unifMedTechM.getProductName());
            qty11.setText(Double.toString(LoginController.unifMedTechM.getProductQuantity()));
            price11.setText(Double.toString(LoginController.unifMedTechM.getProductPrice()));
            amount11.setText(Double
                    .toString(LoginController.unifMedTechM.getProductPrice() * LoginController.unifMedTechM.getProductQuantity()));

            product11.setVisible(true);
            qty11.setVisible(true);
            price11.setVisible(true);
            amount11.setVisible(true);

            item11Amount = LoginController.unifMedTechM.getProductPrice() * LoginController.unifMedTechM.getProductQuantity();

        }

        if (LoginController.unifMedTechF.getProductStatus()) {
            product12.setText(LoginController.unifMedTechF.getProductName());
            qty12.setText(Double.toString(LoginController.unifMedTechF.getProductQuantity()));
            price12.setText(Double.toString(LoginController.unifMedTechF.getProductPrice()));
            amount12.setText(Double
                    .toString(LoginController.unifMedTechF.getProductPrice() * LoginController.unifMedTechF.getProductQuantity()));

            product12.setVisible(true);
            qty12.setVisible(true);
            price12.setVisible(true);
            amount12.setVisible(true);

            item12Amount = LoginController.unifMedTechF.getProductPrice() * LoginController.unifMedTechF.getProductQuantity();

        }

        if (LoginController.unifNursingM.getProductStatus()) {
            product13.setText(LoginController.unifNursingM.getProductName());
            qty13.setText(Double.toString(LoginController.unifNursingM.getProductQuantity()));
            price13.setText(Double.toString(LoginController.unifNursingM.getProductPrice()));
            amount13.setText(Double
                    .toString(LoginController.unifNursingM.getProductPrice() * LoginController.unifNursingM.getProductQuantity()));

            product13.setVisible(true);
            qty13.setVisible(true);
            price13.setVisible(true);
            amount13.setVisible(true);

            item13Amount = LoginController.unifNursingM.getProductPrice() * LoginController.unifNursingM.getProductQuantity();

        }

        if (LoginController.unifNursingF.getProductStatus()) {
            product14.setText(LoginController.unifNursingF.getProductName());
            qty14.setText(Double.toString(LoginController.unifNursingF.getProductQuantity()));
            price14.setText(Double.toString(LoginController.unifNursingF.getProductPrice()));
            amount14.setText(Double
                    .toString(LoginController.unifNursingF.getProductPrice() * LoginController.unifNursingF.getProductQuantity()));

            product14.setVisible(true);
            qty14.setVisible(true);
            price14.setVisible(true);
            amount14.setVisible(true);

            item14Amount = LoginController.unifNursingF.getProductPrice() * LoginController.unifNursingF.getProductQuantity();

        }

        if (LoginController.unifPharmaM.getProductStatus()) {
            product15.setText(LoginController.unifPharmaM.getProductName());
            qty15.setText(Double.toString(LoginController.unifPharmaM.getProductQuantity()));
            price15.setText(Double.toString(LoginController.unifPharmaM.getProductPrice()));
            amount15.setText(Double
                    .toString(LoginController.unifPharmaM.getProductPrice() * LoginController.unifPharmaM.getProductQuantity()));

            product15.setVisible(true);
            qty15.setVisible(true);
            price15.setVisible(true);
            amount15.setVisible(true);

            item15Amount = LoginController.unifPharmaM.getProductPrice() * LoginController.unifPharmaM.getProductQuantity();

        }

        if (LoginController.unifPharmaF.getProductStatus()) {
            product16.setText(LoginController.unifPharmaF.getProductName());
            qty16.setText(Double.toString(LoginController.unifPharmaF.getProductQuantity()));
            price16.setText(Double.toString(LoginController.unifPharmaF.getProductPrice()));
            amount16.setText(Double
                    .toString(LoginController.unifPharmaF.getProductPrice() * LoginController.unifPharmaF.getProductQuantity()));

            product16.setVisible(true);
            qty16.setVisible(true);
            price16.setVisible(true);
            amount16.setVisible(true);

            item16Amount = LoginController.unifPharmaF.getProductPrice() * LoginController.unifPharmaF.getProductQuantity();

        }

        if (LoginController.unifPsychM.getProductStatus()) {
            product17.setText(LoginController.unifPsychM.getProductName());
            qty17.setText(Double.toString(LoginController.unifPsychM.getProductQuantity()));
            price17.setText(Double.toString(LoginController.unifPsychM.getProductPrice()));
            amount17.setText(Double
                    .toString(LoginController.unifPsychM.getProductPrice() * LoginController.unifPsychM.getProductQuantity()));

            product17.setVisible(true);
            qty17.setVisible(true);
            price17.setVisible(true);
            amount17.setVisible(true);

            item17Amount = LoginController.unifPsychM.getProductPrice() * LoginController.unifPsychM.getProductQuantity();

        }

        if (LoginController.unifPsychF.getProductStatus()) {
            product18.setText(LoginController.unifPsychF.getProductName());
            qty18.setText(Double.toString(LoginController.unifPsychF.getProductQuantity()));
            price18.setText(Double.toString(LoginController.unifPsychF.getProductPrice()));
            amount18.setText(Double
                    .toString(LoginController.unifPsychF.getProductPrice() * LoginController.unifPsychF.getProductQuantity()));

            product18.setVisible(true);
            qty18.setVisible(true);
            price18.setVisible(true);
            amount18.setVisible(true);

            item18Amount = LoginController.unifPsychF.getProductPrice() * LoginController.unifPsychF.getProductQuantity();

        }

         if (LoginController.hoodie.getProductStatus()) {
            product19.setText(LoginController.hoodie.getProductName());
            qty19.setText(Double.toString(LoginController.hoodie.getProductQuantity()));
            price19.setText(Double.toString(LoginController.hoodie.getProductPrice()));
            amount19.setText(Double
                    .toString(LoginController.hoodie.getProductPrice() * LoginController.hoodie.getProductQuantity()));

            product19.setVisible(true);
            qty19.setVisible(true);
            price19.setVisible(true);
            amount19.setVisible(true);

            item19Amount = LoginController.hoodie.getProductPrice() * LoginController.hoodie.getProductQuantity();

        }

        if (LoginController.nusgPoloMale.getProductStatus()) {
            product20.setText(LoginController.nusgPoloMale.getProductName());
            qty20.setText(Double.toString(LoginController.nusgPoloMale.getProductQuantity()));
            price20.setText(Double.toString(LoginController.nusgPoloMale.getProductPrice()));
            amount20.setText(Double
                    .toString(LoginController.nusgPoloMale.getProductPrice() * LoginController.nusgPoloMale.getProductQuantity()));

            product20.setVisible(true);
            qty20.setVisible(true);
            price20.setVisible(true);
            amount20.setVisible(true);

            item20Amount = LoginController.nusgPoloMale.getProductPrice() * LoginController.nusgPoloMale.getProductQuantity();

        }

        if (LoginController.nusgPoloFemale.getProductStatus()) {
            product21.setText(LoginController.nusgPoloFemale.getProductName());
            qty21.setText(Double.toString(LoginController.nusgPoloFemale.getProductQuantity()));
            price21.setText(Double.toString(LoginController.nusgPoloFemale.getProductPrice()));
            amount21.setText(Double
                    .toString(LoginController.nusgPoloFemale.getProductPrice() * LoginController.nusgPoloFemale.getProductQuantity()));

            product21.setVisible(true);
            qty21.setVisible(true);
            price21.setVisible(true);
            amount21.setVisible(true);

            item21Amount = LoginController.nusgPoloFemale.getProductPrice() * LoginController.nusgPoloFemale.getProductQuantity();
        }

        if (LoginController.bulldogsTeeN.getProductStatus()) {
            product22.setText(LoginController.bulldogsTeeN.getProductName());
            qty22.setText(Double.toString(LoginController.bulldogsTeeN.getProductQuantity()));
            price22.setText(Double.toString(LoginController.bulldogsTeeN.getProductPrice()));
            amount22.setText(Double.toString(LoginController.bulldogsTeeN.getProductPrice() * LoginController.bulldogsTeeN.getProductQuantity()));
            
            product22.setVisible(true);
            qty22.setVisible(true);
            price22.setVisible(true);
            amount22.setVisible(true);
            item22Amount = LoginController.bulldogsTeeN.getProductPrice() * LoginController.bulldogsTeeN.getProductQuantity();
        }

        if (LoginController.bulldogsTeeBlue.getProductStatus()) {
            product23.setText(LoginController.bulldogsTeeBlue.getProductName());
            qty23.setText(Double.toString(LoginController.bulldogsTeeBlue.getProductQuantity()));
            price23.setText(Double.toString(LoginController.bulldogsTeeBlue.getProductPrice()));
            amount23.setText(Double.toString(LoginController.bulldogsTeeBlue.getProductPrice() * LoginController.bulldogsTeeBlue.getProductQuantity()));
            product23.setVisible(true);
            qty23.setVisible(true);
            price23.setVisible(true);
            amount23.setVisible(true);
            item23Amount = LoginController.bulldogsTeeBlue.getProductPrice() * LoginController.bulldogsTeeBlue.getProductQuantity();
        }


        if (LoginController.bulldogsTeeDB.getProductStatus()) {
            product24.setText(LoginController.bulldogsTeeDB.getProductName());
            qty24.setText(Double.toString(LoginController.bulldogsTeeDB.getProductQuantity()));
            price24.setText(Double.toString(LoginController.bulldogsTeeDB.getProductPrice()));
            amount24.setText(Double.toString(LoginController.bulldogsTeeDB.getProductPrice() * LoginController.bulldogsTeeDB.getProductQuantity()));
            product24.setVisible(true);
            qty24.setVisible(true);
            price24.setVisible(true);
            amount24.setVisible(true);
            item24Amount = LoginController.bulldogsTeeDB.getProductPrice() * LoginController.bulldogsTeeDB.getProductQuantity();
        }

        if (LoginController.bulldogsTeeBlack.getProductStatus()) {
            product25.setText(LoginController.bulldogsTeeBlack.getProductName());
            qty25.setText(Double.toString(LoginController.bulldogsTeeBlack.getProductQuantity()));
            price25.setText(Double.toString(LoginController.bulldogsTeeBlack.getProductPrice()));
            amount25.setText(Double.toString(LoginController.bulldogsTeeBlack.getProductPrice() * LoginController.bulldogsTeeBlack.getProductQuantity()));
            product25.setVisible(true);
            qty25.setVisible(true);
            price25.setVisible(true);
            amount25.setVisible(true);
            item25Amount = LoginController.bulldogsTeeBlack.getProductPrice() * LoginController.bulldogsTeeBlack.getProductQuantity();
        }

        if (LoginController.bagTag.getProductStatus()) {
            product26.setText(LoginController.bagTag.getProductName());
            qty26.setText(Double.toString(LoginController.bagTag.getProductQuantity()));
            price26.setText(Double.toString(LoginController.bagTag.getProductPrice()));
            amount26.setText(Double.toString(LoginController.bagTag.getProductPrice() * LoginController.bagTag.getProductQuantity()));
            product26.setVisible(true);
            qty26.setVisible(true);
            price26.setVisible(true);
            amount26.setVisible(true);
            item26Amount = LoginController.bagTag.getProductPrice() * LoginController.bagTag.getProductQuantity();
        }

        if (LoginController.windbreaker.getProductStatus()) {
            product27.setText(LoginController.windbreaker.getProductName());
            qty27.setText(Double.toString(LoginController.windbreaker.getProductQuantity()));
            price27.setText(Double.toString(LoginController.windbreaker.getProductPrice()));
            amount27.setText(Double.toString(LoginController.windbreaker.getProductPrice() * LoginController.windbreaker.getProductQuantity()));
            product27.setVisible(true);
            qty27.setVisible(true);
            price27.setVisible(true);
            amount27.setVisible(true);
            item27Amount = LoginController.windbreaker.getProductPrice() * LoginController.windbreaker.getProductQuantity();
        }

        if (LoginController.capGold.getProductStatus()) {
            product28.setText(LoginController.capGold.getProductName());
            qty28.setText(Double.toString(LoginController.capGold.getProductQuantity()));
            price28.setText(Double.toString(LoginController.capGold.getProductPrice()));
            amount28.setText(Double.toString(LoginController.capGold.getProductPrice() * LoginController.capGold.getProductQuantity()));
            product28.setVisible(true);
            qty28.setVisible(true);
            price28.setVisible(true);
            amount28.setVisible(true);
            item28Amount = LoginController.capGold.getProductPrice() * LoginController.capGold.getProductQuantity();

        }

        if (LoginController.bluelace.getProductStatus()) {
            product29.setText(LoginController.bluelace.getProductName());
            qty29.setText(Double.toString(LoginController.bluelace.getProductQuantity()));
            price29.setText(Double.toString(LoginController.bluelace.getProductPrice()));
            amount29.setText(Double.toString(LoginController.bluelace.getProductPrice() * LoginController.bluelace.getProductQuantity()));
            product29.setVisible(true);
            qty29.setVisible(true);
            price29.setVisible(true);
            amount29.setVisible(true);
            item29Amount = LoginController.bluelace.getProductPrice() * LoginController.bluelace.getProductQuantity();

        }

        if (LoginController.goldLace.getProductStatus()) {
            product30.setText(LoginController.goldLace.getProductName());
            qty30.setText(Double.toString(LoginController.goldLace.getProductQuantity()));
            price30.setText(Double.toString(LoginController.goldLace.getProductPrice()));
            amount30.setText(Double.toString(LoginController.goldLace.getProductPrice() * LoginController.goldLace.getProductQuantity()));
            product30.setVisible(true);
            qty30.setVisible(true);
            price30.setVisible(true);
            amount30.setVisible(true);
            item30Amount = LoginController.goldLace.getProductPrice() * LoginController.goldLace.getProductQuantity();

        }

        if (LoginController.bgLace.getProductStatus()) {
            product31.setText(LoginController.bgLace.getProductName());
            qty31.setText(Double.toString(LoginController.bgLace.getProductQuantity()));
            price31.setText(Double.toString(LoginController.bgLace.getProductPrice()));
            amount31.setText(Double.toString(LoginController.bgLace.getProductPrice() * LoginController.bgLace.getProductQuantity()));
            product31.setVisible(true);
            qty31.setVisible(true);
            price31.setVisible(true);
            amount31.setVisible(true);
            item31Amount = LoginController.bgLace.getProductPrice() * LoginController.bgLace.getProductQuantity();

        }

        if (LoginController.anatomy.getProductStatus()) {
            product32.setText(LoginController.anatomy.getProductName());
            qty32.setText(Double.toString(LoginController.anatomy.getProductQuantity()));
            price32.setText(Double.toString(LoginController.anatomy.getProductPrice()));
            amount32.setText(Double.toString(LoginController.anatomy.getProductPrice() * LoginController.anatomy.getProductQuantity()));
            product32.setVisible(true);
            qty32.setVisible(true);
            price32.setVisible(true);
            amount32.setVisible(true);
            item32Amount = LoginController.anatomy.getProductPrice() * LoginController.anatomy.getProductQuantity();


        }

        if (LoginController.rleOne.getProductStatus()) {
            product33.setText(LoginController.rleOne.getProductName());
            qty33.setText(Double.toString(LoginController.rleOne.getProductQuantity()));
            price33.setText(Double.toString(LoginController.rleOne.getProductPrice()));
            amount33.setText(Double.toString(LoginController.rleOne.getProductPrice() * LoginController.rleOne.getProductQuantity()));
            product33.setVisible(true);
            qty33.setVisible(true);
            price33.setVisible(true);
            amount33.setVisible(true);
            item33Amount = LoginController.rleOne.getProductPrice() * LoginController.rleOne.getProductQuantity();


        }

        if (LoginController.rleTwo.getProductStatus()) {
            product34.setText(LoginController.rleTwo.getProductName());
            qty34.setText(Double.toString(LoginController.rleTwo.getProductQuantity()));
            price34.setText(Double.toString(LoginController.rleTwo.getProductPrice()));
            amount34.setText(Double.toString(LoginController.rleTwo.getProductPrice() * LoginController.rleTwo.getProductQuantity()));
            product34.setVisible(true);
            qty34.setVisible(true);
            price34.setVisible(true);
            amount34.setVisible(true);
            item34Amount = LoginController.rleTwo.getProductPrice() * LoginController.rleTwo.getProductQuantity();

        }

        if (LoginController.rleThree.getProductStatus()) {
            product35.setText(LoginController.rleThree.getProductName());
            qty35.setText(Double.toString(LoginController.rleThree.getProductQuantity()));
            price35.setText(Double.toString(LoginController.rleThree.getProductPrice()));
            amount35.setText(Double.toString(LoginController.rleThree.getProductPrice() * LoginController.rleThree.getProductQuantity()));
            product35.setVisible(true);
            qty35.setVisible(true);
            price35.setVisible(true);
            amount35.setVisible(true);
            item35Amount = LoginController.rleThree.getProductPrice() * LoginController.rleThree.getProductQuantity();
        }

        if (LoginController.rleFour.getProductStatus()) {
            product36.setText(LoginController.rleFour.getProductName());
            qty36.setText(Double.toString(LoginController.rleFour.getProductQuantity()));
            price36.setText(Double.toString(LoginController.rleFour.getProductPrice()));
            amount36.setText(Double.toString(LoginController.rleFour.getProductPrice() * LoginController.rleFour.getProductQuantity()));
            product36.setVisible(true);
            qty36.setVisible(true);
            price36.setVisible(true);
            amount36.setVisible(true);
            item36Amount = LoginController.rleFour.getProductPrice() * LoginController.rleFour.getProductQuantity();
        }

        if (LoginController.biochem.getProductStatus()) {
            product37.setText(LoginController.biochem.getProductName());
            qty37.setText(Double.toString(LoginController.biochem.getProductQuantity()));
            price37.setText(Double.toString(LoginController.biochem.getProductPrice()));
            amount37.setText(Double.toString(LoginController.biochem.getProductPrice() * LoginController.biochem.getProductQuantity()));
            product37.setVisible(true);
            qty37.setVisible(true);
            price37.setVisible(true);
            amount37.setVisible(true);
            item37Amount = LoginController.biochem.getProductPrice() * LoginController.biochem.getProductQuantity();
        }

        if (LoginController.taxonomy.getProductStatus()) {
            product38.setText(LoginController.taxonomy.getProductName());
            qty38.setText(Double.toString(LoginController.taxonomy.getProductQuantity()));
            price38.setText(Double.toString(LoginController.taxonomy.getProductPrice()));
            amount38.setText(Double.toString(LoginController.taxonomy.getProductPrice() * LoginController.taxonomy.getProductQuantity()));
            product38.setVisible(true);
            qty38.setVisible(true);
            price38.setVisible(true);
            amount38.setVisible(true);
            item38Amount = LoginController.taxonomy.getProductPrice() * LoginController.taxonomy.getProductQuantity();
        }

        if (LoginController.pharmaBook.getProductStatus()) {
            product39.setText(LoginController.pharmaBook.getProductName());
            qty39.setText(Double.toString(LoginController.pharmaBook.getProductQuantity()));
            price39.setText(Double.toString(LoginController.pharmaBook.getProductPrice()));
            amount39.setText(Double.toString(LoginController.pharmaBook.getProductPrice() * LoginController.pharmaBook.getProductQuantity()));
            product39.setVisible(true);
            qty39.setVisible(true);
            price39.setVisible(true);
            amount39.setVisible(true);
            item39Amount = LoginController.pharmaBook.getProductPrice() * LoginController.pharmaBook.getProductQuantity();
        }
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + 
                    item9Amount + item10Amount + item11Amount + item12Amount + item13Amount + item14Amount + item15Amount +item16Amount +
                    item17Amount + item18Amount + item19Amount + item20Amount + item21Amount + item22Amount + item23Amount + item24Amount +
                    item25Amount + item26Amount + item27Amount + item28Amount + item29Amount + item30Amount + item31Amount + item32Amount +
                    item33Amount + item34Amount + item35Amount + item36Amount + item37Amount + item38Amount + item39Amount; 

        System.out.println(final_amount);
        total.setText(Double.toString(final_amount));

        }
    }
