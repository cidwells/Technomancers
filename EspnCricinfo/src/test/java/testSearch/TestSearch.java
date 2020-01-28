package testSearch;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//a[@name='&lpos=cricket:feed:13:coll:headlines:1']")).click();
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.xpath("//h2[contains(text(),'U-19 WC')]")).click();
        Thread.sleep(3000);
    }



}
