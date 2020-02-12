package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Service  extends CommonAPI {

    //Webelements
    @FindBy(css = "[id='Home_Ancillary_4']")
    WebElement   serviceLink;

    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div/div[2]/div/ul/li[4]/a")
    WebElement lifeLink;

    @FindBy(linkText = "Payment Processing")
    WebElement paymentProcessing;

    @FindBy(linkText = "APPLY NOW")
    WebElement  applyNow;

    @FindBy(css = "popover922442")

    WebElement servicesOptions;

//Methods

    public void seriveLink(){

      serviceLink.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void life(){
        seriveLink();
        lifeLink.click();
    }
    public void paymentProcessing(){
        seriveLink();
        paymentProcessing.click();
        applyNow.click();
    }
}
