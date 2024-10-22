package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomepageSteps extends BaseSteps {
    
    HomePage home= new HomePage(driver);

    @Given("Click on the Test Cases button")
    public void Click_on_the_Test_Cases_button() {
        
        home.ClickOnFirstTestButton();
    }

    @Given("Verify user is navigated to test cases page successfully")
    public void Verify_user_is_navigated_to_test_cases_page_successfully() {
         
        home.TestCaseTitleCheck();
    }

    @Given("Click on Products button")
    public void Click_on_Products_button() {
        
        home.ClickOnProductstButton();
    }

    @Given("Get details of the products")
    public void Get_Details_Of_The_Products() {
        
        home.productname();
        home.productprice();
        home.productcatageory();
        
    }

    @Given("Scroll down to footer")
    public void Scroll_down_to_footer() {

        home.scrollToFooter();
    }

    @Given("Verify text {string}")
    public void Verify_text(String s) {
        
        home.verifySubscriptionText();
    }

    @Given("Enter email address in input and click arrow button")
    public void Enter_email_address_in_input_and_click_arrow_button() {
        
        home.enterSubscriptionEmail();
    }

    @Given("Verify success message You have been successfully subscribed! is visible")
    public void Verify_success_message_You_have_been_successfully_subscribed_is_visible() {
        
        home.verifySubscriptionMessage();
    }

    @Given("Click on Cart button")
    public void Click_on_Cart_button() {
        
        home.ClickOnCartButton();
    }

    @Given("Add products to cart")
    public void Add_products_to_cart() throws InterruptedException {
        
        Thread.sleep(3000);
        home.ClickOnHomeAddToCartButton();
    }
}
