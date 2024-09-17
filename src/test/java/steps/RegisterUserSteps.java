package steps;
import io.cucumber.java.en.Given;

public class RegisterUserSteps extends BaseSteps {

    @Given("User open the Automation Exercise website")
    public void open_homepage() {
        if (driver == null) {
            setDriver(); 
        }
        driver.get("https://automationexercise.com/");
    }
}

