package testSearch;

import base.CommonAPI;
import home.AlibabaHome;
import home.AlibabaSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends AlibabaSearch {

    @Test (enabled = false)
    public void searchBar() throws InterruptedException {
        AlibabaSearch alibabaSearch = PageFactory.initElements(driver, AlibabaSearch.class);
        alibabaSearch.runSearchText();
    }
    @Test
    public void searchBarUsingArray() throws InterruptedException {
        AlibabaSearch alibabaSearch = PageFactory.initElements(driver, AlibabaSearch.class);
        alibabaSearch.arraySearchBarTest();
    }




}
