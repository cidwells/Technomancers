package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Travel extends CommonAPI {
    @FindBy(css = "[id='Home_Ancillary_6']")
    WebElement travelLink;

    @FindBy(css = "[id='Home_Ancillary_Popover_6-container']")
    WebElement travelOptions;

    @FindBy(css = "[id='hotels-tab-id']")
    WebElement hotelsLink;

    @FindBy(css = "[id=\"hotelDestination\"]")
    WebElement hotelDestinationTexBox;

    @FindBy(css = "[id='checkInDateWidget']")
    WebElement checInkDate;

    @FindBy(css = " [id='checkOutDateWidget']")
    WebElement checkOutDate;

    @FindBy(xpath = "//button[@class='btn btn-submit hotel-submit']")
    WebElement findHotelLink;

    @FindBy(css = "[id='cruises-tab-id']")
    WebElement cruisesLink;

    @FindBy(css = "[id='cruiseOnlySearch']")
    WebElement allCruisesradioBtn;

    @FindBy(css = "[id='cruiseDestination']")
    WebElement cruiseDestinationDropDown;

    @FindBy(css = "[id='departureDate']")
    WebElement cruiseDepartureDropDown;

    @FindBy(css = "[id='cruiseLine']")
    WebElement cruiseLineDropDown;

    @FindBy(css = "[id='cruiseLength']")
    WebElement durationDropDown;

    @FindBy(css = "[id='vacation-packages-tab-id']")
    WebElement vacationPackage;

    @FindBy(css = "[id='vacation_package_destination']")
    WebElement vacationPackageDEstination;

    @FindBy(css = " [id='region']")
    WebElement cityRegion;

    @FindBy(css = "[id='rental-cars-tab-id']")
    WebElement rentalCarLink;

    @FindBy(css = "[id='dropoffTimeWidget']")
    WebElement timeOption;

    @FindBy(css = "[id='Home_Ancillary_4']")
    WebElement services;

    @FindBy(css = "[id='button_Home_Ancillary_4_id']")
    WebElement servicesList;

    @FindBy(css = " [id='nav_theme_parks']")
    WebElement themeParks;

    @FindBy(css = "[id='online_help']")
    WebElement helpCenter;

    @FindBy(css="[class='row fourths gutter-xwide']")
    WebElement  allOptions;

    @FindBy(css = "[class='logo']")
    WebElement  travelLogo;

    public void travelLogo(){
        travelLink.click();
        travelLogo.click();

    }


    //    Methods
    public List lionWorldTravel() {
        travelLink.click();
       mouseHover(themeParks);
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(allOptions, "div");
        return actual;
    }

    public void helpCenter() {
        travelLink.click();
        helpCenter.click();
    }

    public void themeParks() {
        travelLink.click();
        mouseHover(themeParks);
    }

    public void services() {
        mouseHover(services);
    }

    public void packageDestinationOptions() {
        travelLink.click();
        vacationPackage.click();
        Select dropDown = new Select(vacationPackageDEstination);
        List<WebElement> e = dropDown.getOptions();
        int itemCount = e.size();

        for (int l = 0; l < itemCount; l++) {
            System.out.println(e.get(l).getText());
        }
    }

    public void vacationPackage() {
        travelLink.click();
        vacationPackage.click();
    }

    public void travelLink() {
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        hotelDestinationTexBox.sendKeys("11223");

        List<WebElement> autoSuggest = driver.findElements(By.className("ada-screenreader"));
        Thread.sleep(3000);
        // print the auto suggest
        for (WebElement a : autoSuggest) {
            System.out.println("Values are = " + a.getText());
            if (a.getText().equalsIgnoreCase("11223")) ;
            a.click();
            Thread.sleep(3000);
            break;
        }

        checInkDate.sendKeys("02/09/2020");
        checkOutDate.sendKeys("02/16/2020");
        findHotelLink.click();
        String actualULR = driver.getCurrentUrl();
        String expectedURL = "https://www.costcotravel.com/h=3501";
        Assert.assertEquals(actualULR, expectedURL);
    }

    public void findCruise() throws InterruptedException {
        travelLink.click();
        cruisesLink.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select dropDown = new Select(cruiseDestinationDropDown);
        dropDown.selectByIndex(01);
        cruiseDepartureDropDown.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select dropDown1 = new Select(cruiseDepartureDropDown);
        dropDown1.selectByIndex(03);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        cruiseLineDropDown.click();
        Select dropDown2 = new Select(cruiseLineDropDown);
        dropDown1.selectByIndex(1);
        Thread.sleep(5000);

    }

    public void findCruiseLineOptions() {
        travelLink.click();
        cruisesLink.click();
        cruiseLineDropDown.click();
        Select dropDown = new Select(cruiseLineDropDown);
        List<WebElement> e = dropDown.getOptions();
        int itemCount = e.size();

        for (int l = 0; l < itemCount; l++) {
            System.out.println(e.get(l).getText());
        }
    }

    public void findCruiseDepartureOptions() {
        travelLink.click();
        cruisesLink.click();
        cruiseDepartureDropDown.click();
        Select dropDown = new Select(cruiseDepartureDropDown);
        List<WebElement> e = dropDown.getOptions();
        int itemCount = e.size();

        for (int l = 0; l < itemCount; l++) {
            System.out.println(e.get(l).getText());
        }
    }

    public void findCruiseDurationOptions() {
        travelLink.click();
        cruisesLink.click();
        durationDropDown.click();
        Select dropDown = new Select(durationDropDown);
        List<WebElement> e = dropDown.getOptions();
        int itemCount = e.size();

        for (int l = 0; l < itemCount; l++) {
            System.out.println(e.get(l).getText());
        }

    }

    public void rentalCar() {
        travelLink.click();
        rentalCarLink.click();
    }

    public void rentalCarTime() {
        travelLink.click();
        rentalCarLink.click();
        timeOption.click();
        Select dropDown = new Select(timeOption);
        List<WebElement> e = dropDown.getOptions();
        int itemCount = e.size();

        for (int l = 0; l < itemCount; l++) {
            System.out.println(e.get(l).getText());
        }
    }

    public List listServices() {
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(servicesList, "div");
        return actual;
    }
    public void printTravelLinks() {
        travelLink();
        List<WebElement> element = driver.findElements(By.tagName("a"));
        System.out.println(element.size());
        for (WebElement e : element) {
            System.out.println(e.getText() + " - " + e.getAttribute("href"));
        }
    }
}

