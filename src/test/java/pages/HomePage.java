package pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helpers.Predefined;

public class HomePage extends BasePage {
    
    RegisterUser register= new RegisterUser(driver);
    Predefined pre= new Predefined(driver);

    public HomePage(WebDriver rdriver) {
        super(rdriver);
    }

@FindBy(xpath = "(//button[@class='btn btn-success' and contains(text(),'Test Cases')])[1]")
private WebElement tetscasebtn1_loc;

    public void ClickOnFirstTestButton(){
        
        pre.explictwaitcondition(tetscasebtn1_loc, driver);
        pre.clickelement(tetscasebtn1_loc);
    }

    public void TestCaseTitleCheck(){
        
        String ExpectedTestcaseTitle= "Automation Practice Website for UI Testing - Test Cases";
        String ActualTestcaseTitle= driver.getTitle();
        assertEquals(ExpectedTestcaseTitle, ActualTestcaseTitle);
    }
}
