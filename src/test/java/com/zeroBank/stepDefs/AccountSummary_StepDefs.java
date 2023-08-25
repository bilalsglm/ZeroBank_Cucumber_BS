package com.zeroBank.stepDefs;

import com.zeroBank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefs {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @When("The user should be able to see page title:{string}")
    public void the_user_should_be_able_to_see_page_title(String expectedTitle) {
        String actualTitle = accountSummaryPage.getPageTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("The user should be able to see following types")
    public void the_user_should_be_able_to_see_following_types(List<String> expectedAccountTypes) {

        List<String> actualAccountTypes = accountSummaryPage.getAccountTypesTexts();
        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);

    }

    @Then("The user should be able to see following credit account columns")
    public void the_user_should_be_able_to_see_following_credit_account_columns(List<String> expectedAccountCreditColumn) {
        List<String> actualCreditAccountClomns = accountSummaryPage.getCreditAccountsColumnsTexts();
        Assert.assertEquals(expectedAccountCreditColumn,actualCreditAccountClomns);


    }
}
