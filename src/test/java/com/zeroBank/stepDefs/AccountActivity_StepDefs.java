package com.zeroBank.stepDefs;

import com.zeroBank.pages.AccountActivityPage;
import com.zeroBank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivity_StepDefs {
    AccountActivityPage accountActivityPage=new AccountActivityPage();
    @Then("The user should be able to see {string} account type as default")
    public void the_user_should_be_able_to_see_account_type_as_default(String expectedAccountType) {

        String actualAccountType = accountActivityPage.getDefaulSelectedtAccountText();
        Assert.assertEquals(expectedAccountType,actualAccountType);
    }
    @Then("The user should be able to see following account types at the drop down manu")
    public void the_user_should_be_able_to_see_following_account_types_at_the_drop_down_manu(List<String> expectedDropDownAccounts) {

        List<String> actualDropDownAccounts = accountActivityPage.getAllAccountTypesFromDropDown();
        Assert.assertEquals(expectedDropDownAccounts,actualDropDownAccounts);

    }
    @Then("The user should be able to see followings Show Transactions table columns")
    public void the_user_should_be_able_to_see_followings_show_transactions_table_columns(List<String> expectedShowTransactuonTableClomns) {

        List<String> actualShowTransactionsClomuns = accountActivityPage.getShowTransactionsClomunsText();
        Assert.assertEquals(expectedShowTransactuonTableClomns,actualShowTransactionsClomuns);
    }

}
