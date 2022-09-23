package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C02_Actions extends TestBaseBeforeAfter {
    @Test
    public void test1() {
       // 1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        // 2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
       // 3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        Actions actions = new Actions(driver);
        WebElement isim = driver.findElement(By.xpath("//*[@class='inputtext _58mg _5dba _2ph-']"));
        isim.sendKeys("Nihat");
        actions.sendKeys(Keys.TAB).sendKeys("KIZILKULA").
                sendKeys(Keys.TAB).sendKeys("nht.4425@gmail.com").
                sendKeys(Keys.TAB).sendKeys("147758").sendKeys(Keys.TAB).sendKeys("147758").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("20").sendKeys(Keys.TAB).sendKeys("Tem").sendKeys(Keys.TAB).sendKeys("1985").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.RIGHT).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

       // 4- Kaydol tusuna basalim
    }
}
