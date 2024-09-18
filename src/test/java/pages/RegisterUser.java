package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Random;
import java.io.IOException;

public class RegisterUser extends BasePage {

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
    
        String email = stringBuilder.toString();
        singnup_email_loc.sendKeys(email+"@yopmail.com");
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
}
