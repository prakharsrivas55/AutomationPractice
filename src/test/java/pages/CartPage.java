package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Helpers.Predefined;
import java.util.HashMap;
import java.util.Map;

public class CartPage extends BasePage {
    
    RegisterUser register= new RegisterUser(driver);
    Predefined pre= new Predefined(driver);

    public CartPage(WebDriver rdriver) {
        super(rdriver);
    }
    
@FindBy(xpath = "//td[@class='cart_quantity']/button")
private WebElement ProductCount_loc;
@FindBy(xpath = "//tr[@id='product-1']")
private WebElement CartProduct_loc;

    public void CheckProductAndCount() {
        // Check if the product is present in the cart
        if (CartProduct_loc.isDisplayed()) {
            System.out.println("Product is present on the Cart Page");
        } else {
            System.out.println("Product is not present on the Cart Page");
            return; // Exit if the product is not present
        }

        // Get the quantity and validate
        String count = ProductCount_loc.getText();
        validateProductQuantity(count);
    }

    private void validateProductQuantity(String count) {

        if ("4".equals(count)) { // Use constant on the left for null safety
            System.out.println("Product Quantity is correct: " + count);
        } else {
            System.out.println("Product Quantity is incorrect: " + count);
        }
    }

@FindBy(xpath = "//a[@class='btn btn-default check_out']")
private WebElement ProceesToCheckout_btn;

    public void ClickOnProceedToCheckoutButton() {

        pre.clickelement(ProceesToCheckout_btn);
    }  

@FindBy(xpath = "//p[@class='text-center']/a[@href='/login']")
private WebElement CartRegisterLogin_btn;

    public void ClickOn_Register_Login_OnCartPage() {
        
        pre.clickelement(CartRegisterLogin_btn);
    }

public void CartPageTitleCheck(){
        
        String ExpectedTestcaseTitle= "Automation Exercise - Checkout";
        String ActualTestcaseTitle= driver.getTitle();
        assertEquals(ExpectedTestcaseTitle, ActualTestcaseTitle);
    }

@FindBy(xpath = "//ul[@id='address_delivery']/li[2]")
private WebElement CartFullName_loc;

@FindBy(xpath = "//ul[@id='address_delivery']/li[3]")
private WebElement CartAddresline1_loc;

@FindBy(xpath = "//ul[@id='address_delivery']/li[4]")
private WebElement CartAddresline2_loc;

@FindBy(xpath = "//ul[@id='address_delivery']/li[5]")
private WebElement CartAddresline3_loc;

@FindBy(xpath = "//ul[@id='address_delivery']/li[6]")
private WebElement CartCity_loc;

@FindBy(xpath = "//ul[@id='address_delivery']/li[7]")
private WebElement CartCountry_loc;

@FindBy(xpath = "//ul[@id='address_delivery']/li[8]")
private WebElement CartPhoneNumber_loc;

    public WebElement getFullName() {
        return CartFullName_loc;
    }

    public WebElement getAddressLine1() {
        return CartAddresline1_loc;
    }
    
    public WebElement getAddressLine2() {
        return CartAddresline2_loc;
    }

    public WebElement getAddressLine3() {
        return CartAddresline3_loc;
    }

    public WebElement getStateAndCity() {
        return CartCity_loc;
    }

    public WebElement getCountry() {
        return CartCountry_loc;
    }

    public WebElement getPhoneNumber() {
        return CartPhoneNumber_loc;
    }

    public void verifyAddressDetails(){

        Map<WebElement, String> elementsToVerify= new HashMap<>();
        elementsToVerify.put(getFullName(),"Mr. Leo Das");
        elementsToVerify.put(getAddressLine1(),"Kingfisher");
        elementsToVerify.put(getAddressLine2(),"123 Elm St");
        elementsToVerify.put(getAddressLine3(),"Apt 4B");
        elementsToVerify.put(getStateAndCity(),"Noida Uttar Pradesh 111111");
        elementsToVerify.put(getCountry(),"India");
        elementsToVerify.put(getPhoneNumber(),"5555555555");

        pre.verifyElementText(elementsToVerify);
    }

@FindBy(xpath = "//textarea[@class='form-control']")
private WebElement CommentBox_loc;
    
    public void EnterCartDescription(){

        pre.sendkeyselement(CommentBox_loc,"Testing");
    }

@FindBy(xpath = "//a[@class='btn btn-default check_out']")
private WebElement PlaceOrder_btn;
    
    public void ClickOnPlaceOrder(){

        pre.clickelement(PlaceOrder_btn);
    }
}
