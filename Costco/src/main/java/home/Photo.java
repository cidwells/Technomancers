package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Photo extends CommonAPI {


    //WebElements
    @FindBy(css = "[id='Home_Ancillary_5']")
    WebElement photoLink;
    @FindBy(css = "[id='NavUploadButton']")
    WebElement photoUpload;

    @FindBy(css = "[class='sixteen columns main']")
    WebElement navigationBarLinks;

    @FindBy(xpath = "//*[@id=\"ctl00_NavCalendars\"]")
    WebElement calendars;

    @FindBy(xpath = "//*[@id=\"ctl00_NavImageGalleries\"]")
    WebElement walDecor;

    @FindBy(xpath = "[id='ctl00_ctl00_ContentPlaceHolder_txtSearchPhrase']")
    WebElement decorSearchField;

    @FindBy(xpath = " //*[@id=\"ctl00_NavCanvasPrints\"]")
    WebElement metal;

    @FindBy(linkText = "Back to Costco.com")
    WebElement backToCostcoLink;

    @FindBy(linkText = "Contact Us")
    WebElement contactUsLink;

    @FindBy(linkText = "Help")
    WebElement helpLink;

    @FindBy(xpath = "//*[@id=\"ctl00_NavShopAll\"]")
    WebElement photoGiftLink;

    public void photoGiftLink() {
        photo();
        photoGiftLink.click();
    }

    public void getText() {
        photo();
        System.out.println(helpLink);
    }
    public void giftHover(){
        photo();
        mouseHover(photoGiftLink);
    }


    public void getHelp() {
        photo();
        helpLink.click();
    }

    public void contactUS() {
        photo();
        contactUsLink.click();

    }

    public void backToCostco() {
        photo();
        backToCostcoLink.click();
    }


    public void photoPrice() {
        photo();
        metal.click();
    }

    public void decor() {
        photo();
        walDecor.click();
        decorSearchField.sendKeys("decor", Keys.ENTER);
    }

    public void calendars() {
        photo();
        calendars.click();
    }

    public void photo() {
        photoLink.click();
    }

    public void photoUpload() {
        photo();
        photoUpload.click();
    }

    public List getNavigationBarOption() {
        photoLink.click();
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(navigationBarLinks, "div");
        return actual;
    }
}