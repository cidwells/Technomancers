package home;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{
    @FindBy(name = "&lpos=sitenavdefault&lid=sitenav_main-logo")
    private WebElement logo;

    public boolean validateEspnCricInfoLogo(){
        return logo.isDisplayed();
    }
    public static boolean validatingURL(WebDriver driver,String expURL){
    boolean result = false;
    if (driver.getCurrentUrl().equalsIgnoreCase(expURL)){
        return result = true;
    }
        return result;
    }

    }



