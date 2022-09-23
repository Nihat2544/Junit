package alıstirma;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBaseBeforeAfter;

import java.time.Duration;

public class Day12Odev2 extends TestBaseBeforeAfter {
    @Test
    public void test() {
       // 1 "http://webdriveruniversity.com/IFrame/index.html" sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");
       // 2 "Our Products" butonuna basin
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement our = driver.findElement(By.xpath("//*[text()='Our Products']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(our).perform();
         */
        driver.findElement(By.xpath("//*[text()='Our Products']")).click();

       // "Cameras product"i tiklayin
       // Popup mesajini yazdirin
       // "close" butonuna basin
       // "WebdriverUniversity.com (IFrame)" linkini tiklayin
       // "http://webdriveruniversity.com/index.html" adresine gittigini test edin
    }
}
