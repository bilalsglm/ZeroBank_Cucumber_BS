package com.zeroBank.stepDefs;

import com.zeroBank.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Home_StepDefs {

    HomePage homePage=new HomePage();

    @Then("The user should be able to see own name: {string} on the home page")
    public void theUserShouldBeAbleToSeeOwnNameOnTheHaoePage(String expectedUsername) {
        String actualUsername = homePage.getUserNameText();
        Assert.assertEquals(expectedUsername,actualUsername);

    }
    @When("The user navigates to {string} tab manu")
    public void the_user_navigates_to_tab_manu(String tabMenu) {
        homePage.navigatesTabMenu(tabMenu);
    }
}
