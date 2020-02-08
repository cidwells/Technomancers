package keyword;

import base.CommonAPI;
import categories.Categories;
import login.Login;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import search.Search;

import java.io.IOException;

public class KeywordFunction extends KeywordDataReader {

    Login login = PageFactory.initElements(driver, Login.class);
    Search search = PageFactory.initElements(driver, Search.class);
    Categories categories = PageFactory.initElements(driver, Categories.class);

    public void loginAgain() {
        login.loginAlibaba();
    }

    public void checkMessage() {
        login.clickMessageCenterWebElement();
    }

    public void searchComputer() {
        search.runSearchText();
    }

    public void clickAllCategories() {
        categories.clickAllCategoriesSwitchTab();
    }
    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "clickAllCategories":
                clickAllCategories();
                break;
            case "searchComputer":
                searchComputer();
                break;
            case "loginAgain":
                loginAgain();
                break;
            case "checkMessage":
                checkMessage();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1) throws IOException, InterruptedException {
        KeywordFunction keywordFunction = new KeywordFunction();
        String[] testSteps = keywordFunction.getDataFromExcelFile();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}