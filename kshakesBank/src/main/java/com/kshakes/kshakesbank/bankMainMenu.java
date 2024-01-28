package com.kshakes.kshakesbank;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
public class bankMainMenu {

    bankHandler usersBank = new bankHandler();
    public float currentMoney = usersBank.getUsersMoney();
    @FXML
    private Text moneyText;

    public void addMoneyToUser() {
        usersBank.setUsersMoney(currentMoney += 10);
        moneyText.setText(usersBank.returnMoneyAsStr());
    }
}
