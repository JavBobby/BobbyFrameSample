package com.facebook.step_definitions;

import com.facebook.pages.LoginPage;
import com.facebook.utilities.ConfigurationReader;
import com.facebook.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters an invalid username as {string}")
    public void user_enters_an_invalid_username_as(String string) {
        loginPage.royalEmail.sendKeys(string);
    }

    @When("User enters an invalid password as {string}")
    public void user_enters_an_invalid_password_as(String string) {
        loginPage.passContainer.sendKeys(string);
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.royalLoginButton.click();
    }

    @Then("User sees an error message as {string}")
    public void user_sees_an_error_message_as(String string) {
        Assert.assertTrue(loginPage.element.getText().contains(string));
    }

}
