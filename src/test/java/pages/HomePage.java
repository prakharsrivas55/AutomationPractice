package pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helpers.Predefined;

public class HomePage extends BasePage {
    
    RegisterUser register= new RegisterUser(driver);
    Predefined pre= new Predefined(driver);

    private static String FirstProductName;
    private static String FirstProductPrice;
    private static String FirstProductCategory;

    public HomePage(WebDriver rdriver) {
        super(rdriver);
    }

@FindBy(xpath = "(//button[@class='btn btn-success' and contains(text(),'Test Cases')])[1]")
private WebElement tetscasebtn1_loc;

    public void ClickOnFirstTestButton(){
        
        pre.explictwaitcondition(tetscasebtn1_loc, driver);
        pre.clickelement(tetscasebtn1_loc);
    }

    public void TestCaseTitleCheck(){
        
        String ExpectedTestcaseTitle= "Automation Practice Website for UI Testing - Test Cases";
        String ActualTestcaseTitle= driver.getTitle();
        assertEquals(ExpectedTestcaseTitle, ActualTestcaseTitle);
    }

@FindBy(xpath = "//i[@class='material-icons card_travel']")
private WebElement productbtn_loc;

    public void ClickOnProductstButton(){
        
        pre.clickelement(productbtn_loc);
    }

@FindBy(xpath = "(//div[@class='productinfo text-center']/p)[1]")
private WebElement firstproductname_loc;

    public void productname(){
        
        HomePage.FirstProductName= firstproductname_loc.getText().strip();
        }

    public String getFirstProductName(){

        return HomePage.FirstProductName;
    }

@FindBy(xpath = "(//div[@class='productinfo text-center']/h2)[1]")
private WebElement firstproductprice_loc;

    public void productprice(){
        
        HomePage.FirstProductPrice= firstproductprice_loc.getText().strip();
        System.out.println(HomePage.FirstProductPrice);
        }

    public String getFirstProductPrice(){

        return HomePage.FirstProductPrice;
    }

@FindBy(xpath = "(//div[@class='productinfo text-center']/p)[1]")
private WebElement firstproductcategory_loc;

    public void productcatageory(){
        
        HomePage.FirstProductCategory= firstproductcategory_loc.getText();
        }

    public String getFirstProductCategory(){

        return HomePage.FirstProductCategory;
    }

@FindBy(xpath = "//footer[@id='footer']")
private WebElement footer_loc;

    public void scrollToFooter(){

        pre.scrollToFooter(footer_loc);
    }

@FindBy(xpath = "//div[@class='single-widget']/h2")
private WebElement verifySubscriptionText_loc;

    public void verifySubscriptionText(){
        
        String Actualmessage= verifySubscriptionText_loc.getText();
        pre.assertions("SUBSCRIPTION", Actualmessage);
    }

@FindBy(xpath = "//input[@id='susbscribe_email']")
private WebElement subsciptionEmail_loc;
@FindBy(xpath = "//button[@id='subscribe']")
private WebElement subsciptionClick_loc;

    public void enterSubscriptionEmail(){
        
        pre.sendkeyselement(subsciptionEmail_loc, "test1@yopmail.com");
        pre.clickelement(subsciptionClick_loc);
    }

@FindBy(xpath = "//div[@class='alert-success alert']")
private WebElement successfullySubscribeMessage_loc;

    public void verifySubscriptionMessage(){
        
        String Actualmessage= successfullySubscribeMessage_loc.getText();
        pre.assertions("You have been successfully subscribed!", Actualmessage);
    }

@FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
private WebElement cartbtn_loc;

    public void ClickOnCartButton(){
        
        pre.clickelement(cartbtn_loc);
    }

}
