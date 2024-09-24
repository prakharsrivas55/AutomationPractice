Feature: Start

@Testcase6
Scenario: User fills the Contact Us form
 
    * Navigate to url automationexercise.com
    * Verify that home page is visible successfully
    * Click on 'Contact Us' button
    * Verify GET IN TOUCH is visible
    * Enter name, email, subject and message
    * User upload a file on contact form Page
    * Click Contact Form 'Submit' button
    * Click on OK button
    * Verify success message 'Success! Your details have been submitted successfully.' is visible
    * Click 'Home' button and verify that landed to home page successfully
