package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShopAllDepartment extends CommonAPI {

    //WebElemnts
    @FindBy(id = "navigation-dropdown")
    WebElement shopAllDepartmentsLink;

    @FindBy(css = "[id='level1']")
    WebElement allDepartmentsOptions;

    @FindBy(css="[id='Home_Ancillary_3']")
    WebElement pharmacyLink;

    @FindBy(css="[id='Home_Ancillary_Popover_3-container']")
    WebElement  pharmacyOptions;

    @FindBy(css = "[id='Home_Ancillary_4']")
    WebElement    serviceLink;




    //    Methods
    public void shopAllDartementMouseHover() {
        mouseHover(shopAllDepartmentsLink);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    public List getAllDepartmentOption() {
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(allDepartmentsOptions, "a");
        return actual;
    }

    public void pharmacyMouseHover(){
        mouseHover(pharmacyLink);
    }

    public List getPharmacyOptions(){
        pharmacyMouseHover();
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(pharmacyOptions, "div");
        return actual;
    }
    public void serviceMouseHover(){
        mouseHover(serviceLink);
    }


    }
