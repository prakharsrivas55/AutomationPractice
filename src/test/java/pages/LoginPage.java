package pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helpers.Predefined;

public class LoginPage extends BasePage {

    RegisterUser register= new RegisterUser(driver);
    Predefined pre= new Predefined(driver);

    public LoginPage(WebDriver rdriver) {   
        super(rdriver);
    }

@FindBy(xpath = "//div[@class='login-form']/h2")
private WebElement logintext_loc;

    public void verify_logintext(){
        
        String text= logintext_loc.getText();
        assertEquals("Login to your account", text);
    }

@FindBy(xpath = "//i[@class='fa fa-lock']")
private WebElement logout_loc;

public void clickOnLogoutbtn(){
        
    pre.clickelement(logout_loc);

}

@FindBy(xpath = "//input[@data-qa='login-email']")
private WebElement login_email_loc;

    public void loginemail_address() throws InterruptedException, IOException{
        
        // register.enter_email_address();
        String emailID= register.getEmail();
        pre.sendkeyselement(login_email_loc, emailID+"@yopmail.com");
    }
    

@FindBy(xpath = "//input[@data-qa='login-password']")
private WebElement loginpassword_loc;

    public void loginpassword(){
        
        pre.sendkeyselement(loginpassword_loc, "Password@123");
    }

@FindBy(xpath = "//div[@class='login-form']/form/p")
private WebElement login_validation_popup_loc;

    public void LoginVaidationMessgae(){
        
        String text= login_validation_popup_loc.getText();
        assertEquals("Your email or password is incorrect!", text);
    }
 
@FindBy(xpath = "//button[@data-qa='login-button']")
private WebElement loginbtn_loc;

    public void clickOnLoginBtn(){
        
        pre.clickelement(loginbtn_loc);
    }
    
}
