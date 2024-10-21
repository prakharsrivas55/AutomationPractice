package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Helpers.Predefined;

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
}
