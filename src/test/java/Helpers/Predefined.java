package Helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

import java.time.Duration;

public class Predefined extends BasePage {

    public Predefined(WebDriver rdriver) {
        super(rdriver);
    }

    public void explictwaitcondition(WebElement locator, WebDriver rdriver){

        WebDriverWait wait= new WebDriverWait(rdriver, Duration.ofSeconds(10));  // Declaration  
        wait.until(ExpectedConditions.visibilityOf(locator));
        // locator.click();
    }

    public void clickelement(WebElement ele){

        ele.click();
    }

    public void sendkeyselement(WebElement ele, String value){

        ele.sendKeys(value);
    }

    public void scrolldown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    


    
}
