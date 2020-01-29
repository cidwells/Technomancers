package testSearch;

import base.CommonAPI;
import home.AlibabaSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {



   // @Test
    public void clickLink() throws InterruptedException {
        driver.findElement(By.cssSelector("a[title='Home & Kitchen']")).click();
        driver.findElement(By.cssSelector("a[title='Tools & Hardware']")).click();
        driver.findElement(By.cssSelector("a[title='Rubber & Plastics']")).click();
        driver.findElement(By.cssSelector("a[title='Electrical Equipment & Supplies']")).click();
        driver.findElement(By.cssSelector("a[title='Vehicles & Accessories']")).click();
        driver.findElement(By.cssSelector("a[title='Consumer Electronics']")).click();
        driver.findElement(By.cssSelector("a[title='Apparel']")).click();
        Thread.sleep(5000);
    }




}
