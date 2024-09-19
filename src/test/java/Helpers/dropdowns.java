package Helpers;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

    public void selectOptionFromDropdown(WebElement ele, String value){

        Select drp= new Select(ele);
        List<WebElement> alloptions= drp.getOptions();
        for(WebElement option: alloptions){
            if(option.getText().equals(value)){
                option.click();
            }
        } 
    } 
}
