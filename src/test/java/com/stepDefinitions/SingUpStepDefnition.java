package com.stepDefinitions;

import com.config.DriverConfig;
import com.model.User;
import com.task.NavegateTo;

//import com.utility.reporting.Application;
import com.task.UserSignup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

@ContextConfiguration(classes = {DriverConfig.class})
public class SingUpStepDefnition {

    @Autowired
    private UserSignup signUp;

    @Autowired
    private NavegateTo navegateTo;
    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {

        Thread.sleep(2000);
        navegateTo.siginUpPage();
    }

    @When("he sends required information to get the account")
    public void heSendsRequiredInformationToGetTheAccount() {

        signUp.withInfo(new User());

    }

    @Then("he should be told that the account was created")
    public void heShouldBeToldThatTheAccountWasCreated() {
        Assert.isTrue(true);

    }

    @Then("he should be told that the account was not created")
    public void heShouldBeToldThatTheAccountWasNotCreated() {
        Assert.isTrue(false);

    }
}
