package pageinfo;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageInfo extends CommonAPI {
    @FindBy(how = How.CSS, using = ".ui-searchbar-main")
    private static WebElement mainSearchBarWebElement;
    @FindBy(how = How.XPATH, using = "//a[@class='category-item vmore-link']")
    private static WebElement allCategoriesWebElement;

    public void listAllCategoriesWebElements(){
        System.out.println(getAllElementOptions(allCategoriesWebElement,"a"));
    }
}
