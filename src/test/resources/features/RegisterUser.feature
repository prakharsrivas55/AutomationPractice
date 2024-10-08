Feature: Start

@Testcase1
Scenario: Opening the browser

    * Navigate to url automationexercise.com
    * Verify that home page is visible successfully
    * Click on Signup, Login button
    * Verify New User Signup! is visible
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
    * Click ON 'Delete Account' button
    * Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

@Testcase5
Scenario: Register User with existing email

    * Navigate to url automationexercise.com
    * Verify that home page is visible successfully
    * Click on Signup, Login button
    * Verify New User Signup! is visible

    * Enter name and email address
    * Click on Signup button
    * Fill details: Title, Name, Email, Password, Date of birth
    * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * Click on 'Create Account button'
    * Verify that ACCOUNT CREATED! is visible
    * Click on the 'Continue button'
    * Click on Logout Button

    * Enter name and already registered email address
    * Click on Signup button
    * Verify error Email Address already exist! is visible





