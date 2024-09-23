package steps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import pages.RegisterUser;

public class LoginPageSteps extends BaseSteps {

    LoginPage login= new LoginPage(driver);
    RegisterUser register= new RegisterUser(driver);

    @Given("Verify {string} is visible")
    public void Verify_is_visible(String s) {
        
        login.verify_logintext();
    }

    @Given("Click on Logout Button")
    public void Click_on_Logout_Button() {
        
        login.clickOnLogoutbtn();

    }

    @Given("Enter correct email address and password")
    public void Enter_correct_email_address_and_password() throws InterruptedException, IOException {
        
        login.loginemail_address();
        login.loginpassword();
    }

    @Given("Click {string} button")
    public void Click_login_button(String s) {
        
        login.clickOnLoginBtn();
    }

    @Given("Enter incorrect email address and password")
    public void Enter_incorrect_email_address_and_password() throws InterruptedException, IOException {
        
        login.loginemail_address();
        login.loginpassword();
    }

    @Given("Verify error {string} is visible")
    public void Verify_error_is_visible(String s) {
        
        login.LoginVaidationMessgae();
    }
    
}
