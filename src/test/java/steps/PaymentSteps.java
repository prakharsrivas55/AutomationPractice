package steps;

import io.cucumber.java.en.Given;
import pages.PaymentPage;

public class PaymentSteps extends BaseSteps {

    PaymentPage paymentpage= new PaymentPage(driver);

    @Given("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void EnterPaymentDetails(){

        paymentpage.EnterCardDetails();
    }

    @Given("Click on Pay and Confirm Order button")
    public void Click_on_Pay_and_Confirm_Order_button() {
        
        paymentpage.ClickOnPayAndConfirmOrderbutton();
    }

    @Given("Verify success message Your order has been placed successfully!")
    public void Verify_success_message_Your_order_has_been_placed_successfully() {
        
        paymentpage.CheckOrderSuccessMessage();
    }
}
