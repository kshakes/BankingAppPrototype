package com.kshakes.kshakesbank;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class bankHandler {

    private float usersMoney = 0;
    public float getUsersMoney() {
        return usersMoney;
    }
    public void setUsersMoney(float usersMoney) {
        this.usersMoney = usersMoney;
    }

    public String returnMoneyAsStr(){
        return "£" + String.format("%.2f", usersMoney);
    }





}
