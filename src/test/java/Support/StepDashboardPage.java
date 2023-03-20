package Support;

import Locators.LoginLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDashboardPage extends PageObject {
    LoginLocators loginLocators = new LoginLocators();
    @Step("Login successfully")
    public void verify_login(){
        String dashboardtitle = $(By.xpath(loginLocators.lproducts)).getText();
        Assert.assertEquals("PRODUCTS",dashboardtitle);
    }
}
