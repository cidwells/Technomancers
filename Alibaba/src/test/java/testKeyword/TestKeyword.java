package testKeyword;

import base.CommonAPI;
import keyword.KeywordFunction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeyword extends CommonAPI {

    @Test
    public void testKeyWord()throws InterruptedException, IOException {
        KeywordFunction keywordFunction = PageFactory.initElements(driver, KeywordFunction.class);
        keywordFunction.selectFeatures(driver);
    }
}
