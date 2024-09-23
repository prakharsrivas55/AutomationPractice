package steps;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import pages.LoginPage;
import pages.RegisterUser;
import io.cucumber.java.en.Given;


public class RegisterUserSteps extends BaseSteps {

    RegisterUser register= new RegisterUser(driver);
    LoginPage login= new LoginPage(driver);

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
        register.singup_login();
    }

    @Given("Verify New User Signup! is visible")
    public void Verify_New_User_Signup_is_visible() {
        
        register.verify_singuptext();
        
    }

    @Given("Enter name and email address")
    public void Enter_name_and_email_address() throws InterruptedException, IOException {

        register.enter_name();
        register.enter_email_address();
    }
    

    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void Verify_that_ENTER_ACCOUNT_INFORMATION_is_visible() {
        
        register.verify_enteremailtext();
    }

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void Fill_details_Title_Name_Email_Password_Date_of_birth() {

        // register.password();
        register.enterinformation();
    }

    @Given("Select checkbox Sign up for our newsletter!")
    public void Select_checkbox_Sign_up_for_our_newsletter() {

        register.checkboxnewsletter_select();     
    }

    @Given("Select checkbox {string}")
    public void Select_checkbox(String s) {

        register.specialoffers();
    }

    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void Address_Details() {
        
        register.addressform();
    }

    @Given("Click on {string}")
    public void Click_on(String s) {
        
        register.clickOnCreateBtn();
    }

    @Given("Verify that ACCOUNT CREATED! is visible")
    public void Verify_that_ACCOUNT_CREATED_is_visible() {
        
        register.VerifyAccountCreated();
    }

    @Given("Click on the {string}")
    public void Click_on_Continue_button(String s) {
        
        register.clickOnContinueBtn();
    }

    @Given("Verify that {string} is visible")
    public void Verify_that_username_visible(String s) {
        
        register.VerifyUsername();
    }

    @Given("Click ON {string} button")
    public void Click_ON_DeleteButton(String s) {
        
        register.Delete_Account();
    }

    @Given("Verify that {string} is visible and click {string} button")
    public void Verify_that_accountisdeleted_and_click_button(String s, String s2) {
        
        register.VerifyAccountDeleted();
        register.clickOnContinueBtn();
    }

    @Given("Enter name and already registered email address")
    public void Enter_name_and_already_registered_email_address() throws InterruptedException, IOException {
        
        register.enter_existing_name();
        register.enter_existing_email();
    }

    @Given("Click on Signup button")
    public void Click_on_Signup_button() {

        register.singupbtn();
    }

    @Given("Verify error Email Address already exist! is visible")
    public void Verify_error_Email_Address_already_exist_is_visible() {
        
        register.ExistingSignupMessgae();
    }
    
}

