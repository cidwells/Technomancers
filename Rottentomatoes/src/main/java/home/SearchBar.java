package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchBar extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//input[@id='fullscreen-search-term']")
    WebElement searchItems;
    @FindBy(how = How.XPATH,using = "//button[@id='fullscreen-search-desktop-search-btn']")
    WebElement clickSearch;

    public void searchMovies(String item) throws InterruptedException {
        searchItems.sendKeys(item);
        Thread.sleep(3000);
        clickSearch.click();
    }
}