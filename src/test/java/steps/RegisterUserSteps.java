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

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void Fill_details_Title_Name_Email_Password_Date_of_birth() {

        login.enterinformation();
    }

    @Given("Select checkbox Sign up for our newsletter!")
    public void Select_checkbox_Sign_up_for_our_newsletter() {

        login.checkboxnewsletter_select();     
    }

    @Given("Select checkbox {string}")
    public void Select_checkbox(String s) {

        login.specialoffers();
    }

    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void Address_Details() {
        
        login.addressform();
    }

    @Given("Click on {string}")
    public void Click_on(String s) {
        
        login.clickOnCreateBtn();
    }

    @Given("Verify that ACCOUNT CREATED! is visible")
    public void Verify_that_ACCOUNT_CREATED_is_visible() {
        
        login.VerifyAccountCreated();
    }

    @Given("Click on the {string}")
    public void Click_on_Continue_button(String s) {
        
        login.clickOnContinueBtn();
    }

    @Given("Verify that {string} is visible")
    public void Verify_that_username_visible(String s) {
        
        login.VerifyUsername();
    }

    @Given("Click ON {string} button")
    public void Click_ON_DeleteButton(String s) {
        
        login.Delete_Account();
    }

    @Given("Verify that {string} is visible and click {string} button")
    public void Verify_that_accountisdeleted_and_click_button(String s, String s2) {
        
        login.VerifyAccountDeleted();
        login.clickOnContinueBtn();
    }
    
}

