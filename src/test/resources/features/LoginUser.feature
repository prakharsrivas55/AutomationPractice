Feature: Start
@Testcase2
Scenario: Login User with correct email and password
 
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

    * Verify 'Login to your account' is visible
    * Enter correct email address and password
    * Click 'login' button
    * Verify that 'Logged in as username' is visible
    * Click ON 'Delete Account' button
    * Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

@Testcase3
Scenario: Login User with incorrect email and password

    * Navigate to url automationexercise.com
    * Verify that home page is visible successfully
    * Click on Signup, Login button

    * Verify 'Login to your account' is visible
    * Enter incorrect email address and password
    * Click 'login' button
    * Verify error 'Your email or password is incorrect!' is visible

@Testcase4
Scenario: Logout User

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

    * Verify 'Login to your account' is visible
    * Enter correct email address and password
    * Click 'login' button
