package com.kshakes.kshakesbank;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.text.NumberFormat;
import java.util.Locale;

public class bankHandler {

    private float usersMoney = 0;
    NumberFormat currencyF = NumberFormat.getCurrencyInstance(Locale.UK);
    public float getUsersMoney() {
        return usersMoney;
    }
    public void setUsersMoney(float usersMoney) {
        this.usersMoney = usersMoney;
    }

    public String returnMoneyAsStr(){
        return currencyF.format(usersMoney);
    }





}
