package steps;

import java.awt.AWTException;
import java.io.IOException;

import io.cucumber.java.en.Given;
import pages.ContactUsPage;

public class ContactUsSteps extends BaseSteps {

    ContactUsPage contact= new ContactUsPage(driver);
    
    @Given("Click on 'Contact Us' button")
    public void Click_on_Contact_Us_button(){
        
        contact.ClickOnContactUs();
    }

    @Given("Verify GET IN TOUCH is visible")
    public void Verify_GET_IN_TOUCH_is_visible() {
        
        contact.VerifyGetInTouchMessage();
    }

    @Given("Enter name, email, subject and message")
    public void Enter_name_email_subject_and_message() throws AWTException, InterruptedException, IOException {
        
        contact.FillContactUsForm();
    }

    @Given("User upload a file on contact form Page")
    public void User_upload_a_file_on_contact_form_Page() throws AWTException {
        
        contact.UploadDocument();
        contact.AdvertisementScroll();
    }

    @Given("Click Contact Form {string} button")
    public void Click_Contact_Form_button(String s) {
        
        
        contact.ClickOnContactForm_SubmitButton();
    }

    @Given("Click on OK button")
    public void Click_on_OK_button() {
        
        contact.AlertAccept();
    }

    @Given("Verify success message {string} is visible")
    public void Verify_success_message_is_visible(String s) {
        
        contact.VerifyContactForm_SucceseMessage();
    }

    @Given("Click {string} button and verify that landed to home page successfully")
    public void Click_button_and_verify_that_landed_to_home_page_successfully(String s) {
        
        contact.ClickOnContactForm_HomeButton();
    }

}
