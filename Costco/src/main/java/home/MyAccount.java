package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyAccount extends CommonAPI {

    SignIn signIn;

    //PageFactory
    public void accessSignIn() {
        this.signIn = PageFactory.initElements(driver, SignIn.class);
    }

    //WEbElements
    @FindBy(id = "myaccount-d")
    WebElement myaccountLik;

    @FindBy(css = "[id='edit-email']")
    WebElement editEmailLink;

    @FindBy(linkText = "Account Details")
    WebElement acountDetails;

    @FindBy(xpath = "//*[@id=\"password-box-field\"]/div[1]/a\t\t\t")
    WebElement editPasswordLink;

    @FindBy(linkText = "Preferences")
    WebElement preferencesLink;

    @FindBy(linkText = "Lists")
    WebElement listsLink;

    @FindBy(id = "creatediv")
    WebElement createNewListLink;

    @FindBy(css = "[id='listidname']")
    WebElement newListTextBx;

    @FindBy(linkText = "My Orders")
    WebElement myOrderLink;

    @FindBy(xpath = "//a[text()='Costco Pay']")
    WebElement costcoPayLink;

    @FindBy(linkText = "Payment Methods")
    WebElement  paymentMethodLink;

    @FindBy(linkText = "Address Book")
    WebElement  addressBookLink;

    @FindBy(xpath = "//*[@id=\"shippingTab\"]/a/h6")
    WebElement  shippingBtn;

    @FindBy(id = "billingTab")
    WebElement  billingLink;

    @FindBy(css = "[class='add-new-address text-center']")
    WebElement  addNewAddress;

    @FindBy(linkText = "Renew Membership")
    WebElement   renewMemberShip;

    @FindBy(linkText = "Join Costco today!")
    WebElement joinCostcoLink;

    @FindBy(linkText = "verify your membership online")
    WebElement  autoREnewalLink;

    @FindBy(xpath = "//*[@id=\"footer-widget\"]/div[1]/div[1]/div/div[4]/ul/li[1]/a/i")
    WebElement   faceBookIcon;

    @FindBy(xpath = "//*[@id=\"footer-widget\"]/div[1]/div[1]/div/div[4]/ul/li[2]/a/i")
    WebElement pinteresIcon;

    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @FindBy(id = "navigation-dropdown")
    WebElement shopAllDepartmentsLink;

    @FindBy(id = "level2-all-departments")
    WebElement  comptureOptions;

    //   Methods

    public void getIntoComputer(){
        mouseHover(shopAllDepartmentsLink);
        mouseHover(computersLink);
    }

    public void followOnFaceeBook(){
        getInToMyAccountDetails();
        renewMemberShip.click();
        faceBookIcon.click();
    }
    public void myAcount() {
        accessSignIn();
//        signIn.singnin();
    }

    public void myAccounHover() {
        myAcount();
        mouseHover(myaccountLik);
    }

    public void getInToMyAccountDetails() {
        myAcount();
        myaccountLik.click();
        acountDetails.click();
    }

    public void editEmail() {
        getInToMyAccountDetails();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        editEmailLink.click();
    }

    public void editPassword() {
        getInToMyAccountDetails();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        editPasswordLink.click();
    }

    public void preferences() {
        getInToMyAccountDetails();
        preferencesLink.click();
    }

    public void lists() {
        getInToMyAccountDetails();
        listsLink.click();
    }

    public void createNewList() {
        lists();
        createNewListLink.click();
        newListTextBx.sendKeys("meli");
    }

    public void myOrderHistory() {
        getInToMyAccountDetails();
        myOrderLink.click();
    }

    public void costcoPay() {
        getInToMyAccountDetails();
        costcoPayLink.click();
    }
    public void payment(){
        getInToMyAccountDetails();
        paymentMethodLink.click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    public void addressBook(){
        getInToMyAccountDetails();
        addressBookLink.click();

    }
    public void shipping(){
        getInToMyAccountDetails();
      addressBookLink.click();
        shippingBtn.isSelected();
    }
    public void billing(){
      addressBook();
        billingLink.isSelected();
    }
    public void newAdress(){
        getInToMyAccountDetails();
        addressBookLink.click();
       addNewAddress.click();
    }
    public void membershipRenewal(){
        getInToMyAccountDetails();
        renewMemberShip.click();
    }
    public void joinCostco(){
        getInToMyAccountDetails();
        renewMemberShip.click();
        joinCostcoLink.click();
    }
    public void autoRenewl(){
       membershipRenewal();
       autoREnewalLink.click();

    }
    public void followOnPinterest() {
        getInToMyAccountDetails();
        renewMemberShip.click();
        pinteresIcon.click();
    }

    public List computerOptions(){
        mouseHover(shopAllDepartmentsLink);
        mouseHover(computersLink);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            List<String> actual = new ArrayList<>();
            actual = getAllElementOptions(comptureOptions, "div");
            return actual;
        }


}