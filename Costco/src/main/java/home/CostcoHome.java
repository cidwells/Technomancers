package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CostcoHome extends CommonAPI {

    //CostcoLogo
    @FindBy(css="div[class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']")
    WebElement  costcoLogo;

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

    @FindBy(id="shop-mt-mobile")
    WebElement  shopDropDown;

    //Find a WareHouse
    @FindBy(id="warehouse-locations-dropdown")
    WebElement wareHouseDropDown;

    @FindBy(css = "input[id='warehouse-search-field-desktop']")
    WebElement   wareHouseTextBoxSearch;

    @FindBy (css="input[id='hasGas-desktop']")
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
    WebElement   usDropDown;

    @FindBy(css="div[id='country-select-popover-container']")
    WebElement countryList;

    //Method
    public void printCountryList(){
     usDropDown.click();
     getTextFromWebElements("li[id='country_dropdown']");
        System.out.println(getTextFromWebElements("li[id='country_dropdown']"));



    }

    public void selectAllDropDown(String str){
        Select dropDown = new Select(selectAllDropDown);
        dropDown.selectByIndex(1);
        searchTextBox.sendKeys(str,Keys.ENTER);

    }
    public void costcoLogo(){
        costcoLogo.click();
    }
    public void makeSearch(String str) {
        searchTextBox.sendKeys(str);
        searchBtn.click();
    }
    public void clickLocations() {
        locationsLink.click();
    }
    public void findLocation() {
        locationsLink.click();
        findLocationTextBox.sendKeys("11223",Keys.ENTER);

    }
    public void wareHouseLocations(){
        wareHouseDropDown.click();
        wareHouseTextBoxSearch.sendKeys("11223");
        gasStationcheckBox.click();
        findlocationBn.click();
    }
    public void mouseHoverOpticallink(){
    mouseHoverByCSS("a[id='Home_Ancillary_2']");
    opticalLink.click();
    }
    public void mouseHovertravelLink() {
        mouseHoverByCSS("a[id='Home_Ancillary_6']");
        travelLink.click();
    }
}

