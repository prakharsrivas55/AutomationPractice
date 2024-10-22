package Helpers;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;



import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import Helpers.Predefined;

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

    public void explictwaitcondition_elementToBeClickable(WebElement locator, WebDriver rdriver){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    public void clickelement(WebElement ele){

        ele.click();
    }

    public void sendkeyselement(WebElement ele, String value){

        ele.clear();
        ele.sendKeys(value);
    }

    public void multipleSendKeys(List<WebElement> ele, List<String> value){

        for(int i=0;i<ele.size();i++){
            sendkeyselement(ele.get(i), value.get(i));
        } 
    }

    public void scrolldown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public void scrollToFooter(WebElement footerElement) {

        // Use JavaScript to scroll to the footer element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footerElement);
    }

    public void assertions(String ExpectedText,String ActualText){
        
        assertEquals(ExpectedText, ActualText);
    }

    public void actionclass(WebElement ele){

        Actions action= new Actions(driver);
        action.moveToElement(ele).perform(); 
    }

    public void actionarrowup(WebElement ele){

        Actions action= new Actions(driver);
        ele.click();

        action.sendKeys(ele,org.openqa.selenium.Keys.ARROW_UP).perform();
    }

    public void attemptClick(WebElement ele) {
    int attempts = 0;
    boolean clicked = false;

    while (attempts < 3 && !clicked) {
        try {
            clickelement(ele);
            clicked = true;
        } catch (ElementClickInterceptedException e) {
            System.out.println("Click intercepted, retrying...");
            scrolldown();
            attempts++;
        }
    }
}

    private String getElementText(WebElement element) {

        return element.getText().trim();
    }

    public void verifyElementText(Map<WebElement, String> elementsToVerify){

        for(Map.Entry<WebElement,String> entry: elementsToVerify.entrySet()){

            WebElement ele= entry.getKey();
            assertions(entry.getValue(),getElementText(ele));
        }
    }

    public void uploadfile() throws AWTException{

        Robot rb= new Robot();
        rb.delay(2000);

        //Put path to the clipboard
        StringSelection ss= new StringSelection("C:\\Users\\prakharsrivastava\\Desktop\\Dummy.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);  

        //CTRL +V
        rb.keyPress(KeyEvent.VK_CONTROL); // Press on Control Key
        rb.keyPress(KeyEvent.VK_V); // Press on V key

        rb.keyRelease(KeyEvent.VK_CONTROL); // Press on Control Key
        rb.keyRelease(KeyEvent.VK_V); // Press on V key

        // Enter Key
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }    
}
