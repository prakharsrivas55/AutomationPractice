package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helpers.Predefined;
import Helpers.dropdowns;
import java.util.Random;
import java.io.IOException;

public class RegisterUser extends BasePage {

    private static String email;

    dropdowns drp= new dropdowns();
    Predefined pre= new Predefined(driver);

    public RegisterUser(WebDriver rdriver) {
        super(rdriver);
    }

@FindBy(xpath = "//i[@class='fa fa-lock']")
private WebElement singup_login_btn;

    public void singup_login(){
        
        singup_login_btn.click();
    }

@FindBy(xpath = "//div[@class='signup-form']/h2")
private WebElement singuptext_loc;

    public void verify_singuptext(){
        
        String text= singuptext_loc.getText();
        assertEquals("New User Signup!", text);
    }

@FindBy(xpath = "//input[@data-qa='signup-name']")
private WebElement singnup_name_loc;

    public void enter_name() throws InterruptedException, IOException{
       
        singnup_name_loc.sendKeys("Jon Doe");
    }

@FindBy(xpath = "//input[@data-qa='signup-email']")
private WebElement singnup_email_loc;

    public void enter_email_address() throws InterruptedException, IOException{
    
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            stringBuilder.append(randomChar);
        }
    
        RegisterUser.email = stringBuilder.toString();
        pre.sendkeyselement(singnup_email_loc, email+"@yopmail.com");
    }  

// Getter for email
    public String getEmail() {
        return RegisterUser.email;
    }
    
@FindBy(xpath = "//button[@data-qa='signup-button']")
private WebElement singup_btn;

    public void singupbtn(){
        
        singup_btn.click();
    }

@FindBy(xpath = "(//h2[@class='title text-center']/b)[1]")
private WebElement enteremailtext_loc;

    public void verify_enteremailtext(){
        
        String text= enteremailtext_loc.getText();
        assertEquals("ENTER ACCOUNT INFORMATION", text);
    }

@FindBy(xpath = "//input[@id='id_gender1']")
private WebElement salutation_loc;
@FindBy(xpath = "//select[@id='days']")
private WebElement selectday_loc;
@FindBy(xpath = "//select[@id='months']")
private WebElement selectmonth_loc;
@FindBy(xpath = "//select[@id='years']")
private WebElement selectyear_loc;
@FindBy(xpath = "//input[@id='password']")
private WebElement password_loc;

    public void enterinformation(){
        
        pre.clickelement(salutation_loc);
        pre.sendkeyselement(password_loc, "Password@123");
        drp.selectOptionFromDropdown(selectday_loc,"20");
        drp.selectOptionFromDropdown(selectmonth_loc, "8");
        drp.selectOptionFromDropdown(selectyear_loc, "2000"); 
        
        pre.scrolldown();
    }

@FindBy(xpath = "//input[@id='newsletter']")
private WebElement newletter_loc;

    public void checkboxnewsletter_select(){

        pre.explictwaitcondition(newletter_loc, driver);
        pre.clickelement(newletter_loc);
    }

@FindBy(xpath = "//input[@id='optin']")
private WebElement offercheckbox_loc;

    public void specialoffers(){ 
        
        pre.explictwaitcondition(offercheckbox_loc, driver);
        pre.clickelement(offercheckbox_loc);
    }

@FindBy(xpath = "//input[@id='first_name']")
private WebElement fname_loc;
@FindBy(xpath = "//input[@id='last_name']")
private WebElement lname_loc;
@FindBy(xpath = "//input[@id='company']")
private WebElement company_loc;
@FindBy(xpath = "//input[@id='address1']")
private WebElement address1_loc;
@FindBy(xpath = "//input[@id='address2']")
private WebElement address2_loc;
@FindBy(xpath = "//select[@id='country']")
private WebElement country_loc;
@FindBy(xpath = "//input[@id='state']")
private WebElement state_loc;
@FindBy(xpath = "//input[@id='city']")
private WebElement city_loc;
@FindBy(xpath = "//input[@id='zipcode']")
private WebElement zipcode_loc;
@FindBy(xpath = "//input[@id='mobile_number']")
private WebElement mobno_loc;

    public void addressform(){

        pre.sendkeyselement(fname_loc, "Leo");
        pre.sendkeyselement(lname_loc, "Das");
        
        pre.sendkeyselement(company_loc, "Kingfisher");
        pre.sendkeyselement(address1_loc, "123 Elm St");
        pre.sendkeyselement(address2_loc, "Apt 4B");

        drp.selectOptionFromDropdown(country_loc, "India");
        pre.sendkeyselement(state_loc, "Uttar Pradesh");
        pre.sendkeyselement(city_loc, "Noida");
        
        pre.sendkeyselement(zipcode_loc, "111111");
        pre.sendkeyselement(mobno_loc, "5555555555");

    }

@FindBy(xpath = "//button[@data-qa='create-account']")
private WebElement createaccountbtn_loc;

    public void clickOnCreateBtn(){ 
        
        pre.clickelement(createaccountbtn_loc);
    }

@FindBy(xpath = "//h2[@data-qa='account-created']/b")
private WebElement accountcreated_loc;

    public void VerifyAccountCreated(){ 
        
        String text= accountcreated_loc.getText();
        assertEquals("ACCOUNT CREATED!", text);
    }

@FindBy(xpath = "//a[@data-qa='continue-button']")
private WebElement continuebtn_loc;

    public void clickOnContinueBtn(){ 
        
        pre.clickelement(continuebtn_loc);
    }

@FindBy(xpath = "//ul[@class='nav navbar-nav']/li/a/b")
private WebElement username_loc;

    public void VerifyUsername(){ 
        
        String text= username_loc.getText();
        assertEquals("Jon Doe", text);
    }

@FindBy(xpath = "//i[@class='fa fa-trash-o']")
private WebElement deleteaccount_loc;

    public void Delete_Account(){ 
        
        pre.clickelement(deleteaccount_loc);
    }
    
@FindBy(xpath = "//h2[@data-qa='account-deleted']/b")
private WebElement accountdeleted_loc;

    public void VerifyAccountDeleted(){ 
        
        String text= accountdeleted_loc.getText();
        assertEquals("ACCOUNT DELETED!", text);
    }
}