package steps;

import io.cucumber.java.en.Given;
import pages.CartPage;

public class CartSteps extends BaseSteps {
    
    CartPage cartpage= new CartPage(driver);

    @Given("Verify that product is displayed in cart page with exact quantity")
    public void Verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        
        cartpage.CheckProductAndCount();
        
    }

    @Given("Click on Proceed To Checkout button")
    public void Click_on_Proceed_To_Checkout_button() {
        
        cartpage.ClickOnProceedToCheckoutButton();
    }

    @Given("Click Proceed To Checkout")
    public void Click_Proceed_To_Checkout() {
        
        cartpage.ClickOnProceedToCheckoutButton();
    }

    @Given("Click on Register Login button")
    public void Click_on_Register_Login_button() {
        
        cartpage.ClickOn_Register_Login_OnCartPage();
    }

    @Given("Verify that cart page is displayed")
    public void Verify_that_cart_page_is_displayed() {
        
        cartpage.CartPageTitleCheck();
    }

    @Given("Verify Address Details and Review Your Order")
    public void Verify_Address_Details_and_Review_Your_Order() {
        
        cartpage.verifyAddressDetails();
    }

    @Given("Enter description in comment text area and click {string}")
    public void Enter_description_in_comment_text_area_and_click(String s) {

        cartpage.EnterCartDescription();
        cartpage.ClickOnPlaceOrder();
    }

    @Given("Click {string} button corresponding to particular product")
    public void Click_button_corresponding_to_particular_product(String s) throws InterruptedException {
        
        cartpage.ClickOnRemoveButton();
    }

    @Given("Verify that product is removed from the cart")
    public void Verify_that_product_is_removed_from_the_cart() throws InterruptedException {
        
        cartpage.ProductRemovedCheck();
    }
}
