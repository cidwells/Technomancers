package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlibabaSearch extends CommonAPI {

   @FindBy(how = How.CSS, using = ".ui-searchbar-main")
    private static WebElement mainSearchBarWebElement;
   @FindBy(how = How.CSS, using = ".ui-searchbar-keyword")
    private static WebElement enterInSearchBarWebElement;
   @FindBy(how = How.CSS, using = ".ui-searchbar-submit")
    private static WebElement submitButtonWebElement;

   public static WebElement getMainSearchBar() {
        return mainSearchBarWebElement;
    }

    public static WebElement getEnterInSearchBarWebElement(){
        return enterInSearchBarWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void runSearchText() throws InterruptedException {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Computer");
        getSubmitButtonWebElement().click();
    }
}