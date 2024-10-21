package steps;

import io.cucumber.java.en.Given;
import pages.CartPage;

public class CartSteps extends BaseSteps {
    
    CartPage cartpage= new CartPage(driver);

    @Given("Verify that product is displayed in cart page with exact quantity")
    public void Verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        
        cartpage.checkProductCount();
        
    }
}
