package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class Odev2 extends TestBaseBeforeAfter {
    @Test
    public void name() {
       // https://html.com/tags/iframe/ sayfasina gidelim
       driver.get("https://html.com/tags/iframe/");
       // 3- video’yu gorecek kadar asagi inin
       // videoyu izlemek icin Play tusuna basin
        WebElement video = driver.findElement(By.xpath("//*[@class='site-header clearfix']"));
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
       // videoyu calistirdiginizi test edin
        WebElement videok = driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(videok);
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();
    }
}
