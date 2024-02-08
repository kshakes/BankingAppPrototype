package com.kshakes.kshakesbank;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class bankMainMenu {

    bankHandler usersBank = new bankHandler();
    public float currentMoney = usersBank.getUsersMoney();
    @FXML
    private Text moneyText;
    @FXML
    private Text latestTransactionTimeText;
    private String latestTime = "07/02/2024";
    @FXML
    private Text latestTransactionNameText;
    private String latestName= "John";
    @FXML
    private Text latestTransactionCostText;
    private float latestCost = -5.00F;

    public void setLatestTransaction(){
        latestTransactionTimeText.setText(latestTime);
        latestTransactionNameText.setText(latestName);
        latestTransactionCostText.setText("£" + String.format("%.2f", latestCost));
    }

    public void addMoneyToUser() {
        usersBank.setUsersMoney(currentMoney += 1000.00F);
        moneyText.setText(usersBank.returnMoneyAsStr());
    }

    public void sendMoneyToUser() {
        if (usersBank.getUsersMoney() > 0) {
            usersBank.setUsersMoney(currentMoney -= 10.00F);
            moneyText.setText(usersBank.returnMoneyAsStr());
        }
    }
    @FXML
    public void initialize(){
        setLatestTransaction();
    }
}
