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

    @FindBy(css = "[id='Home_Ancillary_3']")
    WebElement pharmacyLink;

    @FindBy(css = "[id='Home_Ancillary_Popover_3-container']")
    WebElement pharmacyOptions;

    @FindBy(css = "[id='Home_Ancillary_4']")
    WebElement serviceLink;

    @FindBy(css = " [id='Home_Ancillary_7']")
    WebElement memberShipLink;

    @FindBy(id = "cart-d")
    WebElement shoppingCart;

    @FindBy(css = "[class='co-cart-rwd']")
    WebElement shoppingCartIcon;

    @FindBy(name = "continue-shopping")
    WebElement continueShoppingBTN;

    @FindBy(linkText = "Appliances")
    WebElement appliancesLink;
    @FindBy(css ="[id='level2']")
    WebElement  applianceOptions;

    @FindBy(linkText = "Food, Household & Pet")
    WebElement  foodLink;

    @FindBy(linkText = "Beauty")
    WebElement   beautyLink;

    @FindBy(linkText = "Skin Care")
    WebElement  skinCare;
    //    Methods
 public void getIntoFood(){
     shopAllDartementMouseHover();
     foodLink.click();
     skinCare.click();
 }

public void beautyLink(){
     shopAllDartementMouseHover();
     beautyLink.click();
}




public List getApplianceOptions(){
    shopAllDartementMouseHover();
    mouseHover(appliancesLink);
    List<String> actual = new ArrayList<>();
    actual = getAllElementOptions(applianceOptions, "a");
    return actual;

}

    public void getIntoAppliance() {
        shopAllDartementMouseHover();
        appliancesLink.click();
    }

    public void shoppingCartIcon() {
        shoppingCartIcon.click();
        continueShoppingBTN.click();
    }

    public void shoppingCart() {
        shoppingCart.click();
        continueShoppingBTN.click();
    }

    public void shopAllDartementMouseHover() {
        mouseHover(shopAllDepartmentsLink);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    public List getAllDepartmentOption() {
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(allDepartmentsOptions, "a");
        return actual;
    }

    public void pharmacyMouseHover() {
        mouseHover(pharmacyLink);
    }

    public List getPharmacyOptions() {
        pharmacyMouseHover();
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(pharmacyOptions, "div");
        return actual;
    }

    public void serviceMouseHover() {
        mouseHover(serviceLink);
    }

    public void renewMemberShip() {
        mouseHover(memberShipLink);
    }
}
