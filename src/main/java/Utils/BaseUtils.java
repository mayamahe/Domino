package Utils;

import org.openqa.selenium.WebElement;

public class BaseUtils {

    public static void clickOnElement(WebElement element){
    element.click();
    }

    public static void sendValues(WebElement element, String value){
        element.sendKeys(value);
    }

    public static void clear(WebElement element){
        element.clear();
    }

}
