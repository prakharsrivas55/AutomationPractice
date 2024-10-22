Feature: Start

@Testcase14
Scenario: Place Order: Register while Checkout
 
    * Navigate to url automationexercise.com
    * Verify that home page is visible successfully
    * Add products to cart
    * Click on Continue Shopping button
    * Click on Cart button
    * Verify that cart page is displayed
    * Click Proceed To Checkout
    * Click on Register Login button

    * Enter name and email address
    * Click on Signup button
    * Verify that ENTER ACCOUNT INFORMATION is visible
    * Fill details: Title, Name, Email, Password, Date of birth
    * Select checkbox Sign up for our newsletter!
    * Select checkbox 'Receive special offers from our partners!'
    * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * Click on 'Create Account button'
    * Verify that ACCOUNT CREATED! is visible
    * Click on the 'Continue button'
    * Verify that 'Logged in as username' is visible

    * Click on Cart button
    * Click on Proceed To Checkout button

    * Verify Address Details and Review Your Order
    * Enter description in comment text area and click 'Place Order'
    * Enter payment details: Name on Card, Card Number, CVC, Expiration date
    * Click on Pay and Confirm Order button
    * Verify success message Your order has been placed successfully!
    * Click ON 'Delete Account' button
    * Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

   