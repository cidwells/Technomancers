package footerTest;

import footer.Help;
import home.RottentomatoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HelpTest extends RottentomatoHome {

    @Test
    public void clickHelpBtn(){
        Help help = PageFactory.initElements(driver,Help.class);
        help.clickHelp();
    }

}
