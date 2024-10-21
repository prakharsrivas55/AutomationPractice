Feature: Start

@Testcase13
Scenario: Verify Product quantity in Cart
 
    * Navigate to url automationexercise.com
    * Verify that home page is visible successfully
    * Click on 'View Product' of first product
    * User is landed to product detail page
    * Increase quantity to 4
    * Click on Add to cart button
    * Click on View Cart button
    * Verify that product is displayed in cart page with exact quantity
