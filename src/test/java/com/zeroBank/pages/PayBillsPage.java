package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage {

    @FindBy(css = "#sp_amount")
    private WebElement amountBox;
    @FindBy(css = "#sp_date")
    private WebElement dateBox;
    @FindBy(css = "#sp_description")
    private WebElement descriptionBox;

    @FindBy(id = "pay_saved_payees")
    private WebElement payButton;

    @FindBy(css = "#alert_content")
    private WebElement successesMessage;

    public void fillAmountBox(Integer amount) {
        BrowserUtils.clearAndSendKeys(amountBox, Integer.toString(amount));
    }

    public void fillDateBox(String date) {
        BrowserUtils.clearAndSendKeys(dateBox, date);
    }

    public void fillDescriptionBox(String date) {
        BrowserUtils.clearAndSendKeys(descriptionBox, date);
    }

    public void clickOnPayButton() {
        BrowserUtils.clickWithJS(payButton);
    }

    public String getSuccessMessage(){
        return BrowserUtils.getText(successesMessage);
    }

    public String getErrorMessageOnAnountBox(){
        return amountBox.getAttribute("validationMessage");
    }

    public boolean istDateBoxEmpty(){
        String value = dateBox.getAttribute("value");
        return value.isEmpty();
    }
}
