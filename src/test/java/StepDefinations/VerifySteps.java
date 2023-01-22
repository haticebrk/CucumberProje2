package StepDefinations;

import Pages.FormContent;
import Pages.Order;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySteps {

    FormContent fc = new FormContent();
    Order or = new Order();

    @When("Navigate to Clever")
    public void navigateToClever() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        GWD.getDriver().manage().window().maximize();
    }

    @Then("User should be able to successfully get an account")
    public void userShouldBeAbleToSuccessfullyGetAnAccount() {
        fc.findAndContainsText("ValidationRegister", "created");

    }

    @Then("User Should login successfully")
    public void userShouldLoginSuccessfully() {
        fc.findAndContainsText("validationLogin", "Sign out");


    }

    @Then("Invalid message should be displayed")
    public void invalidMessageShouldBeDisplayed() {
        fc.findAndContainsText("invalidLogin", "error");

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        or.findAndContainsText("validationAddToCart", "successfully");

    }
}
