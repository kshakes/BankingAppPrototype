package com.kshakes.kshakesbank;

public class bankHandler {

    private float usersMoney = 0;
    public float getUsersMoney() {
        return usersMoney;
    }
    public void setUsersMoney(float usersMoney) {
        this.usersMoney = usersMoney;
    }
    public String returnMoneyAsStr(){
        return "£" + getUsersMoney();
    }


}
