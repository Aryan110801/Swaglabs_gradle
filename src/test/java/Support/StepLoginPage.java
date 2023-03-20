package Support;

import Locators.LoginLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepLoginPage extends PageObject {

        StepDashboardPage dashboardPage = new StepDashboardPage();
        LoginLocators loginLocators = new LoginLocators();

        @Step("Enter username")
        public void inputUserName(String userName){
            $(By.xpath(loginLocators.lusername)).sendKeys(userName);
        }

        @Step("Enter password")
        public void inputPassWord(String passWord){
            $(By.xpath(loginLocators.lpassword)).sendKeys(passWord);
        }

        @Step("Click on login button")
        public void clicklogin(){
            $(By.xpath(loginLocators.llogin)).click();
        }


        @Step("False credentials")
        public void errors(String userName, String passWord){
            if (userName==null && passWord=="secret_sauce"){
               String user = $(By.xpath(loginLocators.lblank_username)).getText();
                Assert.assertEquals("Epic sadface: Username is required",user);
            }
            else if (userName=="standard_user" && passWord==null){
                String user = $(By.xpath(loginLocators.lblank_password)).getText();
                Assert.assertEquals("Epic sadface: Password is required",user);
            }
            else if (userName==null && passWord==null){
                String user = $(By.xpath(loginLocators.lboth_blank)).getText();
                Assert.assertEquals("Epic sadface: Username is required",user);
            }
            else if (userName=="standard_user" && passWord=="aryan123"){
                String user = $(By.xpath(loginLocators.lcuwp)).getText();
                Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",user);
            } else if (userName=="aryan123" && passWord=="secret_sauce") {
                String user = $(By.xpath(loginLocators.lwucp)).getText();
                Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",user);
            } else if (userName=="aryan7308" && passWord=="aryan110801") {
                String user = $(By.xpath(loginLocators.lboth_wrong)).getText();
                Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",user);
            } else if (userName=="standard_user" && passWord=="secret_sauce") {
                dashboardPage.verify_login();
            }
        }
        }

