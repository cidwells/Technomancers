package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Travel extends CommonAPI {
    @FindBy(css = "[id='Home_Ancillary_6']")
    WebElement travelLink;

    @FindBy(css = "[id='Home_Ancillary_Popover_6-container']")
    WebElement travelOptions;

    @FindBy(css = "[id='hotels-tab-id']")
    WebElement    hotelsLink;

    @FindBy(css = "[id=\"hotelDestination\"]")
    WebElement    hotelDestinationTexBox;

    @FindBy(css = "[id='checkInDateWidget']")
    WebElement     checInkDate;

    @FindBy (css =" [id='checkOutDateWidget']")
    WebElement   checkOutDate;

    @FindBy(xpath = "//button[@class='btn btn-submit hotel-submit']")
    WebElement  findHotelLink;

    //    Methods

    public void travelLink(){
        mouseHover(travelLink);
    }

    public List travelGetAllOptions() {
        mouseHover(travelLink);
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(travelOptions, "div");
        return actual;
    }
    public void findHotel() throws InterruptedException {
        travelLink.click();
        hotelsLink.click();
        hotelDestinationTexBox.sendKeys("11223");
        hotelDestinationTexBox.sendKeys(Keys.ARROW_DOWN);
        hotelDestinationTexBox.sendKeys(Keys.ENTER);
        checInkDate.sendKeys("02/09/2020");
        checkOutDate.sendKeys("02/16/2020");
        findHotelLink.click();
        Thread.sleep(5000);
    }
}