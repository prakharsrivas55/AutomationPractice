package steps;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import pages.RegisterUser;
import io.cucumber.java.en.Given;


public class RegisterUserSteps extends BaseSteps {

    RegisterUser login= new RegisterUser(driver);

    @Given("Navigate to url automationexercise.com")
    public void open_homepage() {
        if (driver == null) {
            setDriver(); 
        }
        driver.get("https://automationexercise.com/");
    }

    @Given("Verify that home page is visible successfully")
    public void verify_homepage(){

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("return document.readyState").toString().equals("complete");
    } 

    @Given("Click on Signup, Login button")
    public void click_on_Signup_login(){
        login.singup_login();
    }

    @Given("Verify New User Signup! is visible")
    public void Verify_New_User_Signup_is_visible() {
        
        login.verify_singuptext();
        
    }

    @Given("Enter name and email address")
    public void Enter_name_and_email_address() throws InterruptedException, IOException {

        login.enter_name();
        login.enter_email_address();
        login.singupbtn();
    }

    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible() {
        
        login.verify_enteremailtext();
    }

}

