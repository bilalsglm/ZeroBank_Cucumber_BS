package com.zeroBank.stepDefs;

import com.zeroBank.pages.OnlineBankingPage;
import io.cucumber.java.en.When;

public class OnlineBanking_StepDefs {

    OnlineBankingPage onlineBankingPage=new OnlineBankingPage();
    @When("The user navigates to {string} section")
    public void the_user_navigates_to_section(String sectionName) {
        onlineBankingPage.navigatesBankingSections(sectionName);
    }
}
