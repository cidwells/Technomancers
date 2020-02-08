package search;

import base.CommonAPI;
import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    @FindBy(how = How.CSS, using = ".ui-searchbar-main")
    private static WebElement mainSearchBarWebElement;
   @FindBy(how = How.CSS, using = ".ui-searchbar-keyword")
    private static WebElement enterInSearchBarWebElement;
   @FindBy(how = How.CSS, using = ".ui-searchbar-submit")
    private static WebElement submitButtonWebElement;
   @FindBy(how = How.CSS, using = "div.cpv-refine-filter-item__wrapper:nth-child(3) > a:nth-child(1) > div:nth-child(2)")
    private static WebElement bluetoothFilterWebElement;
   @FindBy(how = How.LINK_TEXT, using = "i12 touch with pop up window")
    private static WebElement firstBluetoothItemWebElement;
   @FindBy(how = How.CSS, using = "div.sku-attr-val-item:nth-child(1) > div:nth-child(3) > div:nth-child(1) > input:nth-child(2)")
    private static WebElement firstQuantityInputWebElement;
   @FindBy(how = How.CSS, using = "button[class='action-button-std action-start-order']")
    private static WebElement addToCartButtonWebElement;
   public static WebElement getMainSearchBar() {
        return mainSearchBarWebElement;
    }

    public static WebElement getEnterInSearchBarWebElement(){
        return enterInSearchBarWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public static WebElement getBluetoothFilterWebElement() {
        return bluetoothFilterWebElement;
    }

    public static WebElement getFirstBluetoothItemWebElement() {
        return firstBluetoothItemWebElement;
    }

    public static WebElement getFirstQuantityInputWebElement() {
        return firstQuantityInputWebElement;
    }

    public static WebElement getAddToCartButtonWebElement() {
        return addToCartButtonWebElement;
    }

    public void runSearchText() {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("Computer");
        getSubmitButtonWebElement().click();
    }

    public void arraySearchBarTest () {
        System.out.println(driver.getTitle());
        List<String> list = getItems();
        for(int i=0; i<list.size(); i++){
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
        return itemsList;
   }

    public void runSpecificSearch() throws InterruptedException {
        getMainSearchBar().click();
        getEnterInSearchBarWebElement().sendKeys("earbuds");
        getSubmitButtonWebElement().click();
        getBluetoothFilterWebElement().click();
        getFirstBluetoothItemWebElement().click();
        handleNewTab(driver);
        getFirstQuantityInputWebElement().clear();
        getFirstQuantityInputWebElement().sendKeys("5");
        getFirstQuantityInputWebElement().sendKeys(Keys.ENTER);
       getAddToCartButtonWebElement().click();
    }

    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("search", "item");
        return list;
   }
    public void dbSearchBarTest () throws Exception {
        System.out.println(driver.getTitle());
        List<String> list = itemFromDb();
        for (int i = 0; i < list.size(); i++) {
            typeOnElement(".ui-searchbar-keyword", list.get(i));
            clickOnElement(".ui-searchbar-submit");
            clickOnElement(".ui-searchbar-keyword");
            clearField(".ui-searchbar-keyword");
        }
    }
    public static List<String> itemFromDb ()throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("search", "item");
        return list;
    }
    public void knickKnack(){
        ArrayList<String> knickKnackList = new ArrayList<String>();
        knickKnackList.add("keychain");
        knickKnackList.add("music box");
        // List<String> blist = knickKnackList;
        ConnectToSqlDB.insertStringDataFromArrayListToSqlTableUsingArray(knickKnackList,"knickKnack","item");
    }

    public static void main(String[] args) {
        ArrayList<String> knickKnackList = new ArrayList<String>();
        knickKnackList.add("keychain");
        knickKnackList.add("music box");

       // List<String> blist = knickKnackList;
        ConnectToSqlDB.insertStringDataFromArrayListToSqlTableUsingArray(knickKnackList,"knickKnack","item");
    }

}