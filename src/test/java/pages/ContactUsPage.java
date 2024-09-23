package pages;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Helpers.Predefined;

public class ContactUsPage extends BasePage {

    Predefined pre= new Predefined(driver);
    RegisterUser register= new RegisterUser(driver);

    public ContactUsPage(WebDriver rdriver) {
        super(rdriver);
    }

@FindBy(xpath = "(//ul[@class='nav navbar-nav']/li)[8]/a")
private WebElement contact_us_loc;

    public void ClickOnContactUs(){
        
        pre.clickelement(contact_us_loc);
    }

@FindBy(xpath = "//h2[@class='title text-center' and contains(text(),'Get In Touch')]")
private WebElement GetInTouchText_loc;

    public void VerifyGetInTouchMessage(){
        
        String text= GetInTouchText_loc.getText();
        assertEquals("GET IN TOUCH", text);
    }

@FindBy(xpath = "//input[@data-qa='name']")
private WebElement contact_form_name_loc;
@FindBy(xpath = "//input[@data-qa='email']")
private WebElement contact_form_email_loc;
@FindBy(xpath = "//input[@data-qa='subject']")
private WebElement contact_form_subject_loc;  
@FindBy(xpath = "//textarea[@id='message']")
private WebElement contact_form_message_loc;

    public void FillContactUsForm() throws InterruptedException, IOException{

        pre.sendkeyselement(contact_form_name_loc, "Iron Man");
        register.GenerateEmail();
        String emailID= register.getEmail();
        pre.sendkeyselement(contact_form_email_loc, emailID+"@yopmail.com");
        pre.sendkeyselement(contact_form_subject_loc, "This a test Subject");
        pre.sendkeyselement(contact_form_message_loc, "Test Enquiry");

    }

@FindBy(xpath = "//form[@id=\"contact-us-form\"]/div[5]/input")
private WebElement upload_fileBtn_loc;

    public void UploadDocument() throws AWTException{

        pre.sendkeyselement(upload_fileBtn_loc, "C:\\Users\\prakharsrivastava\\Desktop\\Dummy.pdf");
        // upload_fileBtn_loc.sendKeys("C:\\Users\\prakharsrivastava\\Desktop\\Dummy.pdf");
        // pre.clickelement(upload_fileBtn_loc);
        // pre.uploadfile();
    }

@FindBy(xpath = "//input[@data-qa='submit-button']")
private WebElement contact_form_submitbtn_loc;

    public void ClickOnContactForm_SubmitButton(){
        
        // pre.scrolldown();
        pre.clickelement(contact_form_submitbtn_loc);
    }

    public void AlertAccept(){

        driver.switchTo().alert().accept();
    }

    public void AlertDismiss(){

        driver.switchTo().alert().accept();
    }

@FindBy(xpath = "//div[@class='status alert alert-success'] ")
private WebElement contact_form_successmessage_loc;

    public void VerifyContactForm_SucceseMessage(){
        
        String text= contact_form_successmessage_loc.getText();
        assertEquals("Success! Your details have been submitted successfully.", text);
    }

@FindBy(xpath = "//a[@class='btn btn-success']")
private WebElement contact_form_homebtn_loc;
@FindBy(xpath = "//i[@class='fa fa-home']/parent::a ")
private WebElement homepagebtn_loc;

    public void ClickOnContactForm_HomeButton(){
        
        pre.clickelement(contact_form_homebtn_loc);
        String color = homepagebtn_loc.getCssValue("color");
        System.out.println("Link color: " + color);
        if(color.equals("rgba(255, 165, 0, 1)"))
        {
            System.out.println("Landed to home page successfully"); 
        }
        else{
            System.out.println("Not landed to home page."); 
        }
    }

@FindBy(xpath = "//div[@id='aswift_1_host']")
private WebElement advertisement_loc;

    public void AdvertisementScroll(){

        if(advertisement_loc.isDisplayed()){
            pre.scrolldown();
        }
    }

}

