package StepDefinitions;

import Locators.LoginLocators;
import Support.StepLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginPageDefinitions {

    @Steps
    StepLoginPage loginPage;

    @Steps
    LoginLocators loginLocators;

    @Given("User is on home page")
    public void user_is_on_home_page() {
        loginPage.open();
        System.out.println("page is opened");
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String userName) {
        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String passWord) {
        loginPage.inputPassWord(passWord);
    }

    @Then("He should be able to login successfully")
    public void he_should_be_able_to_login_successfully() {
        loginPage.clicklogin();
    }

    @Then("He should be able to see error message {string} and {string}")
    public void he_should_be_able_to_see_error_message_and(String userName, String passWord) {
        loginLocators.sleep_time();
        loginPage.errors(userName,passWord);
    }
}
