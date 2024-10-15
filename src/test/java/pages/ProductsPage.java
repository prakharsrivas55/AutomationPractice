package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;

import com.google.common.graph.PredecessorsFunction;

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
}
