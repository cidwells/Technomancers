package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FollowUs extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[@id='footer-follow-us-facebook']")
    WebElement followOnFacebook;
    @FindBy(how = How.XPATH,using = "//input[@id='email']")
    WebElement giveEmailOrPhone;
    @FindBy(how = How.XPATH,using = "//input[@id='pass']")
    WebElement givePassword;
    @FindBy(css = "a[id='movieMenu']")
    WebElement movieMenu;

    public void followByFacebook() {
        followOnFacebook.click();
    }
    public void signIn(String email, String password){
        giveEmailOrPhone.sendKeys(email);
        givePassword.sendKeys(password);
    }
    public void mouseHoverOnMovieMenu(){
        mouseHoverByCSS("a[id='movieMenu']");
    }

}