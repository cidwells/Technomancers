package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

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

    public void arraySearchBarTest () {
        System.out.println(driver.getTitle());
        List<String> list = getItems();
        for(int i=0; i<list.size(); i++){
         //  clickOnElement("SearchText" );
            typeOnElement(".ui-searchbar-keyword",list.get(i));
            clickOnElement(".ui-searchbar-submit");
            clickOnElement(".ui-searchbar-keyword" );
            clearField(".ui-searchbar-keyword");
        }
   }

   public List<String> getItems(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("bike");
        itemsList.add("chain");
        itemsList.add("candy");
        itemsList.add("nike shoes");

        return itemsList;

    }

}