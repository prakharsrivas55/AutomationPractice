Feature: Start

@Testcase16
Scenario: Place Order: Login before Checkout

    * Navigate to url automationexercise.com
    * Verify that home page is visible successfully
    * Click on Signup, Login button

    * Enter name and email address
    * Click on Signup button
    * Fill details: Title, Name, Email, Password, Date of birth
    * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * Click on 'Create Account button'
    * Click on the 'Continue button'
    * Click on Logout Button
    * Enter correct email address and password
    * Click 'login' button
    * Verify that 'Logged in as username' is visible

    * Add products to cart
    * Click on Continue Shopping button
    * Click on Cart button
    * Verify that cart page is displayed
    * Click on Proceed To Checkout button
    * Verify Address Details and Review Your Order
    * Enter description in comment text area and click 'Place Order'
    * Enter payment details: Name on Card, Card Number, CVC, Expiration date
    * Click on Pay and Confirm Order button
    * Verify success message Your order has been placed successfully!
    * Click ON 'Delete Account' button
    * Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
