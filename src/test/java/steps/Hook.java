package steps;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseSteps {

    @Before
    public void setup(Scenario scenario){
        
        System.out.println("------------Scenario :" + scenario.getName()+"----------");

        if(driverStayOpen==false){

            setDriver();

        }
    }

    @After
    public void teardown(Scenario scenario){
        try{
            DateFormat dateFormat= new SimpleDateFormat("yyyyMMddHHmmss");
            Calendar cal = Calendar.getInstance();
		    System.out.println(dateFormat.format(cal.getTime()));
            TakesScreenshot ts= (TakesScreenshot) driver;
            File src= ts.getScreenshotAs(OutputType.FILE);
            File trg= new File("Screenshots");
            String path= trg.getAbsolutePath();
            FileUtils.copyFile(src, new File(path+"//screenshot"+dateFormat.format(cal.getTime())+".png"));

        }
        catch(Exception e){
            System.out.println("YO");
            e.printStackTrace();
            System.err.println(e);
        }
        driver.quit();
        System.out.println("--------------Scenario end--------------");

    }
    
}
