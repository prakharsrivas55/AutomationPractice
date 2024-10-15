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
}
