package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    @CacheLookup
    private WebElement dropDownAccounts;

    @FindBy(xpath = "//table//th")
    @CacheLookup
    private List<WebElement> showTransactionsCloumns;

    public String getDefaulSelectedtAccountText(){
        Select select=new Select(dropDownAccounts);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        return BrowserUtils.getText(firstSelectedOption);
    }
    public List<String> getAllAccountTypesFromDropDown(){
        Select select= new Select(dropDownAccounts);
        List<WebElement> options = select.getOptions();
        return BrowserUtils.getElementsText(options);
    }

    public List<String> getShowTransactionsClomunsText(){
        return BrowserUtils.getElementsText(showTransactionsCloumns);
    }
}
