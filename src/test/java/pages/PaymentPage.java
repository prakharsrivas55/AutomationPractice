package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helpers.Predefined;

public class PaymentPage extends BasePage {
    
    Predefined pre = new Predefined(driver);

    public PaymentPage(WebDriver rdriver) {
        super(rdriver);
        //TODO Auto-generated constructor stub
    }

@FindBy(xpath = "//input[@class='form-control']")
private WebElement CardholderName_loc;

@FindBy(xpath = "//input[@class='form-control card-number']")
private WebElement CardNumber_loc;

@FindBy(xpath = "//input[@class='form-control card-cvc']")
private WebElement CardholderCVC_loc;

@FindBy(xpath = "//input[@class='form-control card-expiry-month']")
private WebElement CardExpiryMonth_loc;

@FindBy(xpath = "//input[@class='form-control card-expiry-year']")
private WebElement CardrExpiryYear_loc;

    public void EnterCardDetails(){
        
      pre.sendkeyselement(CardholderName_loc, "Test Card");
      pre.sendkeyselement(CardNumber_loc, "101010101010");
      pre.sendkeyselement(CardholderCVC_loc, "100");
      pre.sendkeyselement(CardExpiryMonth_loc, "10");
      pre.sendkeyselement(CardrExpiryYear_loc, "2030");
      

    }

@FindBy(xpath = "//button[@id='submit']")
private WebElement PayAndConfirm_btn;

    public void ClickOnPayAndConfirmOrderbutton(){

        pre.scrolldown();
        pre.clickelement(PayAndConfirm_btn);
    }

// @FindBy(xpath = "//div[@id='success_message']/div[@class='alert-success alert']")
@FindBy(xpath = "//div[@class='col-sm-9 col-sm-offset-1']/p")
private WebElement OrderCompletedMesage_loc;

    public void CheckOrderSuccessMessage(){

        // pre.explictwaitcondition(OrderCompletedMesage_loc, driver);
        pre.assertions("Congratulations! Your order has been confirmed!", OrderCompletedMesage_loc.getText());
    }
}
