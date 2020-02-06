package home;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WarHouse extends CommonAPI {

    //WebElements
    @FindBy(css="[id='warehouse-locations-dropdown']")
    WebElement    warHouseLink;

    @FindBy(css = "[id='warehouse-search-field-desktop']")
    WebElement  warhouseTextBox;

    @FindBy(xpath = "//*[@id=\"warehouse_locator_search-desktop\"]/input[8]")
    WebElement   findLocationBtn;





    //Methods
    public void mouseHover() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(warHouseLink).perform();
        Thread.sleep(8000);
    }
}
