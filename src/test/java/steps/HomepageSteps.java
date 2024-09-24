package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomepageSteps extends BaseSteps {
    
    HomePage home= new HomePage(driver);

    @Given("Click on the Test Cases button")
    public void Click_on_the_Test_Cases_button() {
        
        home.ClickOnFirstTestButton();
    }

    @Given("Verify user is navigated to test cases page successfully")
    public void Verify_user_is_navigated_to_test_cases_page_successfully() {
         
        home.TestCaseTitleCheck();
    }

}
