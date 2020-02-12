package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Search extends CommonAPI {

    //CostcoLogo
    @FindBy(css = "div[class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']")
    WebElement costcoLogo;

    //Make Search
    @FindBy(css = "input[id='search-field']")
    WebElement searchTextBox;

    @FindBy(xpath = "//button[@class='btn search-ico-button' and @type='button']")
    WebElement searchBtn;

    //LocationsLink
    @FindBy(xpath = "//a[text()='Locations']")
    WebElement locationsLink;

    //Find a Location
    @FindBy(css = "input[id='search-warehouse']")
    WebElement findLocationTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary'and @alt='Find']")
    WebElement findBtn;

    @FindBy(id = "shop-mt-mobile")
    WebElement shopDropDown;

    //Find a WareHouse
    @FindBy(id = "warehouse-locations-dropdown")
    WebElement wareHouseDropDown;

    @FindBy(css = "input[id='warehouse-search-field-desktop']")
    WebElement wareHouseTextBoxSearch;

    @FindBy(css = "input[id='hasGas-desktop']")
    WebElement gasStationcheckBox;

    @FindBy(xpath = "//*[@id=\"warehouse_locator_search-desktop\"]/input[8]")
    WebElement findlocationBn;

    @FindBy(css = "a[id='Home_Ancillary_2']")
    WebElement opticalLink;

    @FindBy(css = "a[id='Home_Ancillary_6']")
    WebElement travelLink;
    @FindBy(id = "search-dropdown-select")
    WebElement selectAllDropDown;

    @FindBy(css = "li[id='country_dropdown']")
    WebElement usDropDown;

    @FindBy(css = "div[id='country-select-popover-container']")
    WebElement countryList;

    @FindBy(css = "[id='warehouse-locations-dropdown']")
    WebElement warHouseLink;

    @FindBy(css = "[id='warehouse-search-field-desktop']")
    WebElement warhouseTextBox;

    @FindBy(xpath = "//*[@id=\"warehouse_locator_search-desktop\"]/input[8]")
    WebElement findLocationBtn;

    @FindBy(xpath = "//div[@role='tooltip']")
    WebElement opticalAllOptions;

    @FindBy(xpath = "//a[text()='View Warehouse Savings']")
    WebElement warHouseSaving;
    @FindBy(id = "email-signup-dropdown")
    WebElement emailOffers;
    @FindBy(css = "[id='header_emailSignUpEmail']")
    WebElement signUpOffersEmail;

    @FindBy(css = "[id='Home_Ancillary_7']")
    WebElement memberShip;

    @FindBy(id = "navigation-widget")
    WebElement navigationBarItems;

    @FindBy(id = "customer-service-link")
    WebElement costomerServiceLink;

    @FindBy(xpath = "//input[@id='rn_SourceSearchField_9_SearchInput']")
    WebElement customerServiceSearchInput;

    @FindBy(css = "[id='delivery-postal-change']")
    WebElement changeDeliveryZipCode;

    @FindBy(css = "[id='Home_Ancillary_3']")
    WebElement pharmacyLink;

    @FindBy(id = "fill-new-prescription-button")
    WebElement newPrescriptionBtn;

    @FindBy(css = "[id='prescription-status']")
    WebElement prescriptionStatus;

    @FindBy(css = "[id='transfer-from-warehouse']")
    WebElement transferWarHouse;

    @FindBy(css = "[id='search-field']")
    WebElement searchMedicationTextBox;

    @FindBy(css = "[id='Home_Ancillary_0']")
    WebElement groceryOption;

    @FindBy(linkText = "Organic")
    WebElement organicLink;

    @FindBy(linkText = "Snacks & Candy")
    WebElement candy;

    @FindBy(css = "[id='warehouse-locations-dropdown']")
    WebElement  findlocationTexField;

    @FindBy(xpath = "//*[@id=\"warehouse-locations-dropdown\"]")
    WebElement   findWarhouseSEarchBar;

//    Methods
     public void costcoLogoRightClick() {
        Actions builder = new Actions(driver);
        builder.contextClick(costcoLogo).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    }

     public void snacks() {
        mouseHover(groceryOption);
        candy.click();

    }

     public void organic() {
        mouseHover(groceryOption);
        organicLink.click();

     }

    public void searchMedication() {
        pharmacyLink.click();
        searchMedicationTextBox.sendKeys("Advil", Keys.ENTER);
    }

    public void transerWarhouse() {
        pharmacyLink.click();
        transferWarHouse.click();
    }

    public void prescriptionStatus() {
        pharmacyLink.click();
        prescriptionStatus.click();
    }

    public void changeDEliveryZipCode() {
        mouseHover(changeDeliveryZipCode);
    }

    public void fillNewPrescription() {
        pharmacyLink.click();
        newPrescriptionBtn.click();
    }

    public void customerService() {
        costomerServiceLink.click();
        customerServiceSearchInput.sendKeys("return order", Keys.ENTER);
    }

    public List barItems() {
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(navigationBarItems, "a");
        return actual;
    }


    public void memeberShip() {
        mouseHover(memberShip);
    }

    public void getEmailOffers() {
        mouseHover(emailOffers);
        signUpOffersEmail.sendKeys("malikaamiali82@gmail.com", Keys.ENTER);
    }

    public void warHouseSaving() {
        warHouseSaving.click();
    }

    public void opticalMouseHover() {
        mouseHover(opticalLink);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public List getOpticalOptions() {
        List<String> actual = new ArrayList<>();
        actual = getAllElementOptions(opticalAllOptions, "a");
        return actual;
    }

    public void mouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(warHouseLink).perform();
    }

    public void printCountryList() {
        usDropDown.click();
        getTextFromWebElements("li[id='country_dropdown']");
        System.out.println(getTextFromWebElements("li[id='country_dropdown']"));

    }

    public void selectAllDropDown() {
        Select dropDown = new Select(selectAllDropDown);
        dropDown.selectByIndex(1);
        searchTextBox.sendKeys("cheese", Keys.ENTER);
    }

    public void costcoLogo() {
        costcoLogo.click();
    }

    public void makeSearch() {
        searchTextBox.sendKeys("computer");
        searchBtn.click();
    }

    public void clickLocations() {
        locationsLink.click();
    }

    public void findLocation() {
        locationsLink.click();
        findLocationTextBox.sendKeys("11223");
        findLocationTextBox.sendKeys(Keys.ENTER);
    }

    public void wareHouseLocations() {
        wareHouseDropDown.click();
        wareHouseTextBoxSearch.sendKeys("11223");
        gasStationcheckBox.click();
        findlocationBn.click();
    }

    public void mouseHoverOpticallink() {
        mouseHoverByCSS("a[id='Home_Ancillary_2']");
        opticalLink.click();
    }

    public void mouseHovertravelLink() {
        mouseHoverByCSS("a[id='Home_Ancillary_6']");
        travelLink.click();
    }

    public void searchtextBoxSize() {
        int wdth = searchTextBox.getSize().getWidth();
        int high = searchTextBox.getSize().getHeight();
        System.out.println(" the size of the search text box is:" + " " + high + " " + "x" + " " + wdth);
    }
}
