package Helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

        ele.sendKeys(value);
    }

    public void scrolldown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
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
