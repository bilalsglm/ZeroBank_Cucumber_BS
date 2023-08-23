package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//a[@class='dropdown-toggle'][./i[@class='icon-user']]")
   // @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    private WebElement userName;
    public String getUserNameText(){
        return userName.getText();
    }
}
