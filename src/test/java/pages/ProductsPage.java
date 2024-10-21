package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helpers.Predefined;

public class ProductsPage extends BasePage {

    Predefined pre = new Predefined(driver);
    HomePage home= new HomePage(driver);

    public ProductsPage(WebDriver rdriver) {
        super(rdriver);
    }
    
@FindBy(xpath = "//h2[@class='title text-center' and text()='All Products']")
private WebElement verifyAllProductText_loc;

    public void verify_all_products_text(){
        
        String Actualmessage= verifyAllProductText_loc.getText();
        pre.assertions("ALL PRODUCTS", Actualmessage);
    }

@FindBy(xpath = "//div[@class='features_items']/div[@class='col-sm-4']")
private List<WebElement> verifyAllProductList_loc;

    public void verify_all_products_list(){

        int productcount=0;

        for (WebElement product : verifyAllProductList_loc) {
            if (product.isDisplayed()) {
                productcount++;
            }
        }
        if(productcount>0){
            System.out.println("Product are visible and count is: "+ productcount);
        }
        else{
            System.out.println("Product are not visible.");
        } 
    }

@FindBy(xpath = "(//ul[@class='nav nav-pills nav-justified'])[1]")
private WebElement firstproductbtn_loc;

    public void ClickOnFirstProduct(){
        
        int attempts=0;
        boolean clicked= false;

        while(attempts<3&!clicked){
            try {
                pre.clickelement(firstproductbtn_loc);
                clicked= true;
            }
            catch (ElementClickInterceptedException e) {

                System.out.println("Click intercepted, retrying...");
                pre.scrolldown();
                attempts++;
            }
        }
    }

    public void ProductDetailTitleCheck(){
        
        String ExpectedTestcaseTitle= "Automation Exercise - Product Details";
        String ActualTestcaseTitle= driver.getTitle();
        assertEquals(ExpectedTestcaseTitle, ActualTestcaseTitle);
    }

@FindBy(xpath = "//div[@class='product-information']/h2")
private WebElement productname_loc;

    public void ProductNameCheck(){

       String ExpectedproductName = home.getFirstProductName();
       String Actualproductname= productname_loc.getText().strip();
       pre.assertions(ExpectedproductName, Actualproductname);

    }

@FindBy(xpath = "//div[@class='product-information']/span/span")
private WebElement productprice_loc;

    public void ProductPriceCheck(){
        
       String ExpectedproductPrice = home.getFirstProductPrice();
       String ActualproductPrice= productprice_loc.getText();
       pre.assertions(ExpectedproductPrice, ActualproductPrice);
    }

@FindBy(xpath = "//div[@class='product-information']/span/span")
private WebElement productcategory_loc;

    public void ProductCategoryCheck(){
        
        productcategory_loc.isDisplayed();
    }

@FindBy(xpath = "//div[@class='product-information']/p[2][contains(., 'In Stock')]")//////////////////
private WebElement productavailability_loc;

    public void ProductAvailabilityCheck(){
        
       String ExpectedProductAvailability = "Availability: In Stock";
       String ActualProductAvailability= productavailability_loc.getText();
       pre.assertions(ExpectedProductAvailability, ActualProductAvailability);
    }   

@FindBy(xpath = "//div[@class='product-information']/p[3][contains(., 'New')]")//////////////////
private WebElement productcondition_loc;

    public void ProductConditionCheck(){
        
       String ExpectedProductCondition = "Condition: New";
       String ActualProductCondition= productcondition_loc.getText();
       pre.assertions(ExpectedProductCondition, ActualProductCondition);
    } 

@FindBy(xpath = "//div[@class='product-information']/p[4][contains(., 'Polo')]")
private WebElement productbrand_loc;
    
    public void ProductBrandCheck(){
            
        String ExpectedProductBrand = "Brand: Polo";
        String ActualProductBrand= productbrand_loc.getText();
        pre.assertions(ExpectedProductBrand, ActualProductBrand);  
    }

@FindBy(xpath = "//input[@id='search_product']")
private WebElement searchbox_loc;
@FindBy(xpath = "//button[@id='submit_search']")
private WebElement searchbutton_loc;
    
    public void searchproduct(){

        pre.sendkeyselement(searchbox_loc, "Jeans");
        pre.clickelement(searchbutton_loc);
    
    } 

@FindBy(xpath = "//h2[@class='title text-center' and contains(text(),'Searched Products')]")
private WebElement SearchProductText_loc;

    public void VerifySearchedProductsMessage(){
        
        String text= SearchProductText_loc.getText();
        assertEquals("SEARCHED PRODUCTS", text);
    }

@FindBy(xpath = "//div[@class='single-products']/div/p")
private List<WebElement> verifyRelatedProductList_loc;

    public void verify_related_products_list(){

        int productcount=0;

        for (WebElement product : verifyRelatedProductList_loc) {
            if (product.getText().toLowerCase().contains("jeans")) {
                productcount++;
            }
        }
        if(productcount>0){
            System.out.println("Product related to search Product are visible and count is: "+ productcount);
        }
        else{
            System.out.println("Product related to searched product are not visible.");
        } 
    }

@FindBy(xpath = "(//div[@class='single-products']/div[@class='productinfo text-center'])[1]")
private WebElement HoverFirstProduct_loc;
@FindBy(xpath = "//div[@class='product-overlay']//a[@data-product-id='1']")
private WebElement AddToCart1_btn;

    public void AddFirstProductToCart(){   

        pre.scrolldown();
        pre.actionclass(HoverFirstProduct_loc);
        pre.explictwaitcondition(AddToCart1_btn, driver);
        pre.clickelement(AddToCart1_btn);
    }

@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
private WebElement ContinueShopping_loc;

    public void ClickOnContinueShoppingBtn(){   

        pre.clickelement(ContinueShopping_loc);
    }

@FindBy(xpath = "(//div[@class='single-products']/div[@class='productinfo text-center'])[2]")
private WebElement HoverSecondProduct_loc;
@FindBy(xpath = "//div[@class='product-overlay']//a[@data-product-id='2']")
private WebElement AddToCart2_btn;

    public void AddSecondProductToCart(){   

        pre.scrolldown();
        pre.actionclass(HoverSecondProduct_loc);
        pre.explictwaitcondition(AddToCart2_btn, driver);
        pre.clickelement(AddToCart2_btn);
    }

@FindBy(xpath = "//p[@class='text-center']/a")
private WebElement ViewCart_btn;

    public void ClickOnViewCartBtn(){   

        pre.clickelement(ViewCart_btn);
    }

@FindBy(xpath = "//input[@id='quantity']")
private WebElement ProductQuantity_loc;

    public void AddQuanity(){   

        for(int i=0;i<3;i++){

            pre.actionarrowup(ProductQuantity_loc);
        }
    }

@FindBy(xpath = "//button[@class='btn btn-default cart']")
private WebElement ProductAddToCart_btn;

    public void ClickOnProductAddToCart(){   

        pre.clickelement(ProductAddToCart_btn);
    }
    

}
