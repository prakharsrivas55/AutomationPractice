// package steps;

// import java.time.Duration;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class BaseSteps {

//     public static WebDriver driver;
//     public static Boolean driverStayOpen=false;
    
//     public void setDriver(){

//         try{
//         // WebDriverManager.chromedriver().setup();
//         WebDriverManager.chromedriver().driverVersion("131.0.6778.204").setup();
//         driver= new ChromeDriver();

//         }
//         catch(Exception e){
//             System.out.println("YUIHIGU");
//             e.printStackTrace();
//         }
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//     }
// }


package steps;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSteps {

    public static WebDriver driver;
    public static Boolean driverStayOpen = false;
    
    public void setDriver() {

        // Setup WebDriverManager for ChromeDriver
        // WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().driverVersion("131.0.6778.204").setup();

        // Create ChromeOptions object to pass desired capabilities
        ChromeOptions options = new ChromeOptions();

        // Add argument for headless mode
        options.addArguments("--headless"); // Enable headless mode
        options.addArguments("--no-sandbox"); // Necessary for running in certain environments (e.g., Docker)
        options.addArguments("--disable-dev-shm-usage"); // Fixes issues on certain machines (like CI/CD systems)
        options.addArguments("--disable-setuid-sandbox");
        System.out.println("hello");

        // Initialize the WebDriver with ChromeOptions
        driver = new ChromeDriver(options);
        System.out.println("Testing="+ driver);

        // Set timeouts
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
}


