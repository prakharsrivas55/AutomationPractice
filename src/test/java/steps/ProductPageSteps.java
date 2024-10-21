package steps;

import io.cucumber.java.en.Given;
import pages.ProductsPage;

public class ProductPageSteps extends BaseSteps {
    
    ProductsPage productpage= new ProductsPage(driver);

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void Verify_user_is_navigated_to_ALL_PRODUCTS_page_successfully() {
        
        productpage.verify_all_products_text();
    }

    @Given("The products list is visible")
    public void The_products_list_is_visible() {
        
        productpage.verify_all_products_list();
    }

    @Given("Click on {string} of first product")
    public void Click_on_of_first_product(String s) {
        
        productpage.ClickOnFirstProduct();
    }

    @Given("User is landed to product detail page")
    public void User_is_landed_to_product_detail_page() {
        
        productpage.ProductDetailTitleCheck();
    }

    @Given("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void Verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {
        
        productpage.ProductNameCheck();
        productpage.ProductPriceCheck();
        productpage.ProductCategoryCheck();
        productpage.ProductAvailabilityCheck();
        productpage.ProductConditionCheck();
        productpage.ProductBrandCheck();

    }

    @Given("Enter product name in search input and click search button")
    public void Enter_product_name_in_search_input_and_click_search_button() {

        productpage.searchproduct();

    }

    @Given("Verify SEARCHED PRODUCTS is visible")
    public void Verify_SEARCHED_PRODUCTS_is_visible() {
        
        productpage.verify_related_products_list();
        
    }

    @Given("Verify all the products related to search are visible")
    public void Verify_all_the_products_related_to_search_are_visible() {
        
        productpage.VerifySearchedProductsMessage();
    }

    @Given("Hover over first product and click on Add to cart")
    public void Hover_over_first_product_and_click_on_Add_to_cart() {

        productpage.AddFirstProductToCart();
    }

    @Given("Click on Continue Shopping button")
    public void Click_on_Continue_Shopping_button() {

        productpage.ClickOnContinueShoppingBtn();
    }

    @Given("Hover over second product and click on Add to cart")
    public void Hover_over_second_product_and_click_on_Add_to_cart() {
        
        productpage.AddSecondProductToCart();
    }

    @Given("Click on View Cart button")
    public void Click_on_View_Cart_button() {

        productpage.ClickOnViewCartBtn();
    }
    
}
