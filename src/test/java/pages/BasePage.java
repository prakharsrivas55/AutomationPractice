package pages;
import org.openqa.selenium.support.PageFactory;
// import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
public class BasePage {

    WebDriver driver;
    // protected Logger log;

    public BasePage(WebDriver rdriver){
        this.driver= rdriver;
        // this.log= log2;
        PageFactory.initElements(rdriver, this);

    }
    // WebDriverManager.chromedriver().setup();
    // WebDriver driver= new ChromeDriver();
    
}
