package Locators;

public class LoginLocators {
    public final String lusername = "//input[@id='user-name']";
    public final String lproducts = "//span[@class='title']";
    public final String lpassword = "//input[@id='password']";
    public final String llogin = "//input[@id='login-button']";
    public final String lblank_password = "//h3[@data-test='error']";
    public final String lblank_username = "//h3[@data-test='error']";
    public final String lboth_blank = "//h3[@data-test='error']";
    public final String lcuwp = "//h3[@data-test='error']";
    public final String lwucp = "//h3[@data-test='error']";
    public final String lboth_wrong = "//h3[@data-test='error']";

    public void sleep_time(){
        try {
            Thread.sleep(3000);
        }  catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
