package footer;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JoinTheNewsletter extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Join the Newsletter!')]")
    WebElement joinTheNewsletter;
    @FindBy(how = How.XPATH,using = "//input[@id='firstName']")
    WebElement inputFirstName;
    @FindBy(how = How.XPATH,using = "//input[@id='lastName']")
    WebElement inputLastName;
    @FindBy(how = How.XPATH,using = "//input[@id='email']")
    WebElement inputEmail;
    @FindBy(how = How.XPATH,using = "//div[@class='btn btn-primary btn-lg btn-join']")
    WebElement hitJoin;

    public void clickJoinTheNewsletter(){
        joinTheNewsletter.click();
    }
    public void typeFirstName(){
        inputFirstName.sendKeys("Mahnoor");
    }
    public void typeLastName(){
        inputLastName.sendKeys("Afsheen");
    }
    public void typeEmail(){
        inputEmail.sendKeys("rajib177@yahoo.com");
    }
    public void clickJoin(){
        hitJoin.click();
    }
}
