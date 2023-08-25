package com.zeroBank.stepDefs;

import com.zeroBank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBills_StepDefs {

    PayBillsPage payBillsPage=new PayBillsPage();
    @When("The user sends {int} dollars to the amount box")
    public void the_user_sends_dollars_to_the_amount_box(Integer amount) {
        payBillsPage.fillAmountBox(amount);
    }
    @When("The user sends {string} to the date box")
    public void the_user_sends_to_the_date_box(String date) {
        payBillsPage.fillDateBox(date);
    }
    @When("The user sends {string} date to the description box")
    public void the_user_sends_date_to_the_description_box(String date) {
        payBillsPage.fillDescriptionBox(date);

    }
    @When("The user clicks on Pay button")
    public void the_user_clicks_on_pay_button() {
payBillsPage.clickOnPayButton();

    }
    @Then("The user should be able to see success message: {string}")
    public void the_user_should_be_able_to_see_success_message(String expectedMessage) {
        String actualMessage = payBillsPage.getSuccessMessage();
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @Then("The user should be able to see error message :{string} on amount box")
    public void theUserShouldBeAbleToSeeErrorMessageOnAmountBox(String expectedErrorMessage) {
        String actualErrorMessage = payBillsPage.getErrorMessageOnAnountBox();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Then("The user should be able to verify that the date box ist still empty")
    public void theUserShouldBeAbleToVerifyThatTheDateBoxIstStillEmpty() {
        Assert.assertTrue(payBillsPage.istDateBoxEmpty());
    }
}
