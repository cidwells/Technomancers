package testPageInfo;

import home.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageinfo.PageInfo;

public class TestPageInfo extends PageInfo {
    @Test
    public void allCategoriesWebElements(){
        PageInfo pageInfo = PageFactory.initElements(driver, PageInfo.class);
        pageInfo.listAllCategoriesWebElements();
    }
}
